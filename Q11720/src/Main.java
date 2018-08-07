import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hj.veronica
 * @since 2018-08-07
 * @version 1.0
 *
 * Problem #11720
 * Description: 공백 없이 쓰여있는 N개의 숫자를 모두 합해서 출력 (첫 줄에 숫자 개수, 다음 줄에 더할 숫자들)
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int index = Integer.parseInt(bf.readLine());    // 첫 줄에 있는 숫자의 개수 = 배열의 크기
        String[] nums = bf.readLine().split("");    // 한 줄에 있는 숫자 받아와 모두 쪼개 배열에 넣기

        int sum = 0;        // 총합 저장할 변수
        for (int i = 0; i < index; i++)
            sum += Integer.parseInt(nums[i]);       // 각 변수에 있는 문자열로 된 숫자를 int로 변환하여 더하기

        System.out.println(sum);  // 결과 출력

    }
}