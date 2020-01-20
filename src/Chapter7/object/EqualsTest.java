package Chapter7.object;

class Student {
    int studentNum;
    String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student std = (Student) obj;
            return (this.studentNum == std.studentNum);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }
}

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {
//        String str1 = new String("abc");
//        String str2 = new String("abc");
//
//        System.out.println(str1 == str2); //메모리값이 같은가 확인: false
//        System.out.println(str1.equals(str2)); //값이 같은가 확인: true
        // String의 경우 equals는 메모리값에서 접근한 값에 대한 비교만 하여 return boolean

        Student lee = new Student(100, "이순신");
        Student lee2 = lee;
        Student shin = new Student(100, "이순신");

        System.out.println(lee == lee2); //true
        System.out.println(lee == shin); //false
        System.out.println(lee.equals(shin)); //false -> 학번이 같으면 같은 학생으로 판단하기 위해 재정의 진행
        // Override 후에 true

        System.out.println(lee.hashCode());
        System.out.println(shin.hashCode());
        // 2개의 hashCode가 다를 때 다른 값을 가지게 된다는 뜻이니 equals를 오버라이딩하면 hashcCode도 같이 오버라이딩 한다.
        //Override 후에 같은 값을 가지게 함(그렇게 설정하였기에)

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);
        System.out.println(i1.equals(i2));
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        // 원래 가지고 있는 실제 hashCode값
        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));

        /* clone() */
        Book book = new Book("토지", "박경리");
        System.out.println(book);
        Book book2 = (Book) book.clone();
        System.out.println(book2); //CloneNotSupportedException -> cloneable을 사용하지 않았기에 생김
        // 해결하기 위해 Book이 Cloneable 인터페이스를 상속받음
    }
}
