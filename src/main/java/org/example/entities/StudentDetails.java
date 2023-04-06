package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "student_details")
public class StudentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "studentnumber")
    private long stdNo;

    @Enumerated(value = EnumType.STRING)
    private TYPE type;

    private LocalDateTime accountCreated;

    @OneToOne(mappedBy = "studentDetails")
    private Student student;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getStdNo() {
        return stdNo;
    }

    public void setStdNo(long studentNumber) {
        this.stdNo = studentNumber;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
    public LocalDateTime getAccountCreated() {
        return accountCreated;
    }

    public void setAccountCreated(LocalDateTime accountCreated) {
        this.accountCreated = accountCreated;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

//    @Override
//    public String toString() {
//        return "StudentDetails{" +
//                "id=" + id +
//                ", stdNo=" + stdNo +
//                ", type=" + type +
//                ", accountCreated=" + accountCreated +
//                ", student=" + student +
//                '}';
//    }
}
