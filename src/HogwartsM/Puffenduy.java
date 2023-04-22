package HogwartsM;

public class Puffenduy extends Hogwarts {
    protected String name;
    private String surName;
    private int sorcery;
    private int transgression;
    private  int hardworking;
    private int loyal;
    private int honest;

    public Puffenduy(String name, String surName, int sorcery, int transgression, int hardworking, int loyal, int honest) {
        super(name,surName,sorcery,transgression);
        this.name = name;
        this.surName = surName;
        this.sorcery = sorcery;
        this.transgression = transgression;
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
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

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
}
