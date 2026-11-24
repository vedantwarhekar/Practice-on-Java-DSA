package DesignPattern.Observer;


public class Main {

    public static void main(String[] args) {

        Channel channel = new Channel();

        Subscriber user1 = new UserSubscriber("Rahul");
        Subscriber user2 = new UserSubscriber("Priya");
        Subscriber user3 = new UserSubscriber("Amit");

        channel.subscribe(user1);
        channel.subscribe(user2);
        channel.subscribe(user3);

        channel.uploadVideo("Observer Pattern Tutorial");

        channel.unsubscribe(user2);

        channel.uploadVideo("Factory Pattern Tutorial");
    }
}

