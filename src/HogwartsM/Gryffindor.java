package HogwartsM;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, String surName, int sorcery, int transgression, int nobility, int honor, int courage) {
        super(name, surName, sorcery, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                ", name='" + getName() + '\'' +
                ", surName='" + getSurName() + '\'' +
                ", sorcery=" + getSorcery() +
                ", transgression=" + getTransgression() +
                '}';
    }

    public void compareGrif(Gryffindor other) {
        int result = (this.getNobility() + this.getHonor() + this.getCourage())
                - (other.getNobility() + other.getHonor() + other.getCourage());
        if (result > 0) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + other.getName());
        } else if (result < 0) {
            System.out.printf(" %s слабее Гриффиндорца %s ", this.getName(), other.getName());
        } else {
            System.out.printf(" Сила Гриффиндорцов равна");
        }
    }


}




