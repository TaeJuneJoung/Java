package Chapter7.generic;

public class GenericPrinter<T extends Meterial> { //제네릭 클래스 T: type의 약자. 자료형 매개변수
    private T material;

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return material.toString();
    }

    public void printing() {
        material.doPrinting();
    }
}
