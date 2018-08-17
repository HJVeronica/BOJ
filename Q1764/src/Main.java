import java.io.*;
import java.util.*;

/**
 *
 * @author hj.veronica
 * @since 2018-08-18
 * @version 1.0
 *
 * Problem #1764
 * Description: 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때, 듣도 보도 못한 사람의 명단을 구하는 프로그램
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(bf.readLine());    // 듣도/보도 못한 사람의 수 N, M
        int N = Integer.parseInt(st.nextToken());                   // 듣도 못한 사람의 수 N
        int M = Integer.parseInt(st.nextToken());                   // 보도 못한 사람의 수 M

        Set<String> names = new HashSet<>();
        // 듣도 못한 사람 이름
        for (int i = 0; i < N; i++) {
            names.add(bf.readLine());
        }

        ArrayList<String> res = new ArrayList<>();
        // 듣도 보도 못한 사람 이름
        for (int i = 0; i < M; i++) {
            String name = bf.readLine();
            if(names.contains(name))
                res.add(name);
        }

        Collections.sort(res);
        sb.append(res.size()+"\n");

        for(String x : res)
            sb.append(x+"\n");

        System.out.println(sb);
    }
}