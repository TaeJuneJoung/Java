# Workshop

Car 추상 클래스를 상속받는 Sonata, Avante, Grandeur, Genesis 클래스가 있습니다.

각 차는 주행하기 위해 다음 메서드의 순서로 움직입니다.

```java
run() {
    start();
    drive();
    stop();
    turnoff();
}
```

run() 메서드를 템플릿 메서드로 구현하고 CarTest 클래스를 참고하여 프로그램을 완성하세요.

```bash
`차종` 시동을 켭니다.
`차종` 달립니다.
`차종` 멈춤니다.
`차종` 시동을 끕니다.
```
