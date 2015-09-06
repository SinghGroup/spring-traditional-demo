package com.demo.models;

import javax.persistence.*;

/**
 * Created by deepak singh on 06-Sep-15.
 */
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "userseq", sequenceName = "userseq")
    private int id;
    @Column
    private String userName;
    @Column
    private String passWord;
    @Column
    private String name;

    public Users(String userName, String passWord, String name) {
        this.userName = userName;
        this.passWord = passWord;
        this.name = name;
    }

    public Users() {
        this("","","");
    }

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

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
