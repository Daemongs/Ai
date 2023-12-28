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

    // equals() �޼��嵵 �Բ� �������ϴ� ���� �����ϴ�.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Member1 member = (Member1) obj;
        return age == member.age && name.equals(member.name);
    }

    public static void main(String[] args) {
        Member1 m1 = new Member1("ȫ�浿", 25);
        Member1 m2 = new Member1("ȫ�浿2", 25);

        // �ؽ� �ڵ� ���
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
    }
}