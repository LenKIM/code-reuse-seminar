package composition;

import java.util.Hashtable;

public class Vproperties {

    private Hashtable<String, String> properties = new Hashtable<>();

    public String setProperties(String key, String value) {
        return properties.put(key, value);
    }

    public String getProperty(String key){
        return properties.get(key);
    }

    public static void main(String[] args) {
        Vproperties vproperties = new Vproperties();
        vproperties.setProperties("A", "B");
        System.out.println(vproperties.getProperty("A"));
    }
}
