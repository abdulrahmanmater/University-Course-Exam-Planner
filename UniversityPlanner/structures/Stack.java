class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class Stack<T> {
    Node<T> top;

    public Stack() {
        top = null;
    }

    void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    T pop() {
        if (top == null) return null;
        T topData = top.data;
        top = top.next;
        return topData;
    }

    T peek() {
        if (top == null) return null;
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }
}