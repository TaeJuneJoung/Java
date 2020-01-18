package Chater7.string;

public class StringTest {
    public static void main(String[] args) {
        //인스턴스
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1 == str2); //false

        //상수풀
        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4); //true


        /* String 문자열 immutable */
        String java = new String("java");
        String android = new String("android");
        System.out.println(System.identityHashCode(java));

        java = java.concat(android);

        System.out.println(java);
        System.out.println(System.identityHashCode(java)); //주소값이 변환 것을 보면 다시 재할당됨을 알 수 있다.
    }
}
