package org.sensorDataCollection.controller;
import com.google.cloud.firestore.FieldValue;
import org.sensorDataCollection.entity.sensorData;
import org.sensorDataCollection.service.storeSensorData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

@RestController
@RequestMapping("/api")
public class sensorDataCollector {
    @Autowired
    private storeSensorData storesensordata;
    @GetMapping("/postData")
    public ResponseEntity<Object> storeData(@RequestParam  Map<String,String> queryParams){


        String deviceID  = queryParams.get("unit_id");
        String ammoniaValue = queryParams.get("value");
//        LocalDateTime date = LocalDateTime.now();
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        timeFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
//        System.out.println(dateFormat.format(date));
//        LocalTime time = LocalTime.now();

        LocalDateTime timestamp = LocalDateTime.now();
//        LocalTime truncatedTime = time.truncatedTo(ChronoUnit.SECONDS);
////        Date formattedDate = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
//        String formattedTime = truncatedTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        String formattedTimeStamp = timestamp.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

//        System.out.println(time);
        sensorData sensor_data = new sensorData();
        sensor_data.setDate(date);
        sensor_data.setFormattedDate(dateFormat.format(date));
        sensor_data.setAmmoniaValue(ammoniaValue);
        sensor_data.setTime(timeFormat.format(date));
        sensor_data.setDeviceID(deviceID);
        sensor_data.setTimestamp(formattedTimeStamp);
        storesensordata.saveData(sensor_data);


        return new ResponseEntity<>(sensor_data, HttpStatus.OK);
    }

}
