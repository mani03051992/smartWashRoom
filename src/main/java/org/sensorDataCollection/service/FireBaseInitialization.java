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
//            String cred = System.getenv("GOOGLE_APPLICATION_CREDENTIALS");
//"Changes here"
            // Get the application credentials from the environment variable.
            GoogleCredentials credentials = GoogleCredentials.getApplicationDefault();

//            FileInputStream serviceAccount = new FileInputStream("/src/main/resources/serviceAccountKey.json");
            System.out.println("read credentials_2");
//            FileInputStream serviceAccount = new FileInputStream( cred );
            FirebaseOptions options = new FirebaseOptions.Builder()
//                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setProjectId("smarttoilet-f2f7f")
                    .setCredentials(credentials)
                    .build();
//            SecretManagerServiceClient secretManagerServiceClient = SecretManagerServiceClient.create();
//            SecretVersionName secretVersionName = SecretVersionName.of("my-firebase-options-secret", "latest");
//            ByteString secretBytes = secretManagerServiceClient.getSecretVersion(secretVersionName).getPayload().getData();
//            String secretString = secretBytes.toStringUtf8();
//            FirebaseOptions firebaseOptions = FirebaseOptions.fromServiceAccount(secretString);
//           System.out.println(options.getProjectId());
//            SecretManagerServiceClient secretManagerServiceClient = SecretManagerServiceClient.create();
//
//            // Get the secret version containing the FirebaseOptions JSON file.
//            SecretVersionName secretVersionName = SecretVersionName.of("smarttoilet-f2f7f", "smartToiletSecret", "latest");
//            AccessSecretVersionResponse secretBytes = secretManagerServiceClient.accessSecretVersion(secretVersionName);
//
//            // Deserialize the JSON file into a FirebaseOptions object.
//            String secretString = secretBytes.getPayload().getData().toStringUtf8();
//            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//            byteArrayOutputStream.write(secretString.getBytes());
//             FileInputStream serviceAccount = new FileInputStream(Arrays.toString(byteArrayOutputStream.toByteArray()));
//            FirebaseOptions options = new FirebaseOptions.Builder()
//                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//                    .build();

            FirebaseApp.initializeApp(options);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
