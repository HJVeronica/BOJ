import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author hj.veronica
 * @since 2018.08.01
 * @version 1.0
 *
 * 알고리즘 문제풀이용 템플릿 (백준 온라인 저지)
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(bf.readLine());
        // 빠른 출력을 위해...
        StringBuilder sb = new StringBuilder();

        // test case 만큼 반복     
        for(int i = 1 ; i <= testCase ; i++) {
            // 한 줄로 된 입력을 받을 때 (공백 등의 구분자로)
            String line = bf.readLine();

            // 공백 구분 시 2번째 인자 생략 가능
            StringTokenizer st = new StringTokenizer(line, " ");

            while(st.hasMoreTokens()) {
                sb.append("출력할 내용\n");
            }
        }

        System.out.println(sb);

    }
}