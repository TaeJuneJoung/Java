package Chapter7.generic;

public class Powder extends Meterial {
    @Override
    public String toString() {
        return "재료는 Powder입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("Powder로 프린팅 합니다.");
    }
}
