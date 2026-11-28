class BSTNode<K, V> {
    K key;
    V value;
    BSTNode<K, V> left;
    BSTNode<K, V> right;

    BSTNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BST<K extends Comparable<K>, V> {
    BSTNode<K, V> root;
    int size;

    BST(){
        this.root = null;
        this.size = 0;
    }

    public void put(K key, V value) {
        root = put(root, key, value);
    }

    private BSTNode<K, V> put(BSTNode<K, V> current, K key, V value) {
        if (current == null) {
            size++;
            return new BSTNode<>(key, value);
        }
        if (key.compareTo(current.key) < 0) {
            current.left = put(current.left, key, value);
        }
        else if (key.compareTo(current.key) > 0) {
            current.right = put(current.right, key, value);
        }
        else{
            current.value = value;
        }
        return current;
    }

    public V get(K key) {
        return get(root, key);
    }

    private V get(BSTNode<K, V> current, K key) {
        if (current == null) return null;
        if (key.compareTo(current.key) == 0) return current.value;
        if (key.compareTo(current.key) < 0) return get(current.left, key);
        return get(current.right, key);
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(BSTNode<K, V> current) {
        if (current == null) return;

        inorder(current.left);
        System.out.println(current.value);
        inorder(current.right);
    }

    public void delete(K key) {
        root = delete(root, key);
    }

    private BSTNode<K, V> delete(BSTNode<K, V> current, K key) {
        if (current == null) return null;

        if (key.compareTo(current.key) < 0) {
            current.left = delete(current.left, key);
        } else if (key.compareTo(current.key) > 0) {
            current.right = delete(current.right, key);
        } else {
            if (current.left == null) {
                size--;
                return current.right;
            } else if (current.right == null) {
                size--;
                return current.left;
            }

            BSTNode<K, V> temp = min(current.right);

            current.key = temp.key;
            current.value = temp.value;

            current.right = delete(current.right, temp.key);
        }
        return current;
    }

    private BSTNode<K, V> min(BSTNode<K, V> current) {
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public K min() {
        if (root == null) return null;
        return min(root).key;
    }

    public K max() {
        if (root == null) return null;
        return max(root).key;
    }

    private BSTNode<K, V> max(BSTNode<K, V> current){
        while (current.right != null){
            current = current.right;
        }
        return current;
    }
}