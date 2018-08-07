import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hj.veronica
 * @since 2018-08-07
 * @version 1.0
 *
 * Problem #11721
 * Description: 주어진 길이가 N인 단어를 한 줄에 10글자씩 끊어 출력하기
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] line = bf.readLine().split("");    // 입력받은 문자열을 한 글자씩 배열에 저장

        // 빠른 출력을 위해...
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line.length; i++) {
            // 10번째 글자를 출력한 뒤 줄바꿈 (0번째 인덱스 예외처리 안해주면 출력 형식 오류 뜸)
            if(i%10 == 0 & !(i==0)){
                sb.append("\n"+line[i]);
            }
            else       // 그 외에는 계속 이어붙이기
                sb.append(line[i]);
        }
        System.out.print(sb);
    }
}