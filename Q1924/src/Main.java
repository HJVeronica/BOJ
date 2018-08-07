import java.util.Calendar;
import java.util.Scanner;

/**
 * @author hj.veronica
 * @since 2018-08-07
 * @version 1.0
 *
 * Problem #1924
 * Description: 2007년 x월 y일은 무슨 요일인지 출력하기 (기준: 오늘은 2007년 1월 1일 월요일)
 *
 */
public class Main {
    /**
     *
     * 배열을 사용한 풀이
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();       // 입력받은 월
        int y = sc.nextInt();       // 입력받은 일

        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};    // 각 달마다 일수
        String[] dates = {"SUN","MON","TUE","WED","THU","FRI","SAT"};       // 요일

        int days = y;
        for(int i=0; i<x-1;i++){
            days += months[i];      // 1월 1일부터 입력받은 날짜 사이의 일수를 모두 더함
        }

        System.out.println(dates[days % 7]);    // 더한 일수를 7로 나눈 나머지로 요일을 구함

        sc.close();
    }

    /**
     *
     * Calendar 이용한 풀이
     */
    /*public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calendar c = Calendar.getInstance();

        String[] dates = {"SUN","MON","TUE","WED","THU","FRI","SAT"};       // 요일
        int x = sc.nextInt();       // 입력받은 월
        int y = sc.nextInt();       // 입력받은 일

        c.set(2007,x-1,y);      // 날짜 세팅 (월은 0부터 시작하므로 1을 빼줌)
        int month = c.get(Calendar.DAY_OF_WEEK);  // 해당 날짜의 요일을 1~7까지 숫자로 반환 (차례로 일~토)

        System.out.println(dates[month-1]);    // 배열 인덱스에 맞춰 month-1로 해당 요일 출력

        sc.close();
    }*/

}