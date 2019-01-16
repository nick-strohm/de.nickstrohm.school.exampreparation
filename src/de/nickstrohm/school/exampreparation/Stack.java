package de.nickstrohm.school.exampreparation;

public class Stack<T> {
    private Node<T> head;

    public boolean isEmpty() {
        return this.head == null;
    }

    public void push(T value) {
        Node<T> node = new Node<>(value);
        node.setNext(this.head);
        this.head = node;
    }

    public void pop() {
        this.head = this.head.getNext();
    }

    public T top() {
        if (isEmpty()) {
            return null;
        }

        return this.head.getValue();
    }
}
