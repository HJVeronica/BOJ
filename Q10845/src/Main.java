import java.io.*;
import java.util.*;

/**
 *
 * @author hj.veronica
 * @since 2018-08-18
 * @version 1.0
 *
 * Problem #10845
 * Description: 큐를 구현한 다음, 입력으로 주어지는 명령을 처리 (push/pop/size/empty/front/back)
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int testCase = Integer.parseInt(bf.readLine());        

        // test case 만큼 반복     
        for(int i = 1 ; i <= testCase ; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String action = st.nextToken();     // action

            try{
                switch (action) {
                    case "push":
                        int x = Integer.parseInt(st.nextToken());
                        queue.offer(x);
                        break;
                    case "pop":     sb.append(queue.remove()+"\n"); break;
                    case "size":    sb.append(queue.size()+"\n"); break;
                    case "empty":
                        if(queue.isEmpty())     sb.append("1\n");
                        else                    sb.append("0\n");
                        break;
                    case "front":   sb.append(queue.getFirst()+"\n"); break;
                    case "back":    sb.append(queue.getLast()+"\n"); break;
                }
            }catch (NoSuchElementException e){
                sb.append("-1\n");
            }
        }
        System.out.println(sb);
    }
}