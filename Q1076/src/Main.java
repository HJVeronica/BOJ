import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 *
 * @author hj.veronica
 * @since 2018-08-18
 * @version 1.0
 *
 * Problem #1076
 * Description: 주어진 저항의 색 3개를 이용해 몇 옴인지 나타내기
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> value = new HashMap<>();       // 값 저장용
        HashMap<String, Long> multiply = new HashMap<>();       // 곱 저장용
        String[] colors = new String[] {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        for (int i = 0; i < colors.length; i++) {
            value.put(colors[i], i);                            // 값 저장
            multiply.put(colors[i], (long)Math.pow(10,i));      // 곱 저장 (10의 거듭제곱)
        }

        String firstColor = bf.readLine();
        String secondColor = bf.readLine();
        String lastColor = bf.readLine();

        long res = (value.get(firstColor)*10 + value.get(secondColor))*multiply.get(lastColor);     // (첫번째색*10 + 두번째색) * 마지막색
        sb.append(res);

        System.out.println(sb);     // 결과 출력
    }
}