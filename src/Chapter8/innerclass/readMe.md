# 내부 클래스란?

클래스 내부에 구현한 클래스(중첩된 클래스)

클래스 내부에서 사용하기 위해 선언하고 구현하는 클래스

주로 외부 클래스 생성자에서 내부 클래스를 생성



## 내부 클래스 유형

| 종류                 | 구현 위치                                         | 사용할 수 있는 외부 클래스 변수        | 생성 방법                                                    |
| -------------------- | ------------------------------------------------- | -------------------------------------- | ------------------------------------------------------------ |
| 인스턴스 내부 클래스 | 외부 클래스 멤버 변수와 동일                      | 외부 인스턴스 변수<br />외부 전역 변수 | 외부 클래스를 먼저 만든 후<br />내부 클래스 생성             |
| 정적 내부 클래스     | 외부 클래스 멤버 변수와 동일                      | 외부 전역 변수                         | 외부 클래스와 무관하게 생성                                  |
| 지역 내부 클래스     | 메서드 내부에 구현                                | 외부 인스턴스 변수<br />외부 전역 변수 | 메서드를 호출할 때 생성                                      |
| 익명 내부 클래스     | 메서드 내부에 구현<br />변수에 대입하여 직접 구현 | 외부 인스턴스 변수<br />외부 전역 변수 | 메서드를 호출할 때 생성되거나,<br />인터페이스 타입 변수에 대입할 때 new 예약어를 사용하여 생성 |

익명 내부 클래스를 안드로이드 프로그래밍에서 자주 사용함

