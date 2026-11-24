package DesignPattern.PrototypeDp;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {

    private String ip;
    private String importantData;
    private List<String> domains = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }


    public void loadVeryImportantData() throws InterruptedException {
        this.importantData = "This is very very Important Data";
        domains.add("vedant.com");
        domains.add("ashish.com");
        domains.add("vishal.com");
        domains.add("bhushan.com");
        Thread.sleep(2000);
        // consider this will take 5 minutes
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Logic for deep clone-ing
        NetworkConnection conn = new NetworkConnection();
        conn.setIp(this.getIp());
        conn.setImportantData(this.getImportantData());
        for(String d : this.domains){
            conn.getDomains().add(d);
        }
        return conn;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                ", domains='"+ domains + '\'' +
                '}';
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }
}
