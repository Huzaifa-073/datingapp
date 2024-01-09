package com.example.dating;

public class MessagesModel {

    private int personImage;
    private String personName;
    private String personMessage;
    private String personTime;


    public MessagesModel(int personImage, String personName, String personMessage, String personTime) {
        this.personImage = personImage;
        this.personName = personName;
        this.personMessage = personMessage;
        this.personTime = personTime;
    }

    public int getPersonImage() {
        return personImage;
    }

    public void setPersonImage(int personImage) {
        this.personImage = personImage;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonMessage() {
        return personMessage;
    }

    public void setPersonMessage(String personMessage) {
        this.personMessage = personMessage;
    }

    public String getPersonTime() {
        return personTime;
    }

    public void setPersonTime(String personTime) {
        this.personTime = personTime;
    }
}