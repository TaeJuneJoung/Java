package Chater4.notEncapsulation;

class SinivelCap {
    public void take() {
        System.out.println("콧물 감기가 낫습니다!");
    }
}

class SneezeCap {
    public void take() {
        System.out.println("재치기가 낫습니다!");
    }
}

class SnuffleCap {
    public void take() {
        System.out.println("코감기가 낫습니다!");
    }
}

class ColdPatiend {
    public void takeSinivelCap(SinivelCap cap) { cap.take(); }
    public void takeSneezeCap(SneezeCap cap) { cap.take(); }
    public void takeSnuffleCap(SnuffleCap cap) { cap.take(); }
}

public class NotEncapsulation {
    public static void main(String[] args) {
        ColdPatiend sufferer = new ColdPatiend();
        sufferer.takeSinivelCap(new SinivelCap());
        sufferer.takeSneezeCap(new SneezeCap());
        sufferer.takeSnuffleCap(new SnuffleCap());
    }
}
