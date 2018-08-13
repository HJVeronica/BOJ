import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hj.veronica
 * @since 2018.08.13
 * @version 1.0
 *
 * Problem #2522
 * Description: 별찍기-12 (첫째 줄부터 2*N-1번째 줄 까지 차례대로 별을 출력)
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int rows = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        // 별찍기
        for (int i = 0; i < rows; i++) {           // 위
            for(int j = 0 ; j < rows ; j++){
                if(j<(rows-i-1)) sb.append(" ");
                else             sb.append("*");
            }
            sb.append("\n");
        }

        for (int i = 1; i < rows; i++) {           // 아래
            for(int j = 0 ; j < rows ; j++){
                if(j>=i) sb.append("*");
                else             sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}