import java.util.Scanner;

public class Counter {
    String name;
    int count;

    public static void main(String[] args) {

        Counter counter1 = new Counter("Нечетные числа: ", 0);
        Counter counter2 = new Counter("Четные числа: ", 0);
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) counter2.upCount();
            else counter1.upCount();
        }
        System.out.println(counter1.name+counter1.count);
        System.out.println(counter2.name+counter2.count);
    }

    public Counter(String name, int count) {
        this.name = name;
        this.count = count;
    }
    public Counter(String name) {
        this.name = name;
        this.count=0;
    }

    int upCount() {
        count++;
        return count;
    }

    int downCount() {
        count--;
        return count;
    }

    int upCountIn() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.close();
        count += a;
        return count;
    }


}


