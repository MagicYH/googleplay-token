package com.github.magicyh;

import com.github.yeriomin.tokendispenser.TokenResource;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * Hello world!
 */
public class Create {
    public static void main(String[] args) {
        // System.out.println(args[0]);
        // System.out.println("Hello World!");
        if (args.length < 2) {
            System.out.println("Usage: 'email' 'passwd'");
            return;
        }

        String email = args[0];
        String passwd = args[1];

        try {
            TokenResource creater = new TokenResource();
            String token = creater.createToken(email, passwd);
            System.out.println(token);
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
