package chapter10.alone2;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 할당 방식을 선택하세요");
        System.out.println("R: 한변씩 차례로 할당");
        System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
        System.out.println("P: 우선순위가 높은 고객 먼저 할당");
        System.out.println("A : 상담원이 상담 가져가기 ");

        // 할당 방식 입력받기
        int ch = System.in.read();
        Scheduler scheduler = null;

        if(ch == 'R' || ch == 'r'){
            scheduler = new RoundRobin();   // RoundRobin 클래스 생성
        }
        else if(ch == 'L' || ch == 'l') {
            scheduler = new LeastJob(); // LeastJob 클래스 생성
        }
        else if(ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation(); // LeastJob 클래스 생성
        }
        else if(ch == 'A' || ch == 'a') {
            scheduler = new AgentGetCall(); // AgentGetCall 클래스 생성
        }
        else {
            System.out.println("지원되지 않는 기능입니다.");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
