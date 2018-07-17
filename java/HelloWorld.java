public class HelloWorld {
    public int num = 1;
    public  static String str = "dian";
    public static void main(String[] args) {
        LinkedListQueue<Integer> arr = new LinkedListQueue<>();
        for (int i = 0; i < 10; i++)
            arr.enqueue(i);

        System.out.println(arr);
        arr.enqueue(666);
        arr.dequeue();
        System.out.println(arr);

        int front = arr.getFront();
        System.out.println(front);
    }
}