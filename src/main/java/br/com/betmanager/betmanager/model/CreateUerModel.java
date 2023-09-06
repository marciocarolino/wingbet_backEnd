package br.com.betmanager.betmanager.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity(name = "user")
public class CreateUerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "nameUser")
    private String nameUser;

    @Column(name = "emailUser")
    private String emailUser;

    @Column(name = "password")
    private String password;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreateUerModel that)) return false;
        return getId() == that.getId() && Objects.equals(getEmailUser(), that.getEmailUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEmailUser());
    }
}
