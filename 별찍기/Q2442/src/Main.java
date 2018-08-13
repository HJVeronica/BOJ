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
 * Description: 별찍기-5 (첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2*N-1개 가운데 대칭)
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int rows = Integer.parseInt(bf.readLine());

        // 별찍기
        for (int i = 1; i <= rows; i++) {           // 5행
            for(int j = 0 ; j < rows-i ; j++)       // 앞쪽 공백
                System.out.print(" ");
            for(int k = 0 ; k < 2*i-1 ; k++)        // 별
                System.out.print("*");
            System.out.println();                   // 줄바꿈
        }
    }
}