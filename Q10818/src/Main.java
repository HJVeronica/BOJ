import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author hj.veronica
 * @since 2018.08.11
 * @version 1.0
 *
 * Problem #10818
 * Description: N개의 정수가 주어졌을 때, 최솟값과 최댓값을 구하기
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 숫자의 개수
        int n = Integer.parseInt(bf.readLine());
        // 숫자들 받아오기 위해 (공백으로 분리)
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(st.hasMoreTokens()){
            // 숫자 하나씩 가져오고 형변환
            int num = Integer.parseInt(st.nextToken());

            // 비교 작업
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        System.out.println(min + " " + max); // 결과 출력
    }
}