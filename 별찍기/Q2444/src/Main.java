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
 * Description: 별찍기-7 (첫째 줄부터 2*N-1번째 줄 까지 차례대로 별을 출력)
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int rows = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        // 별찍기
        for (int i = 1; i <= 2*rows-1; i++) {           // 2*N-1행
            if(i <= rows){
                for(int j = 0 ; j < rows-i ; j++)       // 앞쪽 공백
                    sb.append(" ");
                for(int k = 0 ; k < 2*i-1 ; k++)        // 별
                    sb.append("*");
                sb.append("\n");                   // 줄바꿈
            }
            else{
                for(int j = 0 ; j < i-rows ; j++)       // 앞쪽 공백
                    sb.append(" ");
                for(int k = 0 ; k < 2*(i-(2*(i-rows)))-1 ; k++)        // 별
                    sb.append("*");
                sb.append("\n");                   // 줄바꿈
            }
        }
        System.out.println(sb);
    }
}