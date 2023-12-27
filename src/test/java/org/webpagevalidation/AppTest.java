package org.webpagevalidation;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testApp()
    {
        String url = "https://www.google.co.in";
        String text = "Google";
        if(App.webText(url).contains(text)){
            System.out.println(url+" contains text "+text);
        }

    }
}
