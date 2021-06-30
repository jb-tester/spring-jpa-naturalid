package com.mytests.spring.data.springjpacustomrepos;


import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
@Table(name = "PERSON")
public class Person {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;
    int age;
    @NaturalId Integer card;

    public Person() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getCard() {
        return card;
    }

    public void setCard(Integer card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
