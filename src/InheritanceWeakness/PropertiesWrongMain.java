package InheritanceWeakness;

import java.util.Properties;

public class PropertiesWrongMain {

    //불필요한 인터페이스 상속 문제.
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("A", "C++");
        properties.setProperty("B", "D++");
        //여기서 이미 String, String 선언이 되어버림.
        properties.put("ABC", 55);

        System.out.println(properties.getProperty("ABC")); // 이거의 정답은?
    }
}
