# Abstract

```java
public void display(){};
public abstract void typing();
```

위의 display같은 경우는 추상메서드가 아니라 바디를 비어놓은 메서드이다.

typing이 추상 메서드로서 `abstract`를 쓰지 않을 경우에 컴파일 에러가 표시된다.



추상 클래스는 상위 클래스에서 정의하고 하위 클래스에서 재정의 한다.

구현을 하위 클래스에 위임하게 된다.



```java
public abstract class Computer {

    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}

```

추상 메서드를 하나라도 정의한 class는 class도 `abstract`로 정의해야한다.

모든 메서드가 구현되었다고 해도 클래스에 `abstract`키워드를 사용하면 추상 클래스가 된다.

추상 클래스는 인스턴스를 생성할 수 없다. `new Computer()`불가





**한 개의 추상 메서드만 받아서 재정의 할 때,**

```java
public abstract class DeskTop extends Computer{

    @Override
    public void display() {

    }
}

```



**다 받아서 재정의 할 때,**

```java
public class DeskTop extends Computer{
    
    @Override
    public void display() {
        
    }

    @Override
    public void typing() {

    }
}
```

