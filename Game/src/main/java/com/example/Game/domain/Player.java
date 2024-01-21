package com.example.Game.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import jakarta.persistence.*;



@Entity
@Table(name = "Player")
//@JacksonXmlRootElement
@JsonPropertyOrder(alphabetic = true)
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   // @JsonIgnore
    private String name;

    private String game;
    private int age;

    public Player() {
    }

    public Player(int id, String name, String game, int age) {
        this.id = id;
        this.name = name;
        this.game = game;
        this.age = age;
    }

    public Player(String name, String game, int age) {
        this.name = name;
        this.game = game;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", game='" + game + '\'' +
                ", age=" + age +
                '}';
    }
}
