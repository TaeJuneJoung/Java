package Chapter1;

public class StudentTest {
    public static void main(String[] args) {
        /** 지역변수 **/
        Student st = new Student();
        st.setStudentName("Java");
        st.setStudentAddress("Oracle");
        st.showStudentInfo();

        Student st2 = new Student();
        st2.setStudentName("Class&");
        st2.setStudentAddress("Instance");
        st2.showStudentInfo();
    }
}
