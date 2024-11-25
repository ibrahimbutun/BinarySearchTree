public class BinarySearchTree<T extends Comparable> {
    private TNode<T> root;

    public void insert(T val) throws Exception {
        TNode<T> newNode = new TNode<>(val);

        if (root == null) {
            root = newNode;
        } else {
            TNode<T> iterator = root;

            while (iterator != null) {
                if (val.compareTo(iterator.value) == -1) {
                    if (iterator.left == null) {
                        iterator.left = newNode;
                        return;
                    }
                    iterator = iterator.left;
                } else if (val.compareTo(iterator.value) == 1) {
                    if (iterator.right == null) {
                        iterator.right = newNode;
                        return;
                    }
                    iterator = iterator.right;
                } else {
                    throw new Exception("Aynı değerden iki tane mevcut olamaz!");
                }
            }
        }
    }

    public void inorder() {
        inorder(root);
    }

    public void inorder(TNode<T> tempRoot) {
        if (tempRoot != null) {
            inorder(tempRoot.left);
            System.out.println(tempRoot.value);
        }
    }

    public boolean search(T val) {
        TNode<T> iterator = root;
        while (iterator != null) {
            if (val.compareTo(iterator.value) == -1) {
                iterator = iterator.left;
            } else if (val.compareTo(iterator.value) == 1) {
                iterator = iterator.right;
            } else {
                return true;
            }

        }
        return false;
    }

    public boolean recursiveSearch(T val) {
        return recursiveSearch(root, val);
    }

    public boolean recursiveSearch(TNode<T> tempRoot, T val) {
        if (tempRoot == null)
            return false;
        else if (val.compareTo(tempRoot.value) == -1) {
            return recursiveSearch(tempRoot.left, val);
        } else if (val.compareTo(tempRoot.value) == 1) {
            return recursiveSearch(tempRoot.right, val);
        } else
            return true;
    }

    public TNode<T> findNode(T val) {
        TNode<T> iterator = root;
        while (iterator != null) {
            if (val.compareTo(iterator.value) == -1)
                iterator = iterator.left;
            else if (val.compareTo(iterator.value) == 1)
                iterator = iterator.right;
            else
                return iterator;
        }
        return null;
    }

    public boolean isLeaf(T val) {
        TNode<T> current = findNode(val);
        if (current != null && current.left == null && current.right == null)
            return true;
        return false;
    }
}
