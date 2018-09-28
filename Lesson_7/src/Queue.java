class Queue  {

    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int items;


    public Queue(int size) {
        maxSize = size;
        queArray = new int[size];
        front = 0;
        rear = -1;
        items = 0;
    }

    public int remove() {
        int temp = queArray[front++];
        if (front == maxSize) front = 0;
        items--;
        return temp;
    }

    public void insert(int value) {
        if (rear == maxSize - 1) rear = -1;
        queArray[++rear] = value;
        items++;
    }

    public int peek() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (items==0);
    }

    public boolean isFull() {
        return (items == maxSize);
    }

    public int size() {
        return items;
    }
}
