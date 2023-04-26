package HogwartsM;

public class Slizerin extends Hogwarts {
        private int cunning;
        private int determination;
        private int ambition;
        private int resourcefulness;
        private int thirstForPower;

    public Slizerin(String name, String surName, int sorcery, int transgression, int cunning,
                    int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name,surName,sorcery,transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
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

    @Override
    public String toString() {
        return "Slizerin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                ", name='" + getName() + '\'' +
                ", surName='" + getSurName() + '\'' +
                ", sorcery=" + getSorcery() +
                ", transgression=" + getTransgression() +
                '}';
    }
    public void compareSliz(Slizerin other){
       int  result=(this.getCunning()+this.getDetermination()+this.getAmbition()
     +this.getResourcefulness()+this.getThirstForPower())- (other.getCunning()+other.getDetermination()+other.getAmbition()
               +other.getResourcefulness()+other.getThirstForPower());
        if (result > 0) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + other.getName());
        } else if (result < 0) {
            System.out.printf(" %s слабее Слизеринца %s ", this.getName(), other.getName());
        } else {
            System.out.printf(" Сила Слизеринцев равна");}

    }
}
