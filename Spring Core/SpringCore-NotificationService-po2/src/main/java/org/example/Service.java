package org.example;

public class Service {
    SendNotification notify;

    public void setNotify(SendNotification notify){
        this.notify = notify;
        notify.sendMessage();
    }
    public Service(){}

    void start(){
        notify.sendMessage();
    }
}
