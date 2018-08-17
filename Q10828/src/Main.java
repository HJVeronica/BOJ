import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author hj.veronica
 * @since 2018-08-17
 * @version 1.0
 *
 * Problem #10828
 * Description: 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        // test case 만큼 반복     
        for(int i = 1 ; i <= testCase ; i++) {
            // 한 줄로 된 입력을 받을 때 (공백 등의 구분자로)
            String line = bf.readLine();

            // 공백 구분 시 2번째 인자 생략 가능
            StringTokenizer st = new StringTokenizer(line, " ");
            String action = st.nextToken();

            // action 따라 동작 구분하기
            try {
                switch (action) {
                    case "push":
                        int num = Integer.parseInt(st.nextToken());
                        stack.push(num);
                        break;
                    case "pop":     sb.append(stack.pop()+"\n"); break;
                    case "top":     sb.append(stack.peek()+"\n"); break;
                    case "size":    sb.append(stack.size()+"\n"); break;
                    case "empty":   if(stack.empty()) sb.append("1\n"); else sb.append("0\n"); break;
                }
            }catch (EmptyStackException e){     // 스택이 비었을 때 예외처리
                sb.append("-1\n");
            }
        }
        System.out.println(sb);                 // 결과 출력
    }
}