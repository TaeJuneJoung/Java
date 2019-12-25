# Chater 3

## static 변수

> Student <br/>
> StudnetTest


## Singleton Pattern

디자인 패턴에 하나인 싱글톤

단 하나만 존재해야하는 인스턴스가 필요할 때가 있다.

- 생성자 private
- static으로 유일한 객체 생성
- 외부에서 유일한 객체 참조 -> public static get() 메서드 구현

| Singleton                      |
| ------------------------------ |
| - instance                     |
| - Singleton<br />+ getInstance |

`Calendar` 클래스도 싱글톤으로 구현되어 있다.
이와 같이 싱글톤으로 구현되어 있는 기존의 클래스들도 있다.

> Company <br/>
> CompanyTest


## WorkShop01

- Static
- SingleTon