package Singleton.ex01;

public class Main {
    public static void main(String[] args) {


        DataBaseConnection db1 = DataBaseConnection.getInstance("localHost 8000");

        db1.connect();
    }
}
