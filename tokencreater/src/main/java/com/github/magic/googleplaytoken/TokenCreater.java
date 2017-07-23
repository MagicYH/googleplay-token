package com.github.magic.googleplaytoken;

import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

import com.github.yeriomin.playstoreapi.GooglePlayAPI;
import com.github.yeriomin.playstoreapi.GooglePlayException;
import com.github.yeriomin.playstoreapi.PropertiesDeviceInfoProvider;

/**
 * TokenCreater
 */
public class TokenCreater {
    
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: 'email' 'passwd'");
            return;
        }

        String email = args[0];
        String passwd = args[1];

        TokenCreater tokenCreater = new TokenCreater();
        try {
            String token = tokenCreater.getToken(email, passwd);
            System.out.println(token);
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }

    private GooglePlayAPI getApi() throws IOException {
        Properties properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getSystemResourceAsStream("device-gemini.properties"));
        } catch (IOException e) {
            throw new IOException("device-gemini.properties not found");
        }

        PropertiesDeviceInfoProvider deviceInfoProvider = new PropertiesDeviceInfoProvider();
        deviceInfoProvider.setProperties(properties);
        deviceInfoProvider.setLocaleString(Locale.ENGLISH.toString());

        GooglePlayAPI api = new GooglePlayAPI();
        api.setClient(new OkHttpClientAdapter());
        api.setDeviceInfoProvider(deviceInfoProvider);
        api.setLocale(Locale.US);
        return api;
    }

    protected String getToken(String email, String password) throws IOException {
        return getApi().generateAC2DMToken(email, password);
    }
}