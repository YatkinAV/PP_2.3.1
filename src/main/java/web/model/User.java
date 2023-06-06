package web.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    private String name;

    private String lastName;

    private Integer age;

    private String mail;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public User() {}

    public User(String name, String lastName, Integer age, String mail) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getMail() {
        return mail;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
