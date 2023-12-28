package org.webpagevalidation;


import org.jsoup.Jsoup;

import java.io.IOException;

public class App
{
    public static final String[] appList = {
            "Gmail",
            "Google",
            "Images"
    };
    public static String url = "https://www.google.com";
    public static void main(String[] args) {
        for (String app : appList){
            System.out.println(app + " : " + validate(url,app));
        }
    }

    public static String jsoupGetText(String url){
        try {
            return Jsoup.connect(url).get().text();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static boolean validate(String url, String text){
        return jsoupGetText(url).contains(text);
    }

}
