package org.webpagevalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;

class AppTest {
    @Test
    void test() throws IOException {
        HashMap<String, Boolean> map = new HashMap<>();
        map.put("Obj1",true);
        map.put("Obj2 ",false);
        map.put("Obj3",true);
        map.put("Obj4",true);
        map.put("Object 5",false);
       HashMapToHtmlTable.writeHashMapToHtmlFile(map,"Report.html");
       Assertions.fail();
    }
}