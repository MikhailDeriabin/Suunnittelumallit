package udemy;

public class NewNotificationObserver implements Observer{
    @Override
    public void updated(Observable observable) {
        System.out.println("New message has been added");
    }
}
