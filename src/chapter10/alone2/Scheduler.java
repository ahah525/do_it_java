package chapter10.alone2;

public interface Scheduler {
    // 다음 전화를 가져오는 메서드
    void getNextCall();
    // 상담원에게 전화를 배분하는 메서드
    void sendCallToAgent();
}
