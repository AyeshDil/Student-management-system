package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private Long id;

    @Column(name = "student_name", nullable = false)
    private String name;

    @Column(name = "student_address")
    private String address;

    @Column(name = "student_gender")
    private String gender;

    public Student() {
    }

    public Student(Long id, String name, String address, String gender) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
