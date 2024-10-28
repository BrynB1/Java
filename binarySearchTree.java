package Junior.Final;

import java.util.ArrayList;
import java.util.LinkedList;

class binarySearchTree {
    static class Node {
        int key;
        Node left, right;

        Node(int k) {
            key = k;
            left = null;
            right = null;
        }
    }

    private static Node root;
    private final ArrayList<Integer> elementsList;

    binarySearchTree() {
        root = null;
        elementsList = new ArrayList<>();
    }

    public int findSum() {
        return findSum(root);
    }

    private int findSum(Node aRoot) {
        if (aRoot == null) {
            return 0;
        }

        int leftSum = findSum(aRoot.left);
        int rightSum = findSum(aRoot.right);

        return leftSum + rightSum + aRoot.key;
    }

    public int keyDiff() {
        if (root == null) {
            throw new IllegalStateException("BST is empty");
        }

        Node smallest = findSmallestKey(root);
        Node largest = findLargestKey(root);

        return largest.key - smallest.key;
    }

    public Node findSmallestKey(Node aRoot) {
        if (aRoot.left == null) {
            return aRoot;
        }
        return findSmallestKey(aRoot.left);
    }

    public Node findLargestKey(Node aRoot) {
        if (aRoot.right == null) {
            return aRoot;
        }
        return findLargestKey(aRoot.right);
    }

    public void insert(int k) {
        if (root == null) {
            root = new Node(k);
            return;
        }
        insert(k, root);
    }

    private void insert(int k, Node aRoot) {
        if (k < aRoot.key) {
            if (aRoot.left == null) {
                aRoot.left = new Node(k);
                return;
            }
            insert(k, aRoot.left);
        } else if (k > aRoot.key) {
            if (aRoot.right == null) {
                aRoot.right = new Node(k);
                return;
            }
            insert(k, aRoot.right);
        }
    }

    public ArrayList<Integer> display() {
        elementsList.clear();
        if (root == null) {
            return elementsList;
        }
        display(root);
        return elementsList;
    }

    private void display(Node aRoot) {
        if (aRoot == null) {
            return;
        } else {
            display(aRoot.left);
            elementsList.add(aRoot.key);
            display(aRoot.right);
        }
    }

    public boolean search(int k) {
        return search(k, root);
    }

    private boolean search(int k, Node aRoot) {
        while (aRoot != null) {
            if (k == aRoot.key) {
                return true;
            } else if (k < aRoot.key) {
                aRoot = aRoot.left;
            } else {
                aRoot = aRoot.right;
            }
        }
        return false;
    }

    public int height() {
        return height(root);
    }

    private int height(Node aRoot) {
        if (aRoot == null) {
            return -1;
        }
        int leftHeight = height(aRoot.left);
        int rightHeight = height(aRoot.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public boolean onSameBranch(int key1, int key2) {
        return onSameBranch(root, key1, key2);
    }

    private boolean onSameBranch(Node aNode, int key1, int key2) {
        if (aNode == null) {
            return false;
        } else {
            LinkedList<Node> linkedList1 = new LinkedList<>();
            LinkedList<Node> linkedList2 = new LinkedList<>();
            Node reference = aNode;
            Node reference2 = aNode;
            while (reference.key != key1) {
                linkedList1.add(reference);
                if (reference.key > key1) {
                    reference = reference.left;
                } else {
                    reference = reference.right;
                }
                if (reference.key == key1) {
                    linkedList1.add(reference);
                }
            }
            while (reference2 != null && reference2.key != key2) {
                linkedList2.add(reference2);
                if (key2 < reference2.key) {
                    reference2 = reference2.left;
                } else {
                    reference2 = reference2.right;
                }
            }
            assert reference2 != null;
            linkedList2.add(reference2);

            if (reference2 != null) {
                int listSize = linkedList1.size();
                if (linkedList2.size() < linkedList1.size()) {
                    listSize = linkedList2.size();
                }
                for (int i = 1; i < listSize; i++) {
                    if (linkedList1.get(i).key != linkedList2.get(i).key) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int getSmallestKey() {
        if (root == null) {
            throw new IllegalStateException("BST is empty");
        }

        return findSmallestKey(root).key;
    }

    public int getLargestKey() {
        if (root == null) {
            throw new IllegalStateException("BST is empty");
        }

        return findLargestKey(root).key;
    }
}
