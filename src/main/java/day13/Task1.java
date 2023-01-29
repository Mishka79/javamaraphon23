package day13;

import static day13.MessageDatabase.addNewMessage;
import static day13.MessageDatabase.showDialog;

public class Task1 {
    public static void main(String[] args) {
    User user1 = new User("Vasya");
    User user2 = new User("Ivan");
    User user3 = new User("Anna");
    addNewMessage(user1,user2,"Hello!");
    addNewMessage(user1,user2,"How are you?");
    addNewMessage(user2,user1,"Hello.");
    addNewMessage(user2,user1,"I am ill");
    addNewMessage(user2,user1,"Are you ready to race?");
    addNewMessage(user3,user1,"Helloooooo");
    addNewMessage(user3,user1,"We are the chempion!!!");
    addNewMessage(user3,user1,"I am in Goa");
    addNewMessage(user1,user3,"I am too in Goa");
    addNewMessage(user1,user3,"Hello");
    addNewMessage(user1,user3,"Bye");
    addNewMessage(user3,user1,"Bye");
    showDialog(user1,user3);


    }
}
