## 예외 처리

### 오류란 무엇인가?

컴파일 오류 : 프로그램 코드 작성 중 발생하는 문법적 오류

실행 오류 : 실행 중인 프로그램이 의도 하지 않은 동작을 하거나(bug) 프로그램이 중지 되는 오류(runtime error)

자바는 예외 처리를 통하여 프로그램의 비정상 종료를 막고 log를 남길 수 있음



### 오류와 예외 클래스

시스템 오류(error) : 가상 머신에서 발생, 프로그래머가 처리 할 수 없음.

​	동적 메모리를 다 사용한 경우(stackotverflow 등)

예외(Exception) : 프로그램에서 제어할 수 있는 오류.

​	읽으려는 파일이 없는 경우, 네트웍이나 소켓 연결 오류 등 자바 프로그램에서는 예외에 대한 처리를 수행함



### 예외 클래스

모든 예외 클래스의 최상위 클래스는 Exception 클래스



#### try - catch문으로 예외 처리

```java
try {
    // 예외가 발생할 수 있는 코드 부분
} catch(처리할 예외 타입 e) {
    // try블록 안에서 예외가 발생했을 때 수행되는 부분
} finally {
    // 예외 발생 여부와 상관 없이 항상 수행 되는 부분
    // 리소스를 정리하는 코드를 주로 씀
}
```

**example**

```java
FileInputStream fis = null;
try {
    fis = new FileInputStream("a.txt");
} catch (FileNotFoundException e) {
    System.out.println(e);
} finally {
    try {
        fis.close();
        System.out.println("finally");
    } catch (Exception e) {
        System.out.println(e);
    }
}
System.out.println("end");
```





#### try-with-resources문

리소스를 자동으로 해체하도록 제공하는 구문

해당 리소스가 AutoCloseable을 구현한 경우 close()를 명시적으로 호출하지 않아도 try{} 블록에서 오픈된 리소스는 정상적인 경우나 예외가 발생한 경우 모두 자동으로 close()가 호출 됨

자바 7부터 제공

FileInputStream의 경우 AutoCloseable을 구현하고 있음



**example**

```java
try(FileInputStream fis = new FileInputStream("a.txt")) {
    System.out.println("출력");
} catch(FileNotFoundException e) {
    System.out.println(e);
} catch(IOException e) {
    System.out.println(e);
}
System.out.println("end");
```



#### AutoCloseable 인터페이스 사용하기

AutoCloseable 인터페이스를 구현한 클래스를 만들고 close()가 잘 호출되는지 확인해보자

```java
public class AutoCloseObj implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("리소스가 close() 되었습니다.");
    }
}
```



### 예외 처리 미루기

thorws를 사용하여 예외처리 미루기

try{} 블록으로 예외를 처리하지 않고, 메서드 선언부에 throws를 추가

예외가 발생한 메서드에서 예외 처리를 하지 않고 이 메서드를 호출한 곳에서 예외 처리를 한다는 의미

main에서 throws를 사용하면 가상머신에서 처리됨



#### 다중 예외 처리하기

하나의 try{} 블록에서 여러 예외가 발생하는 경우 catch{} 블록 한곳에서 처리하거나 여러 catch{} 블록으로 나누어 처리 할 수 있음

가장 최상위 클래스인 Exception 클래스는 가장 마지막 블록에 위치 해야함

```java
public static void main(String[] args) {
    ThrowsException test = new ThrowsException();

    try {
        test.loadClass("b.txt", "java.lang.string");
    } catch (FileNotFoundException e) {
        System.out.println(e); //파일이 없기에
    } catch (ClassNotFoundException e) {
        System.out.println(e); //string이 소문자 s이므로
    } catch (Exception e) { //이외의 에러가 있을수도 있기에... default Exception
        // 에러도 순차적으로 걸린다. -> Exception은 최상위이기에 맨 마지막에 선언
        System.out.println(e);
    }
}
```



#### 사용자 정의 예외

JDK에서 제공되는 예외 클래스 외에 사용자가 필요에 의해 예외 클래스를 정의하여 사용

기존 JDK 클래스에서 상속받아 예외 클래스 만듬

```java
public class IDFormatException extends Exception {
    public IDFormatException(String message) { //생성자의 매개변수로 예외 상황 메시지를 받음
        super(message);
    }
}
```

throw 키워드로 예외를 발생 시킴



