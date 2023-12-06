package org.sensorDataCollection;
import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedWriter;
import java.io.IOException;
@Service
@RestController
@SpringBootApplication
public class SensorDataCollection
//        implements HttpFunction
{
//@Override
//public void service(HttpRequest request, HttpResponse response)
//        throws IOException {
//    BufferedWriter writer = response.getWriter();
//    writer.write("Hello World!");
//}
    public static void main(String[] args) {
        SpringApplication.run(SensorDataCollection.class, args);
    }
}