import java.io.*;
import java.util.StringTokenizer;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/12 13:27
 **/
public class IOProcessing {
    // 1. 静态空间
    public static final int MAX = 2000;
    public static int[][] arr = new int[MAX][MAX];

    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = reader.nextInt();
            }
        }
        reader.close();
        System.out.println(arr[0][0]);
    }


    static class Reader {
        StringTokenizer st = new StringTokenizer("");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String next() throws IOException {
            while (!st.hasMoreTokens()) {
                st = new StringTokenizer(bf.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        void close() throws IOException {
            bf.close();
        }
    }
}
