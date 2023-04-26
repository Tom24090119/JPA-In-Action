package org.example.Inheritence.TablePerClass;

import jakarta.persistence.*;

@Entity
public class Student extends Person{

    @Column(name = "school_name")
    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

}
