import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 *
 * @author hj.veronica
 * @since 2018-08-18
 * @version 1.0
 *
 * Problem #10815
 * Description: 정수 하나가 적혀있는 숫자카드 N개를 가지고 있을 때, 주어진 숫자 M개를 가지고 있는지 여부 판단
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        bf.readLine();     // 상근이가 가지고 있는 숫자 카드의 개수 N
        StringTokenizer st = new StringTokenizer(bf.readLine());
        HashSet<Integer> hs = new HashSet<>();     // N개의 숫자를 담을 set (순서 상관x)

        while(st.hasMoreTokens())
            hs.add(Integer.parseInt(st.nextToken()));

        bf.readLine();     // 숫자의 개수 M
        st = new StringTokenizer(bf.readLine());
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());

            if(hs.contains(num)) sb.append("1 ");           // 숫자 카드에 있는 숫자면 1
            else                 sb.append("0 ");           // 숫자 카드에 없는 숫자면 0
        }
        System.out.println(sb);
    }
}