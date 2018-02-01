package com.waterlinedata;

import com.sun.security.auth.callback.TextCallbackHandler;

import javax.security.auth.login.LoginContext;

public class KeytabLoginTest {

    public static void main(String[] args) {
        LoginContext lc = null;
        try {
            lc = new LoginContext("Client", new TextCallbackHandler());
            System.out.println("Created Login Context");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }

        try {
            System.out.println("Attempting login ...");
            lc.login();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);

        }

        System.out.println("Authentication succeeded!");
    }
}
