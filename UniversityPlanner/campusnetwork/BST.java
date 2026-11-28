class Node<T> {
    T data;
    Node<T> left;
    Node<T> right;

    Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BST<T extends Comparable<T>> {
    Node<T> root;
    int size;

    BST(){
        this.root = null;
        this.size = 0;
    }

    public void insert(T data) {
        root = insert(root, data);
    }

    private Node<T> insert(Node<T> current, T data) {
        if (current == null) {
            size++;
            return new Node<>(data);
        }
        if (data.compareTo(current.data) < 0) {
            current.left = insert(current.left, data);
        }
        else if (data.compareTo(current.data) > 0) {
            current.right = insert(current.right, data);
        }
        return current;
    }

    public boolean search(T data) {
        return search(root, data);
    }

    private boolean search(Node<T> current, T data) {
        if (current == null) return false;
        if (data.compareTo(current.data) == 0) return true;
        if (data.compareTo(current.data) < 0) return search(current.left, data);
        return search(current.right, data);
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(Node<T> current) {
        if (current == null) return;

        inorder(current.left);
        System.out.println(current.data);
        inorder(current.right);
    }
}