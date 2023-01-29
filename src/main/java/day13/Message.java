package day13;

import java.util.Date;

public class Message {
    private User sender;
    private User reciver;
    private String text;
    Date date;

    public Message(User sender, User reciver, String text) {
        this.sender = sender;
        this.reciver = reciver;
        this.text = text;
        this.date=new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReciver() {
        return reciver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return
                "FROM:" + sender +
                ", \n TO:" + reciver +
                ", \n ON" + date.toString() +
                "\n" + text ;
    }
}
