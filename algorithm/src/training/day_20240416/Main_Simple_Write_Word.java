package training.day_20240416;

import java.util.Scanner;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/16 20:36
 **/
public class Main_Simple_Write_Word {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        String str = in.nextLine();
        String[] words = str.split(" ");
        String ans = "";
        for (String word : words) {
            ans += word.charAt(0);
        }

        System.out.println(ans.toUpperCase());
    }
}
