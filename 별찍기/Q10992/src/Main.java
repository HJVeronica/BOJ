import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hj.veronica
 * @since 2018.08.13
 * @version 1.0
 *
 * Problem #10992
 * Description: 별찍기-17 (첫째 줄부터 N번째 줄까지 차례대로 별을 출력)
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int rows = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        // 별찍기
        for (int i = 0; i < rows; i++) {
            if(i==rows-1){          // 마지막 줄
                for(int j = 0 ; j < 2*rows-1 ; j++)
                    sb.append("*");
            }
            else{                   // 나머지 줄
                for(int j = 0 ; j < 2*rows-1 ; j++){
                    if((j==(rows-i-1)) | (j==(rows+i-1)))   sb.append("*");
                    else if(j<(rows+i-1))                   sb.append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}