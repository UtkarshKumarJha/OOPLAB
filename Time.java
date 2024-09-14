package Lab5;

public class Time {
    int hour;
    int minute;
    int second;

    Time() {
        hour = 00;
        minute = 00;
        second = 00;
    }

    Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    void display() {
        System.out.println(hour + ":" + minute + ":" + second);
    }

    void add(Time t2) {
        int h = hour + t2.hour;
        int m = minute + t2.minute;
        int s = second + t2.second;
        System.out.println(h + ":" + m + ":" + s);
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(2, 30, 45);
        Time t3 = new Time(5, 10, 10);
        t1.display();
        t2.display();
        t3.display();
        t2.add(t3);

    }
}
