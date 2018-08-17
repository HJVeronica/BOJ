import java.io.*;
import java.util.*;

/**
 *
 * @author hj.veronica
 * @since 2018-08-18
 * @version 1.0
 *
 * Problem #7785 회사에 있는 사람
 * Description: 로그가 주어졌을 때, 현재 회사에 있는 모든 사람을 구하는 프로그램
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());        // 로그에 기록된 출입 기록의 수 n
        TreeSet<String> set = new TreeSet<>(new Comparator<String>() {      // 역순 정렬 위해 Comparator 사용
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        // test case 만큼 반복     
        for(int i = 1 ; i <= n ; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String name = st.nextToken();
            String action = st.nextToken();

            switch (action) {
                case "enter":
                    set.add(name); break;
                case "leave":
                    set.remove(name); break;
            }
        }

        for(String x : set)
            sb.append(x+"\n");

        System.out.println(sb);
    }
}