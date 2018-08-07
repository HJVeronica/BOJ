import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author hj.veronica
 * @since 2018-08-07
 * @version 1.0
 *
 * Problem #15552
 * Description: 빠른 A+B (첫 줄에 TC, 다음 TC줄에 각각 두 정수 A와 B) - 수행시간 1초 미만
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());     // TC 받기

        // 빠른 출력을 위해...
        StringBuilder sb = new StringBuilder();

        // test case 만큼 반복     
        for (int i = 1; i <= testCase; i++) {
            String line = br.readLine();    // A와 B 한 줄로 받기

            StringTokenizer st = new StringTokenizer(line);     // 공백으로 나누기

            int a = Integer.parseInt(st.nextToken());      // A int 변환
            int b = Integer.parseInt(st.nextToken());      // B int 변환
            int sum = a+b;                                 // A + B

            sb.append(sum+"\n");                           // 출력용
        }

        System.out.println(sb);
    }
}