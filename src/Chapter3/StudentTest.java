package Chapter3;

public class StudentTest {
    public static void main(String[] args) {
        Student stLee = new Student("Lee");
        System.out.println(stLee.getSerialNum()); // static 변수이기에 Student.getSerialNum()으로 접근하는 것이 옳다.

        Student stKim = new Student("Kim");
        System.out.println(stKim.getSerialNum());// static 변수이기에 Student.getSerialNum()으로 접근하는 것이 옳다.
        System.out.println(stLee.getSerialNum());// static 변수이기에 Student.getSerialNum()으로 접근하는 것이 옳다.

        /*
        * 2가지의 인스턴스가 동일한 메모리를 바라보고 있다.
        *
        * 학생마다 고유의 값을 가져야 하기에 생성자를 만들때 생성된 serialNum값을 id에 넣어주면 된다.
        * */
        System.out.println(stLee.getId());
        System.out.println(stKim.getId());
    }
}
