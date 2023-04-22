package HogwartsM;

public class Slizerin extends Hogwarts {
    protected String name;
    private String surName;
    private int sorcery;
    private int transgression;
     private int cunning;
        private int determination;
        private int ambition;
        private int resourcefulness;
        private int thirstForPower;

    public Slizerin(String name, String surName, int sorcery, int transgression, int cunning,
                    int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name,surName,sorcery,transgression);
        this.name = name;
        this.surName = surName;
        this.sorcery = sorcery;
        this.transgression = transgression;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
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

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
}
