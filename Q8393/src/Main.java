import java.util.Scanner;

/**
 * @author hj.veronica
 * @since 2018-08-07
 * @version 1.0
 *
 * Problem #8393
 * Description: n이 주어졌을 때, 1부터 n까지 합을 구하기
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 입력받은 수 n

        int sum = 0;            // 합을 저장할 변수
        for(int i = 1 ; i <= n ; i++)
            sum += i;           // 각 숫자 더하기


        System.out.println(sum); // 결과 출력
    }
}