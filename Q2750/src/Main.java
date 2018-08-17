import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author hj.veronica
 * @since 2018-08-17
 * @version 1.0
 *
 * Problem #2750
 * Description: N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(bf.readLine());

        // test case 만큼 반복     
        for(int i = 1 ; i <= testCase ; i++) {
            int num = Integer.parseInt(bf.readLine());

            arr.add(num);
        }

        Collections.sort(arr);

        for(int i : arr)
            sb.append(i+"\n");

        System.out.println(sb);
    }
}