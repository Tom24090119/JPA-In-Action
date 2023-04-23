package org.example;

import jakarta.persistence.*;

import java.util.HashMap;
import java.util.Map;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ElementCollection// To tell JPA that is not a relationship is that being mapped.
    @CollectionTable(name = "phoneDetails",joinColumns = @JoinColumn(name = "person"))
    @MapKeyColumn(name = "type")
    @Column(name = "number")
    @MapKeyEnumerated(value = EnumType.STRING)
    private Map<PhoneType, String> phoneNumbers = new HashMap<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<PhoneType, String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Map<PhoneType, String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
