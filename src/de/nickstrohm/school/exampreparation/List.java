package de.nickstrohm.school.exampreparation;

public class List<T> {
    private Node<T> head;
    private Node<T> cursor;

    public boolean isEmpty() {
        return this.head == null;
    }

    public boolean hasAccess() {
        return this.cursor != null;
    }

    public void next() {
        if (!this.hasAccess()) {
            return;
        }

        this.cursor = this.cursor.getNext();
    }

    public void toFirst() {
        this.cursor = this.head;
    }

    public void toLast() {
        if (this.head == null) {
            this.cursor = null;
            return;
        }

        this.cursor = this.head.getLast();
    }

    public T getObject() {
        if (this.cursor == null) {
            return null;
        }

        return this.cursor.getValue();
    }

    public void setObject(T value) {
        if (this.cursor == null || value == null) {
            return;
        }

        this.cursor.setValue(value);
    }

    public void append(T value) {
        if (value == null) {
            return;
        }

        Node<T> node = new Node<>(value);

        if (this.head == null) {
            this.head = node;
            return;
        }

        Node<T> last = this.head.getLast();
        last.setNext(node);
    }

    public void insert(T value) {
        if (this.cursor == null || value == null) {
            return;
        }

        Node<T> node = new Node<>(value);

        if (this.head == null) {
            this.head = node;
            return;
        }

        if (this.head == this.cursor) {
            node.setNext(this.cursor);
            this.head = node;
            return;
        }

        Node<T> parent = this.head.getParent(this.cursor);
        node.setNext(parent.getNext());
        parent.setNext(node);
    }

    public void concat(List<T> list) {
        if (list == null || list.isEmpty()) {
            return;
        }

        while(!list.isEmpty()) {
            list.toFirst();
            T value = list.getObject();
            this.append(value);
            list.remove();
        }
    }

    public void remove() {
        if (isEmpty() || this.cursor == null) {
            return;
        }

        if (this.head.getNext() == null) {
            this.head = null;
            this.cursor = null;
            return;
        }

        Node<T> parent = this.head.getParent(this.cursor);
        parent.setNext(this.cursor.getNext());
    }
}
