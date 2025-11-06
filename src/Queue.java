public class Queue {
    Node front;
    Node tail;
    int size;

    Queue() {
        front = tail = null;
        size = 0;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (this.size == 0) {
            front = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("The queue is empty");
            return -1;
        }
        int number = tail.next.data;
        tail = tail.next;
        size--;
        if (front == null) {
            tail = null;
        }
        return number;
    }

    public boolean areEqual(Queue q1, Queue q2) {
        if (q1.size != q2.size) {
            return false;
        }
        Node nodeQ1 = front.next;
        Node nodeQ2 = front.next;
        while (nodeQ1 != null && nodeQ2 != null) {
            if (nodeQ1.data != nodeQ2.data) {
                return false;
            }else {
                nodeQ1 = nodeQ1.next;
                nodeQ2 = nodeQ2.next;
            }
        }
        return true;
    }
}
