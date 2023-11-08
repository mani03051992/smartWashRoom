package org.sensorDataCollection.service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.sensorDataCollection.entity.sensorData;
import org.springframework.stereotype.Service;

@Service
public class storeSensorData {
    public void saveData(sensorData data){
        Firestore dbFireStore = FirestoreClient.getFirestore();
      ApiFuture<WriteResult>  collectionAPIFuture= dbFireStore.collection("sensorData").document(data.getTimestamp()).set(data);
    }
}
