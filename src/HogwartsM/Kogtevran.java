package HogwartsM;

public class Kogtevran extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;
 ;public Kogtevran(String name, String surName, int sorcery, int transgression, int smart,
                   int wise, int witty, int fullOfCreativity) {
        super(name,surName,sorcery,transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
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

    @Override
    public String toString() {
        return "Kogtevran{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", fullOfCreativity=" + fullOfCreativity +
                ", name='" + getName() + '\'' +
                ", surName='" + getSurName() + '\'' +
                ", sorcery=" + getSorcery() +
                ", transgression=" + getTransgression() +
                '}';
    }
}
