package org.sensorDataCollection.controller;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import org.sensorDataCollection.entity.sensorData;
import org.sensorDataCollection.service.storeSensorData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class sensorDataCollector {
    @Autowired
    private storeSensorData  storesensordata;
    @GetMapping("/postData")
    public ResponseEntity<Object> storeData(@RequestParam  Map<String,String> queryParams){


        String deviceID  = queryParams.get("unit_id");
        String ammoniaValue = queryParams.get("value");

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime timestamp = LocalDateTime.now();
        LocalTime truncatedTime = time.truncatedTo(ChronoUnit.SECONDS);
        String formattedDate = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String formattedTime = truncatedTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        String formattedTimeStamp = timestamp.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        System.out.println(time);
        sensorData sensor_data = new sensorData();
        sensor_data.setDate(formattedDate);
        sensor_data.setAmmoniaValue(ammoniaValue);
        sensor_data.setTime(formattedTime);
        sensor_data.setDeviceID(deviceID);
        sensor_data.setTimestamp(formattedTimeStamp);
        storesensordata.saveData(sensor_data);

//        String formattedDate = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
//        String formattedTime = time.format(DateTimeFormatter.ISO_LOCAL_TIME);

        return new ResponseEntity<>(sensor_data, HttpStatus.OK);
    }

}
