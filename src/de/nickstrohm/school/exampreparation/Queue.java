package de.nickstrohm.school.exampreparation;

public class Queue<T> {
    private Node<T> head;

    public boolean isEmpty() {
        return this.head == null;
    }

    public void enqueue(T value) {
        Node<T> node = new Node<>(value);

        if (isEmpty()) {
            this.head = node;
            return;
        }

        Node<T> last = this.head.getLast();
        last.setNext(node);
    }

    public void dequeue() {
        if (isEmpty()) {
            return;
        }

        this.head = this.head.getNext();
    }

    public T front() {
        if (isEmpty()) {
            return null;
        }

        return this.head.getValue();
    }
}
