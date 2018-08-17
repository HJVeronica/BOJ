import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 *
 * @author hjver
 * @since 2018.08.18
 *
 * Map 인터페이스 종류 및 사용법 예제
 *  - 중복 Key를 포함하지 않음
 *  - Key-value 쌍을 이룸 (dictionary)
 *
 */

public class MapEx {
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]){
        sb.append("[ HashMap Example ]\n");
        HashMapEx();

        sb.append("\n\n[ LinkedHashMap Example ]\n");
        LinkedHashMapEx();

        sb.append("\n\n[ TreeMap Example ]\n");
        TreeMapEx();

        System.out.println(sb);
    }

    /**
     * 순서가 보장되지 않음 - hash값에 의해 순서가 정해짐
     * Key-value 값에 null 허용
     *
     *
     */
    public static void HashMapEx(){
        HashMap<Integer, Character> hm = new HashMap();

        char alphabet = 65;         // 알파벳 A
        for (int i = 26; i > 0; i--) {
            hm.put(i, alphabet++);
        }

        sb.append("HashMap Size: "+hm.size()+"\n");

        if(hm.containsKey(3))
            sb.append("3번 키: "+hm.get(3)+"\n");
        else
            sb.append("3번 키는 존재하지 않습니다.");

        if(hm.containsValue('a'))
            sb.append("HashMap에 알파벳 a는 존재합니다.\n");
        else
            hm.replace(26, hm.get(26), 'a');

        hm.remove(4);

        if(!hm.isEmpty())
            sb.append(hm+"\n");         // 기본 출력 방법
        else
            sb.append("HashMap이 비어있습니다.\n");
    }

    /**
     * FIFO 방식 - 넣은 순서대로 출력
     */
    public static void LinkedHashMapEx(){
        LinkedHashMap<Integer, Character> lhm = new LinkedHashMap<>();

        char alphabet = 65;         // 알파벳 A
        for (int i = 26; i > 0; i--) {
            lhm.put(i, alphabet++);
        }

        // foreach 활용한 출력 방법
        for(int key : lhm.keySet()){
            sb.append(key + " : " + lhm.get(key) + "\t");
        }
        sb.append("\n");
    }

    /**
     * Key 값이 오름차순으로 자동 정렬됨
     */
    public static void TreeMapEx(){
        TreeMap<Integer, Character> tm = new TreeMap<>();

        char alphabet = 65;         // 알파벳 A
        for (int i = 26; i > 0; i--) {
            tm.put(i, alphabet++);
        }
        sb.append(tm+"\n");
    }
}
