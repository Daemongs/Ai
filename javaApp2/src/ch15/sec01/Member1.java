package ch15.sec01;

import java.util.Objects;

public class Member1 {

    String name;
    int age;

    public Member1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // equals() 메서드도 함께 재정의하는 것이 좋습니다.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Member1 member = (Member1) obj;
        return age == member.age && name.equals(member.name);
    }

    public static void main(String[] args) {
        Member1 m1 = new Member1("홍길동", 25);
        Member1 m2 = new Member1("홍길동2", 25);

        // 해시 코드 출력
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
    }
}