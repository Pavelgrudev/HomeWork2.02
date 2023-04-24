package HogwartsM;

public abstract  class Hogwarts {
    protected String name;
    protected String surName;
    protected int sorcery;
    protected int transgression;

    public Hogwarts(String name, String surName, int sorcery, int transgression) {
        this.name = name;
        this.surName = surName;
        this.sorcery = sorcery;
        this.transgression = transgression;
    }
    public int compareClass() {
        int   total=getSorcery()+getTransgression();
    return getSorcery()+getTransgression();
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

    @Override
    public String toString() {
        return "Hogwarts{" +
                ", name='" + getName() + '\'' +
                ", surName='" + getSurName() + '\'' +
                ", sorcery=" + getSorcery() +
                ", transgression=" + getTransgression() +
                '}';
    }
    public void compare(Hogwarts other) {
        int result = this.getSorcery() + this.getTransgression() - other.getTransgression() + other.getSorcery();
        if (result > 0) {
            System.out.println( this.getName() + " " + this.getSurName() + " обладает большей мощностью магии, чем " + other.getName() + " " + other.getSurName());
    } else if(result<0){
            System.out.printf("%s%s обладает меньшей мощностью магии, чем %s%s", this.getName() , this.getSurName() , other.getName() , other.getSurName());}else {
            System.out.println(" Мощность магии учеников равна");
        }


    }


}