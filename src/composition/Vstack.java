package composition;

import java.util.EmptyStackException;
import java.util.Vector;

public class Vstack<E> {

    private Vector<E> elements = new Vector<>();

    public E push(E item) {
        elements.addElement(item);
        return item;
    }

    public E pop() {
        if (elements.isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.remove(elements.size() - 1);
    }

    public static void main(String[] args) {
        Vstack<String> vstack = new Vstack<>();
        vstack.push("1st");
        vstack.push("2st");
        vstack.push("3st");
        vstack.push("4st");

        System.out.println(vstack.pop());
    }
}
