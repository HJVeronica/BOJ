import java.util.*;

/**
 *
 * @author hjver
 * @since 2018.08.17
 *
 * Stack 클래스 사용법 예제
 *
 */

public class StackEx {
    public static void main(String args[]){

        Stack<Integer> stack = new Stack<>();

        // push
        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }

        System.out.println("stack 크기: " + stack.size());            // size
        System.out.println("stack 용량: " + stack.capacity());        // capacity
        System.out.println("stack peek: " + stack.peek());            // peek
        System.out.println("stack: " + stack);                        // stack 안의 모든 값 출력

        // stack 이 빌 때까지 pop
        while(!(stack.empty()))
            System.out.println(stack.pop() + " pop");

        System.out.println(stack.pop());
    }
}
