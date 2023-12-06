package org.sensorDataCollection.entity;


import java.util.Date;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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

    public Date date;

    public String getFormattedDate() {
        return formattedDate;
    }

    public void setFormattedDate(String formattedDate) {
        this.formattedDate = formattedDate;
    }

    public String formattedDate;

    public String time;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String timestamp;
}
