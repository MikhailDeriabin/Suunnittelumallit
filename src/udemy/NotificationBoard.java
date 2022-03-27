package udemy;

import java.util.LinkedList;

public class NotificationBoard implements Observable{

    private int viewCount;
    private LinkedList<Notification> notifications;

    public NotificationBoard(){
        viewCount = 0;
        notifications = new LinkedList<>();
    }

    public void addNotification(Notification notification){
        notifications.add(notification);
    }

    public void viewBoard(){
        viewCount++;
    }

    @Override
    public void attach(Observer observer) {

    }

    @Override
    public void detach(Observer observer) {

    }

    @Override
    public int getViewCount() {
        return viewCount;
    }
}
