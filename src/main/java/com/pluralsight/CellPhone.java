package com.pluralsight;

public class CellPhone {
    private int serialNum;
    private String model;
    private String carrier;
    private String phoneNum;
    private String owner;

    // constructor
    public CellPhone() {
        this.serialNum = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNum = "";
        this.owner = "";
    }

    // All 5 parameters
    public CellPhone(int serialNum, String model, String carrier, String phoneNum, String owner) {
        this.serialNum = serialNum;
        this.model = model;
        this.carrier = carrier;
        this.phoneNum = phoneNum;
        this.owner = owner;
    }

    // 4 parameters
    public CellPhone(int serialNum, String model, String carrier, String phoneNum) {
        this.serialNum = serialNum;
        this.model = model;
        this.carrier = carrier;
        this.phoneNum = phoneNum;
    }

    // 3 parameters
    public CellPhone(int serialNum, String model, String carrier) {
        this.serialNum = serialNum;
        this.model = model;
        this.carrier = carrier;
    }

    // 2 parameters
    public CellPhone(int serialNum, String model) {
        this.serialNum = serialNum;
        this.model = model;
    }

    // individual parameters
    public CellPhone(int serialNum) {
        this.serialNum = serialNum;
    }

    public CellPhone(String model) {
        this.model = model;
    }

    // Getter and Setter
    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void dial(String number) {
        System.out.println(this.owner + "'s phone is calling " + number);
    }
}
