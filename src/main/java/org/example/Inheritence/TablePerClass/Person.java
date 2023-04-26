package org.example.Inheritence.TablePerClass;

import jakarta.persistence.*;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class Person {

    @Id
    private int id;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    private String name;

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
