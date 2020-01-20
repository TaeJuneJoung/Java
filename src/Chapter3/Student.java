package Chapter3;

public class Student {
    /*
    * 학생이 추가될 때마다 ID가 자동으로 하나씩 증가하게 만들고 싶다.
    * */
    private static int serialNum = 1000;
    private int id;
    private String name;
    private String address;

    public Student() {}

    public Student(String name) {
        this.name = name;
        serialNum++;
        // 같은 인스턴스를 바라보기에 각 학생마다 고유한 id를 주기 위한 방도
        id = serialNum;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        address = "주소 없음";
        serialNum++;
        id = serialNum;
    }

    public void showStudentInfo() {
        System.out.println(name + ", " + address);
    }

    public String getStudentName() {
        return name;
    }

    //ID값은 변하지 않아야 하기에 Setter없이 Getter Method만 생성
    public int getId() {
        // 인스턴스 메소드 안에서는 static 변수를 사용할 수 있다.
        System.out.println(serialNum);
        return id;
    }

    public static int getSerialNum() {
        int i = 0;
        //name = "Lee"; //static method 안에서 인스턴스 변수를 사용할 순 없다.
        //Static은 인스턴스를 생성하지 않아도 사용할 수 있기에
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }
}
