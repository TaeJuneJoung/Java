# 컬렉션 프레임워크

## List 인터페이스

**Collection 하위 인터페이스**

객체를 순서에 따라 저장하고 관리하는데 필요한 메서드가 선언된 인터페이스

배열의 기능을 구현하기 위한 메서드가 선언됨

ArrayList, Vector, LinkedList



**ArrayList와 Vector**

객체 배열 클래스

Vector는 자바 2부터 제공된 클래스

일반적으로 ArrayList를 더 많이 사용한다.

Vector는 멀티 쓰레드 프로그램에서 동기화를 지원한다.

동기화(synchronization) : 두 개의 쓰레드가 동시에 하나의 리소스에 접근할 때 순서를 맞추어서 데이터의 오류가 방지하지 않도록 함

capacity와 size는 다른 의미이다.

capacity는 용량 / size는 크기



**ArrayList와 LinkedList**

둘다 자료의 순차적 구조를 구현한 클래스

ArrayList는 배열을 구현한 클래스로 논리적 순서와 물리적 순서가 동일하다

LinkedList는 논리적으로 순차적인 구조지만, 물리적으로는 순차적이지 않을 수 있다.

LinkedList구조 -> (data)(다음요소의 주소) -> (data)(다음 요소의 주소) -> (data)(다음 요소의 주소) ...



### ArrayList

```java
private static final int DEFAULT_CAPACITY = 10;
```

### Vector

```java
public synchronized void
```

멀티쓰레드를 고려한 synchronized가 쓰여 있다.





## Iterator로 순회하기

### Collection의 객체를 순회하는 인터페이스

iterator() 메서드 호출

```java
Iterator ir = memberArrayList.iterator();
```

Iterator에 선언된 메서드

| 메서드             | 설명                                                         |
| ------------------ | ------------------------------------------------------------ |
| boolean hashNext() | 이후에 요소가 더 있는지를 체크하는 메서드이며, 요소가 있다면 true 반환 |
| E next()           | 다음에 있는 요소를 반환                                      |



## Set 인터페이스

Collection 하위의 인터페이스

중복을 허용하지 않음

List는 순서 기반의 인터페이스이지만, Set은 순서가 없다

get(i) 메서드가 제공되지 않음(`Iterator`로 순회)

저장된 순서와 출력 순서는 다를 수 있다

아이디, 주민번호, 사번 등 유일한 값이나 객체를 관리할 때 사용

HashSet, TreeSet 클래스



### Set 인터페이스를 구현한 클래스

중복을 허용하지 않으므로 저장되는 객체의 동일 여부를 알기 위해 `equals()`와 `hashCode()` 메서드를 재정의 해야 한다.



## TreeSet 클래스

객체의 정렬에 사용되는 클래스

중복을 허용하지 않으면서 오름차순이나 내림차순으로 객체를 정렬 한다.

내부적으로 이진 검색 트리(binary search tree)로 구현되어 있다

이진 검색 트리에 자료가 저장될 때 비교하여 저장될 위치를 정함

객체 비교를 위해 `Comparable`이나 `Comparator` 인터페이스를 구현해야 한다.



### Comparable 인터페이스와 Comparator 인터페이스

정렬 대상이 되는 클래스가 구현해야 하는 인터페이스

Comparable은 compareTo() 메서드를 구현

: 매개 변수와 객체 자신(this)를 비교

Comparator는 compare() 메서드를 구현

: 두개의 매개 변수를 비교

TreeSet생성자에 Comparator가 구현된 객체를 매개변수로 전달

```java
TreeSet<Member> treeSet = new TreeSet<Member>(new Member());
```

일반적으로 Comparable을 더 많이 사용

이미 Comparable이 구현된 경우 Comparator를 이용하여 다른 정렬 방식을 정의할 수 있음





## Map 인터페이스

key-value pair의 객체를 관리하는데 필요한 메서드가 정의

key는 중복될 수 없다

검색을 위한 자료 구조

key를 이용하여 값을 저장하거나 검색, 삭제할 때 사용하면 편리

내부적으로 hash방식으로 구현됨

```
index = hash(key) //index는 저장 위치
```

key가 되는 객체는 객체의 유일성함의 여부를 알기 위해 equals()와 hashCode()메서드를 재정의함



### HashMap 클래스

Map 인터페이스를 구현한 클래스 중 일반적으로 사용하는 클래스

HashTable 클래스는 자바2부터 제공된 클래스로 Vector처럼 동기화를 제공함

pair자료를 쉽고 빠르게 관리할 수 있다





### TreeMap 클래스

key객체를 정렬하여 key-value를 pair로 관리하는 클래스

key에 사용되는 클래스에 Comparable, Comparator 인터페이스를 구현

java에 많은 클래스들은 이미 Comparable이 구현되어 있음

구현된 클래스를 key로 사용하는 경우는 구현할 필요 없음

```java
public final class Integer extends Number implements Comparable<integer> {
    public int compareTo(Integer anotherInteger) {
        return compare(this.value, anotherInteger.value);
    }
}
```

