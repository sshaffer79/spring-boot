package com.shaffer.dto;

import com.shaffer.model.Publisher;
import com.shaffer.model.Sex;

import java.util.List;
import java.util.Objects;

public class CharacterDTO {
    private int id;
    private String name;
    private List<String> aliases;
    private Publisher publisher = Publisher.Independent;
    private List<String> affiliations;
    private int powerLevel = 0;
    private Sex sex = Sex.NA;
    private List<String> abilities;

    public CharacterDTO() {
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

    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public List<String> getAffiliations() {
        return affiliations;
    }

    public void setAffiliations(List<String> affiliations) {
        this.affiliations = affiliations;
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

    public List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharacterDTO that = (CharacterDTO) o;
        return id == that.id &&
                powerLevel == that.powerLevel &&
                Objects.equals(name, that.name) &&
                Objects.equals(aliases, that.aliases) &&
                publisher == that.publisher &&
                Objects.equals(affiliations, that.affiliations) &&
                sex == that.sex &&
                Objects.equals(abilities, that.abilities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, aliases, publisher, affiliations, powerLevel, sex, abilities);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CharacterDTO{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", aliases=").append(aliases);
        sb.append(", publisher=").append(publisher);
        sb.append(", affiliations=").append(affiliations);
        sb.append(", powerLevel=").append(powerLevel);
        sb.append(", sex=").append(sex);
        sb.append(", abilities=").append(abilities);
        sb.append('}');
        return sb.toString();
    }
}
