import java.io.*;
import java.util.*;

/**
 *
 * @author hj.veronica
 * @since 2018-08-18
 * @version 1.0
 *
 * Problem #11279
 * Description: 최대 힙을 이용하여 자연수 배열에서 가장 큰 값을 출력한 뒤 그 값을 배열에서 제거하는 프로그램
 *
 */
public class Main {
    public static class Compare implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine());        // 연산의 개수 N

        Compare cmp = new Compare();
        PriorityQueue<Integer> queue = new PriorityQueue<>(1, cmp);     // Comparator를 이용해 정렬 순서 바꿔주기 (304ms)
        //PriorityQueue<Integer> queue = new PriorityQueue<>(1, Collections.reverseOrder());     // Collections 클래스를 이용해 정렬 순서 바꿔주기 (312ms)
        for(int i = 1 ; i <= N ; i++) {
            int x = Integer.parseInt(bf.readLine());        // 자연수 x


            // x가 0이면 배열에서 가장 작은 값 출력 & 배열에서 제거
            if((x == 0) & (!queue.isEmpty()))       sb.append(queue.poll() + "\n");
            else if((x == 0) & queue.isEmpty())     sb.append("0\n");
            else            queue.offer(x);     // 큐에 자연수 추가
        }
        System.out.println(sb);
    }
}