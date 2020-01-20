package Chapter10.steam.serialization;

import java.io.*;

class Person implements Externalizable {
    String name;
    transient String job; //transient -> 이 값은 직렬화하지 말라는 뜻

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return name + ", " + job;
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {

    }
}

public class SerializationTest {
    public static void main(String[] args) {
        Person lee = new Person("이순신", "엔지니어");
        Person kim = new Person("김유신", "선생님");

        try(FileOutputStream fos = new FileOutputStream("./src/Chapter10/assets/serial.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(lee);
            oos.writeObject(kim);
            //java.io.NotSerializableException: Chapter10.steam.serialization.Person
            // -> implements serailizable을 받아줘야 한다.
        } catch(IOException e) {
            System.out.println(e);
        }

        try(FileInputStream fis = new FileInputStream("./src/Chapter10/assets/serial.dat");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person p1 = (Person)ois.readObject();
            Person p2 = (Person)ois.readObject();

            System.out.println(p1);
            System.out.println(p2);
        } catch(IOException e) {
            System.out.println(e);
        } catch(ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
