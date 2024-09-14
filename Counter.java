public class Counter {
    private static int count = 0;

    public static class CounterManager {
        public static void incrementCount() {
            count++;
        }

        public static int getCount() {
            return count;
        }
    }


    public Counter() {
        CounterManager.incrementCount(); 
    }

    public static void main(String[] args) {

        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        System.out.println("Number of objects created: " + Counter.CounterManager.getCount());
    }
}
