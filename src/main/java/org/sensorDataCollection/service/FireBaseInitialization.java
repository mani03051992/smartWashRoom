package org.sensorDataCollection.service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Service
public class FireBaseInitialization {

    @PostConstruct
    public void initialize() throws IOException {
        try {
            // Get the application credentials from the environment variable.
            GoogleCredentials credentials = GoogleCredentials.getApplicationDefault();

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setProjectId("smarttoilet-f2f7f")
                    .setCredentials(credentials)
                    .build();
            FirebaseApp.initializeApp(options);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }
}
