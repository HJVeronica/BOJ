import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author hj.veronica
 * @since 2018.08.13
 * @version 1.0
 *
 * Problem #2439
 * Description: 별찍기-2 (첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개 오른쪽 정렬)
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int rows = Integer.parseInt(bf.readLine());

        // test case 만큼 반복     
        for (int i = 1; i <= rows; i++) {
            for(int j = 1 ; j <= rows-i ; j++)
                System.out.print(" ");
            for (int k = 1 ; k <= i ; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}