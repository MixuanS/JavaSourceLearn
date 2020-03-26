import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {
    @Test
    public void create(){
        HashMap<String, Double> hashMap = new HashMap<>();

        hashMap.put("K1",0.1);
        hashMap.put("K2",0.2);
        hashMap.put("K3",0.3);
        hashMap.put("K4",0.4);

    }

}