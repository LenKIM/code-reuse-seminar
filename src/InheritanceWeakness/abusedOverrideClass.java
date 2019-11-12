package InheritanceWeakness;

import java.util.Arrays;

public class abusedOverrideClass {

    public static void main(String[] args) {
        //메서드 오버라이딩의 오작용 문제.
        InstrumentedHashSet<String> languages = new InstrumentedHashSet<>();
        languages.addAll(Arrays.asList("Java", "Ruby", "scala"));
        System.out.println(languages.getAddCount()); // 6아 나옴 왜?
    }
}
