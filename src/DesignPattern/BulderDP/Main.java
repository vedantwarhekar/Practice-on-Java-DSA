package DesignPattern.BulderDP;

public class Main {
    public static void main(String[] args) {
        User user = new User.
                UserBuilder()
                .setUserId("1234")
                .setEmailId("adb@cc.com")
                .setUserName("Durgesh")
                .build();
        System.out.println(user);

        User user2 = User.UserBuilder.builder()
                .setUserId("5678")
                .setUserName("Vedu")
                .setEmailId("Avinka")
                .build();
        System.out.println(user2);
    }
}
