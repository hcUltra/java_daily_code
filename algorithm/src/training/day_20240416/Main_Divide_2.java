package training.day_20240416;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/16 20:33
 **/
public class Main_Divide_2 {
    public static class Point {
        long value;
        long index;

        public Point(long value, long index) {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Point[] arr = new Point[n];
        PriorityQueue<Point> queue = new PriorityQueue<>((a, b) -> (int)(b.value - a.value));
        for (int i = 0; i < n; i++) {
            arr[i] = new Point(in.nextInt(), i);
            if (arr[i].value % 2 == 0) {
                queue.add(arr[i]);
            }
        }
        // op k times
        while (!queue.isEmpty() && k-- > 0) {
            Point x = queue.poll();
            x.value /= 2;
            if (x.value % 2 == 0) {
                queue.add(x);
            }
        }
        long sum = 0;
        for (Point p : arr) {
            sum += p.value;
        }
        System.out.println(sum);
    }
}
