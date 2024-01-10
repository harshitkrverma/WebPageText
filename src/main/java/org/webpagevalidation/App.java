package org.webpagevalidation;

import org.jsoup.Jsoup;
import java.io.IOException;
public class App
{
    protected static final String[] appList = {
            "Gmail",
            "Google",
            "Images"
    };
    public static void main(String[] args) {
        String testURL = "https://www.google.com";
        for (String app : appList){
            validate(testURL,app);
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
