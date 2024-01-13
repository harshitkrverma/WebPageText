package org.webpagevalidation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HashMapToHtmlTable {
    public static void main(String[] args) throws IOException {
        HashMap<String, Boolean> map = new HashMap<>();
        map.put("Obj1Obj1Obj1Obj1",true);
        map.put("Obj2 Obj2 Obj2",false);
        map.put("Obj3",true);
        map.put("Obj4",true);
        map.put("Obj5 Obj2Obj2",false);
        writeHashMapToHtmlFile(map, "Report.html");
    }
    public static void writeHashMapToHtmlFile(Map<String, Boolean> map, String fileName) throws IOException {
        StringBuilder htmlTable = new StringBuilder();
        htmlTable.append("<table style='border: 2px solid black; background-color: LightGrey;'>\n");
        htmlTable.append("<tr><th style='border: 2px solid black;'>App</th><th style='border: 2px solid black;'>Test Result</th></tr>\n");

        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            String key = entry.getKey();
            Boolean value = entry.getValue();
            String color = Boolean.TRUE.equals(value) ? "green" : "red";
            htmlTable.append("<tr><td style='border: 2px solid black; padding: 10px; text-align: center;'>").append(key).append("</td><td style='border: 2px solid black; background-color:").append(color).append("; padding: 10px; text-align: center;'>").append(value).append("</td></tr>\n");
        }

        htmlTable.append("</table>");

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(htmlTable.toString());
        writer.close();
    }
}
