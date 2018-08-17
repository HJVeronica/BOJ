import java.io.*;
import java.util.*;

/**
 *
 * @author hj.veronica
 * @since 2018-08-18
 * @version 1.0
 *
 * Problem #11651 좌표 정렬하기 2
 * Description: 2차원 평면 위의 점 N개가 있을 때, 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램
 *
 */
public class Main {
    static class Point implements Comparable<Point>{
        int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point p) {
            if(this.y < p.y)     return -1;
            else if(this.y == p.y) {
                if(this.x < p.x)            return -1;
                else if (this.x == p.x)     return 0;
                else                        return 1;
            } else      return 1;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine());
        Point[] p = new Point[N];

        for(int i = 0 ; i < N ; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            p[i] = new Point(x, y);
        }

        Arrays.sort(p);       // Comparable 사용 시 (656ms)

        // Comparator 사용 시 (668ms)
//        Arrays.sort(p, new Comparator<Point>() {
//            @Override
//            public int compare(Point p1, Point p2) {
//                return p1.compareTo(p2);
//            }
//        });

        for(Point a : p)
            sb.append(a.x + " " + a.y + "\n");
        System.out.println(sb);
    }
}