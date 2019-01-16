package de.nickstrohm.school.exampreparation;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new List<>();
        System.out.println("List isEmpty: " + list.isEmpty());
        list.toFirst();
        System.out.println("List toFirst->getObject: " + list.getObject());
        list.append(123);
        System.out.println("List append->getObject: " + list.getObject());
        list.toFirst();
        System.out.println("List toFirst->getObject: " + list.getObject());
        list.insert(456);
        System.out.println("List insert->getObject: " + list.getObject());
        list.toFirst();
        System.out.println("List toFirst->getObject: " + list.getObject());
        list.insert(789);
        System.out.println("List insert->getObject: " + list.getObject());
        list.toFirst();
        System.out.println("List toFirst->getObject: " + list.getObject());
        list.next();
        System.out.println("List next->getObject: " + list.getObject());
        list.toLast();
        System.out.println("List toLast->getObject: " + list.getObject());

        Stack<Integer> stack = new Stack<>();
        System.out.println("Stack isEmpty: " + stack.isEmpty());
    }
}
