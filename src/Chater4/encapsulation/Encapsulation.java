package Chater4.encapsulation;

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

class Pill {
    private SinivelCap sinivelCap;
    private SneezeCap sneezeCap;
    private SnuffleCap snuffleCap;

    public Pill() {
        sinivelCap = new SinivelCap();
        sneezeCap = new SneezeCap();
        snuffleCap = new SnuffleCap();
    }

    public void take() {
        sinivelCap.take();
        sneezeCap.take();
        snuffleCap.take();
    }
}

class ColdPatient {
    public void takePill(Pill pill) { pill.take(); }
}

public class Encapsulation {
    public static void main(String[] args) {
        ColdPatient coldPatient = new ColdPatient();
        coldPatient.takePill(new Pill());
        /*
        * 콧물 감기가 낫습니다!
        * 재치기가 낫습니다!
        * 코감기가 낫습니다!
        * */
    }
}
