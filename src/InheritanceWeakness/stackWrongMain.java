package InheritanceWeakness;

import java.util.Stack;

public class stackWrongMain {

    //불필요한 인터페이스 상속 문제.
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("1st");
        stack.push("2st");
        stack.push("3st");

        stack.add(0, "4th"); //vector 의 메서드

        stack.iterator().forEachRemaining(System.out::println);

        System.out.println(stack.pop()); // 이거에 대한 결과는??


    }
}
