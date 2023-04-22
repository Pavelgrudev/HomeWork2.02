package HogwartsM;

public class Kogtevran extends Hogwarts{
    protected String name;
    private String surName;
    private int sorcery;
    private int transgression;
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

 ;public Kogtevran(String name, String surName, int sorcery, int transgression, int smart,
                   int wise, int witty, int fullOfCreativity) {
        super(name,surName,sorcery,transgression);
        this.name = name;
        this.surName = surName;
        this.sorcery = sorcery;
        this.transgression = transgression;
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
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

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }
}
