package com.example.myapplication;


import android.os.Message;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class ChatGroup implements Serializable {

    private int id;
    private String mName;
    private List<String> mParticipants;
    //private List<Message> mMessages;

    public ChatGroup(int Id, String name, List<String> participants) {
        id = Id;
        mName = name;
        mParticipants = participants;
       // mMessages = new ArrayList<>();


    }

    public ChatGroup(String name, List<String> messages, LocalDate date) {
        mName = name;
        List<String> mMessages = messages;
        LocalDate mDate = date;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public List<String> getParticipants() {
        return mParticipants;
    }

    public void setParticipants(List<String> participants) {
        mParticipants = participants;
    }


    public Message[] getMessages() {
        return new Message[0];
    }


}
