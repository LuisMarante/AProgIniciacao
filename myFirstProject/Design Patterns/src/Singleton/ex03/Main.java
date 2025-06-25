package Singleton.ex03;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {


       UserSessionManager user = UserSessionManager.getInstance();


        System.out.println(user.getSessionToken());
        System.out.println(user.getLastAccess());

        sleep(3000);

        user.setLastAccess();

        System.out.println(user.getSessionToken());
        System.out.println(user.getLastAccess());


    }
}
