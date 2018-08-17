import java.io.*;
import java.util.*;

/**
 *
 * @author hj.veronica
 * @since 2018-08-18
 * @version 1.0
 *
 * Problem #1927
 * Description: 최소 힙을 이용하여 자연수 배열에서 가장 작은 값을 출력한 뒤 그 값을 배열에서 제거하는 프로그램
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine());        // 연산의 개수 N

        PriorityQueue<Long> queue = new PriorityQueue<>();
        for(int i = 1 ; i <= N ; i++) {
            long x = Integer.parseInt(bf.readLine());        // 자연수 x


            // x가 0이면 배열에서 가장 작은 값 출력 & 배열에서 제거
            if((x == 0) & (!queue.isEmpty()))       sb.append(queue.poll() + "\n");
            else if((x == 0) & queue.isEmpty())     sb.append("0\n");
            else            queue.offer(x);     // 큐에 자연수 추가
        }
        System.out.println(sb);
    }
}