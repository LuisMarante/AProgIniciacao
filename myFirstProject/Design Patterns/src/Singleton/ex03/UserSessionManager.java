package Singleton.ex03;

import java.util.Random;
import java.util.Scanner;

public class UserSessionManager {

private static UserSessionManager instance;

    private  int sessionToken;
    private  long lastAccess;

    /// ////////////////////////////////////////////// CONSTRUTOR

    private UserSessionManager() {
        Random rd = new Random();
        this.sessionToken = rd.nextInt();

        this.lastAccess = System.currentTimeMillis();
    }
    /// ////////////////////////////////////////////// OBRIGA A USAR SEMPRE O MESMO OBJETO

    public static UserSessionManager getInstance(){

        if(instance==null){
            instance = new UserSessionManager( );
        }
        return instance;
    }

    public int getSessionToken() {
        return sessionToken;
    }

    public long getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess() {
        this.lastAccess = System.currentTimeMillis();
    }
}
