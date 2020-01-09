package Chater5.ploymorphism;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void read() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 걷습니다.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아다닙니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

//      hAnimal.read(); //Animal로 인스턴스를 만들었기에 read는 동작하지 않음
        //사용하기 위해서는 다운 캐스팅이 필요

        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
