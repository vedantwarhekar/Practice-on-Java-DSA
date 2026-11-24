package DesignPattern.PrototypeDp;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating Object using prototype design");

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("10.168.250.49");
        networkConnection.loadVeryImportantData();
        try{
            NetworkConnection connection2 = (NetworkConnection) networkConnection.clone();
            NetworkConnection connection3 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection);
            // by default shalow copy will get implemented that's why it remove from all object
            System.out.println(networkConnection.getDomains().remove(0));
            System.out.println(networkConnection);
            System.out.println(connection2);
            System.out.println(connection3);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
