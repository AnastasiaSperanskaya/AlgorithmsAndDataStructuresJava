package dataStructures.stack;

class StackList<T> {
    private Node<T> top;
    private int length;

    public StackList() {
        length = 0;
        top = null;
    }

    public void push(T data) {
        Node<T> temp = new Node<T>(data);
        if (top == null) {
            top = temp;
        } else {
            temp.setNext(top);
            top = temp;
        }
        length++;
    }

    public void pop() {
        top = top.getNext();
        length--;
    }

    public T peek() {
        return top.getData();
    }

    public void display() {
        Node<T> temp = top;
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            while (temp != null) {
                System.out.print(temp.getData() + "=>");
                temp = temp.getNext();
            }
            System.out.print("null");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return (top == null);
    }
}
