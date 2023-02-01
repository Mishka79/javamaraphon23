package day13;

import java.util.ArrayList;
import java.util.List;

import static day13.MessageDatabase.addNewMessage;

public class User {
    private String username;
    private List<User> subscription;

    public User(String username) {
        this.username = username;
        this.subscription=new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscription;
    }

    public void subscribe(User user) {
        this.subscription.add(user);
    }
    public boolean isSubscribed(User user){
       return this.subscription.contains(user);}


    public boolean isFriend (User user){
        if (this.isSubscribed(user) && user.isSubscribed(this)){return true;}
        else {return false;}
    }
    public void sendMessage(User user,String text){

        addNewMessage(this,user,text);
    }

    @Override
    public String toString() {
        return username;
    }
}
