package HogwartsM;

public class Puffenduy extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Puffenduy(String name, String surName, int sorcery, int transgression, int hardworking, int loyal, int honest) {
        super(name, surName, sorcery, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
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

    @Override
    public String toString() {
        return "Puffenduy{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                ", name='" + getName() + '\'' +
                ", surName='" + getSurName() + '\'' +
                ", sorcery=" + getSorcery() +
                ", transgression=" + getTransgression() +
                '}';
    }

    public void comparePuff(Puffenduy other) {
        int result = (this.getHardworking() + this.getLoyal() + this.getHonest()) - (other.getHardworking() + other.getLoyal() + other.getHonest());
        if (result > 0) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + other.getName());
        } else if (result < 0) {
            System.out.printf(" %s слабее Пуффендуйца %s ", this.getName(), other.getName());
        } else {
            System.out.printf(" Сила Пуффендуйцев равна");
        }
    }
}