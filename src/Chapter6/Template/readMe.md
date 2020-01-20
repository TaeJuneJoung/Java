# Template


## Pratice
class Car
method:
- startCar()
- <i>drive()</i>
- <i>stop()</i>
- turnOff()
- run()

sub class:
- AICar
- ManualCar

### final
- 변수

    값을 변경할 수 없는 상수, 오직 한번만 값을 할당할 수 있다.
    프로젝트 구현시, 여러 파일에서 공유해야 하는 상수 값은 하나의 파일에 선언하여 사용하면 편리하다.
    ```java
    public class Define {
      public static final int MIN = 1;
      ...
  }
    ```

- 메서드

    하위 클래스에서 재정의 할 수 없다.

- 클래스

    상속할 수 없다. ex) Java의 String 클래스