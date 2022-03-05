package practice;

import java.util.Objects;

public class Person {
    private String name;

    private String surname;

    private int age;

    private long identity;

    private String type;

    Person() {
    }

    public Person(String name, String surname, int age, long identity, String type) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.identity = identity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public long getIdentity() {
        return identity;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIdentity(long identity) {
        this.identity = identity;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "practice.Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", identity=" + identity +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && getIdentity() == person.getIdentity() && getName().equals(person.getName()) && getSurname().equals(person.getSurname()) && getType().equals(person.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getAge(), getIdentity(), getType());
    }


}
