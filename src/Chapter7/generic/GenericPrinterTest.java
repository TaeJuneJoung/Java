package Chapter7.generic;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        Powder powder = new Powder();
        powderPrinter.setMaterial(powder);
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        Plastic plastic = new Plastic();
        plasticPrinter.setMaterial(plastic);
        System.out.println(plasticPrinter);

        // 물을 재료로 하는 프린터는 아직 없기에 Meterial 클래스를 만들어서
        // 해당 클래스를 상속받는 클래스들만 제네릭에 쓸수 있게 설정
        // -> <T extends Meterial>
//        GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
//        Water water = new Water();

        powderPrinter.printing();
        plasticPrinter.printing();
    }
}
