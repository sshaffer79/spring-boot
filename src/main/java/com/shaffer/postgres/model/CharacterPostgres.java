package com.shaffer.postgres.model;

import com.shaffer.dto.CharacterDTO;
import com.shaffer.model.Sex;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "character")
public class CharacterPostgres {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private String name;
    private int powerLevel = 0;
    private Sex sex = Sex.NA;

    public CharacterPostgres() {
    }

    public CharacterPostgres(CharacterDTO dto) {
        this.id = dto.getId();
        this.name = dto.getName();
        this.powerLevel = dto.getPowerLevel();
        this.sex = dto.getSex();
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

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
