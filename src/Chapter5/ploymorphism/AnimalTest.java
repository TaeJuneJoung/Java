package Chapter5.ploymorphism;

import java.util.ArrayList;

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

    public void hunting() { System.out.println("호랑이가 사냥을 합니다."); }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아다닙니다.");
    }

    public void fly() { System.out.println("독수리가 날기 시작합니다."); }
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

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for(Animal animal : animalList) {
            animal.move();
        }

        /* 다운 캐스팅 */
//      Eagle eagle = (Eagle) hAnimal; //컴파일 에러는 안뜨지만 실행시 오류 발생
        if(hAnimal instanceof Eagle) {
            Eagle human = (Eagle) hAnimal;
            System.out.println("Eagle 들어오는가?"); //들어오지 않음
        }

        if(hAnimal instanceof Human) {
            Human human = (Human) hAnimal;
            System.out.println("Human 들어오는가?"); //들어옴
        }

        test.testDownCasting(animalList);
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }

    public void testDownCasting(ArrayList<Animal> list) {
        for(int i=0; i<list.size(); i++) {
            Animal animal = list.get(i);

            if(animal instanceof  Human) {
                Human human = (Human) animal;
                human.read();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.fly();
            } else {
                System.out.println("Error!");
            }
        }
    }
}
