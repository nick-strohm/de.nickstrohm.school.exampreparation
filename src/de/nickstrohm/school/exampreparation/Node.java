package de.nickstrohm.school.exampreparation;

public class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getLast() {
        if (this.next == null) {
            return this;
        }

        return this.next.getLast();
    }

    public Node<T> getParent(Node<T> cursor) {
        if (this.next == null) {
            return null; // No children = We are at the end of the node structure
        }

        if (this.next == cursor) {
            return this;
        }

        return this.next.getParent(cursor);
    }
}
