package model;

public class Tree {
    Tree left;
    Tree right;
    int data;

    public Tree(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value <= this.data) {
            if (left == null) {
                left = new Tree(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Tree(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains(int value) {
        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    //tree traversal functions

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if (right != null) {
            right.printInOrder();
        }
    }

    public void printPreOrder() {
        System.out.println(data);
        if (left != null) {
            left.printInOrder();
        }
        if (right != null) {
            right.printInOrder();
        }
    }

    public void printPostOrder() {
        if (left != null) {
            left.printInOrder();
        }
        if (right != null) {
            right.printInOrder();
        }
        System.out.println(data);
    }
}