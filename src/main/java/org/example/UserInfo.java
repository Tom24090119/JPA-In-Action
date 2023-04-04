package org.example;

import jakarta.persistence.*;

/**
 *
 * CREATE TABLE `JPA-In-Action`.`user` (
 *   `id` INT NOT NULL AUTO_INCREMENT,
 *   `name` VARCHAR(45) NULL,
 *   `status` VARCHAR(45) NULL,
 *   `happy` TINYINT NULL,
 *   PRIMARY KEY (`id`));
 *
 */

@Entity
@Table(name = "user")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String userName;

    @Column(name = "happy")
    private boolean isHappy;

    @Enumerated(value = EnumType.STRING)
    @Basic(optional = false)
    private Status status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isHappy() {
        return isHappy;
    }

    public void setHappy(boolean happy) {
        isHappy = happy;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", isHappy=" + isHappy +
                ", status=" + status +
                '}';
    }
}
