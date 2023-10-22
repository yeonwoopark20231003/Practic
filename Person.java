package Practic;

public class Person {
    // 필드 선언
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
