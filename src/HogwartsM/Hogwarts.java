package HogwartsM;

public abstract class Hogwarts {
    protected String name;
    private String surName;
    private int sorcery;
    private int transgression;

    public Hogwarts(String name, String surName, int sorcery, int transgression) {
        this.name = name;
        this.surName = surName;
        this.sorcery = sorcery;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSorcery() {
        return sorcery;
    }

    public void setSorcery(int sorcery) {
        this.sorcery = sorcery;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
}