import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author hjver
 * @since 2018.08.18
 *
 * Queue 인터페이스 종류 및 사용법 예제
 *  - FIFO
 *  - push(offer) / pop(poll) / front(peek) / back / empty(isEmpty) / size(size)
 *
 */

public class QueueEx {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String args[]){
        sb.append("[ ArrayDeque Example ]\n");
        ArrayDequeEx();

        sb.append("\n\n[ LinkedList Example ]\n");
        LinkedListEx();

        sb.append("\n\n[ PriorityQueue Example ]\n");
        PriorityQueueEx();

        System.out.println(sb);
    }

    /**
     *
     */
    private static void ArrayDequeEx() {
        ArrayDeque<String> ad = new ArrayDeque<>();

        ad.offer("JAVA");
        ad.offer("ARRAY DEQUE");
        ad.offer("EXAMPLE");

        sb.append("ArrayDeque Front: "+ad.peek()+"\n");
        sb.append(ad+"\n");

        sb.append("\nArrayDeque Pop: " + ad.poll()+"\n");
        sb.append("ArrayDeque Front: "+ad.peek()+"\n");
        sb.append(ad+"\n");

    }

    /**
     * List Interface 구현
     * 요소에 null 허용
     * 끝에 요소를 추가할 때 용이
     */
    private static void LinkedListEx(){
        LinkedList<String> ll = new LinkedList<>();

        ll.offer("JAVA");
        ll.offer("LINKED LIST");
        ll.offer("EXAMPLE");

        sb.append("LinkedList Front: "+ll.peek()+"\n");
        sb.append(ll+"\n");

        sb.append("\nLinkedList Pop: " + ll.poll()+"\n");
        sb.append("LinkedList Front: "+ll.peek()+"\n");
        sb.append(ll+"\n");
    }

    /**
     * PIPO (Priority-in, Priority-out)
     * Heap에 의해 정렬된 순서에 의해 반복됨
     * 우선순위가 가장 큰 것이 먼저 나오는 큐 (최대/최소힙 등)
     * 요소에 null 허용x
     * poll 시에는 오름차순으로 나옴
     */
    private static void PriorityQueueEx(){
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.offer("JAVA");
        pq.offer("LINKED LIST");
        pq.offer("EXAMPLE");

        sb.append("PriorityQueue:" + pq + "\n");
        sb.append("PriorityQueue Poll:\n");

        while(!pq.isEmpty())
            sb.append(pq.poll() + " / ");
        sb.append("\n");
    }
}
