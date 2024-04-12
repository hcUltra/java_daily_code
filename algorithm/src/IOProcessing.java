import java.io.*;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/12 13:27
 **/
public class IOProcessing {
    // 1. 静态空间
    public static final int MAX= 2000;
    public static int[][] arr = new int[MAX][MAX];
    public static void main(String[] args) throws IOException {
        // 2. 数据读取
        // 将数据读取到内存缓冲区
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer in = new StreamTokenizer(br);
        // 读取数字
        int x = (int)in.nval;
        // 下一个数字
        in.nextToken();

        // 3. 读取行数据
        // 读取一行
        String s = br.readLine();
        // 使用空格进行分割
        String[] strings = s.split(" ");
        // 将字符串转为数字
        // ...

        // 输出答案
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        // 添加答案
        out.print(x);
        // 提交答案
        out.flush();

        br.close();
        out.close();
    }
}
