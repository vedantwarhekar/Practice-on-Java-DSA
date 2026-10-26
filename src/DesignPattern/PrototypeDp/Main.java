package DesignPattern.PrototypeDp;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating Object using prototype design");

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("10.168.250.49");
        networkConnection.loadVeryImportantData();

        System.out.println(networkConnection);

        try{
            NetworkConnection connection2 = (NetworkConnection) networkConnection.clone();
            System.out.println(connection2);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
