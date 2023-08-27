package br.com.betmanager.betmanager.model;

import jakarta.persistence.*;

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
}
