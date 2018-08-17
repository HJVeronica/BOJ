import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author hjver
 * @since 2018.08.18
 *
 * Set 클래스 종류와 사용법 예제
 *
 */

public class SetEx {
    public static void main(String args[]){
        System.out.println("[ HashSet Example ]");
        HashSetEx();

        System.out.println("\n\n[ TreeSet Example ]");
        TreeSetEx();

        System.out.println("\n\n[ LinkedHashSet Example ]");
        LinkedHashSetEx();
    }

    /**
     * 해시 테이블로 구현
     * 삽입/삭제/제거 연산 시간복잡도가 O(1)
     * 순서가 보장되지 않음
     * Set에서 가장 빠른 데이터 접근 속도를 가짐
     *
     * Usage: 집합이 필요하나 순서가 상관없을 때, 무엇이 들어있는지 없는지의 여부를 판단할 때 사용
     */
    public static void HashSetEx(){
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 10; i > 0; i--)    hs.add(i);

        System.out.println("HashSet Size: " + hs.size());
        hs.remove(4);
        System.out.println("4가 있는지?: "+hs.contains(4));

        // 비어있지 않을 때 출력
        if(!hs.isEmpty())
            System.out.println(hs);
        else
            System.out.println("HashSet이 비어있습니다.");
    }

    /**
     * 해시 테이블과 연결 리스트로 구현
     * 삽입/삭제/제거 연산 시간복잡도가 O(1)
     * 순서가 보장됨
     *
     * Usage: 추가한 순서가 중요한 경우에 사용
     */
    public static void LinkedHashSetEx(){
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        for (int i = 10; i > 0; i--) {
            lhs.add(i);
        }

        System.out.println(lhs);
    }

    /**
     * 이진 검색 트리(레드 블랙 트리)로 구현
     * 삽입/삭제/제거 연산 시간복잡도가 O(logN)
     * 순서가 보장됨 (오름차순)
     *
     * Usage: 오름차순 정렬이 필요할 때 (lower/upper bound)
     */
    public static void TreeSetEx(){
        TreeSet<Integer> ts = new TreeSet<>();

        for (int i = 10; i > 0; i--)
            ts.add(i);

        System.out.println(ts);
    }
}
