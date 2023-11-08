package org.sensorDataCollection.entity;

import java.time.LocalDateTime;

public class sensorData {
    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getAmmoniaValue() {
        return ammoniaValue;
    }

    public void setAmmoniaValue(String ammoniaValue) {
        this.ammoniaValue = ammoniaValue;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String deviceID;
    public String ammoniaValue;

    public String date;

    public String time;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String timestamp;
}
