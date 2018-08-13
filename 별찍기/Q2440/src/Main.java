import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author hj.veronica
 * @since 2018.08.13
 * @version 1.0
 *
 * Problem #2440
 * Description: 별찍기-3 (첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, N번째 줄에는 별 1개)
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int rows = Integer.parseInt(bf.readLine());

        // test case 만큼 반복
        for (int i = 0; i < rows; i++) {
            for(int j = 0 ; j < rows-i ; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}