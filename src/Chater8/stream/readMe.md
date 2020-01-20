# 스트림(Stream)

Java I/O에서 말하는 Stream과는 다른 Stream을 다뤄보자.

**자료의 연산을 수행하는 Stream**

자료의 대상과 관계없이 동일한 연산을 수행할 수 있는 기능(자료의 추상화)

배열, 컬렉션에 동일한 연산이 수행되어 일관성 있는 처리 가능

한번 생성하고 사용한 스트림은 재사용할 수 없다

스트림 연산은 기존 자료를 변경하지 않는다

중간 연산과 최종 연산으로 구분 된다

최종 연산이 수행되어야 모든 연산이 적용되는 지연 연산



## 스트림 연산 - 중간 연산

중간 연산 - filter(), map()

조건에 맞는 요소를 추출(filter()) 하거나 요소를 변환함(map())

문자열의 길이가 5이상인 요소만 출력하기

```java
sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.println(s));
```

1. 스트림 생성

```java
sList.stream()
```

2. 중간 연산

```java
sList.stream().filter(s -> s.length() >= 5)
```

3. 최종 연산

```java
sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.println(s));
```

고객 클래스에서 고객 이름만 가져오기

```java
customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
```



## 스트림 연산 - 최종 연산

스트림의 자료를 소모하면서 연산을 수행

최종 연산 후에 스트림은 더 이상 다른 연산을 적용할 수 없음

- forEach() : 요소를 하나씩 꺼내 옴
- count() : 요소의 개수
- sum() : 요소의 합

이 외도 여러가지 최종연산이 있다



### reduce() 연산

정의된 연산이 아닌 프로그래머가 직접 지정하는 연산을 적용

최종 연산으로 스트림의 요소를 소모하며 연산 수행



배열의 모든 요소의 합을 구하는 reduce()연산

```java
Arrays.stream(arr).reduce(0, (a,b) -> a+b);
```

`0` : 초기값

`(a, b)` : 전달되는 요소

`-> (a + b)` : 각 요소가 수행해야 할 기능

