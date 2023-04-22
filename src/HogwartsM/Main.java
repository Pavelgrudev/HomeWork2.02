package HogwartsM;

import java.util.Arrays;

public  class Main {

    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Garry", "Potter", 45, 45,95,88,95),
                new Gryffindor("Hermione", "Granger", 22, 22,88,75,95),
                new Gryffindor("Ron ","Weasley",22, 22,79,85,89)};
        System.out.println("=========================================================================");
        System.out.println("Имя " + " Фамилия " + " Колдовство " + " Трансгрессия " +);
       // System.out.println("На факультете Gryffindor обучаются " + gryffindors.length + " человека");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя " + " Фамилия " + " Колдовство " + " Трансгрессия " + " Благородство " + gryffindor.getNobility() + " Честь "
                    + gryffindor.getHonor() + " Храбрость " + gryffindor.getCourage());
        }
        System.out.println("=========================================================================");
        Puffenduy[] puffenduyes = {
                new Puffenduy("Zachariah", "Smith", 27, 22,55,99,78),
                new Puffenduy("Cedric", "Diggory", 22, 22,88,98,55),
                new Puffenduy("Justin", "Finch-Fletchley", 22, 22,88,98,42)};
        //System.out.println("На факультете Puffenduy обучаются " + puffenduyes.length + " Человека");
        for (int i = 0; i < puffenduyes.length; i++) {
            Puffenduy puffenduy = puffenduyes[i];
            System.out.println("Имя " + " Фамилия " + " Колдовство " + " Трансгрессия " + " Трудолюбие " + puffenduy.getHardworking() + " Верность "
                    + puffenduy.getLoyal() + " Честность  " + puffenduy.getHonest());
        }
        System.out.println("=============================================================================");
        Kogtevran[] kogtevrans = {
    new Kogtevran(" Zhou", " Chang", 22, 24, 44,79,95,88),
    new Kogtevran("Padma", "Patil", 22, 22, 60,75,35,55),
    new Kogtevran("Marcus", "Belbi.", 22, 22, 57,69,83,70)};
        // System.out.println("На факультете Kogtevran обучаются " + kogtevrans.length + " Человека");
        for (int i = 0; i < kogtevrans.length; i++) {
            Kogtevran kogtevran = kogtevrans[i];
            System.out.println("Имя " + " Фамилия " + " Колдовство " + " Трансгрессия " + " Ум " + kogtevran.getSmart() + " Мудрость " +
                    kogtevran.getWise() + " Остроумие " + kogtevran.getWitty() + " Полны творчества " + kogtevran.getFullOfCreativity());}
        System.out.println("================================================================================");
Slizerin [] slizerins= {
        new Slizerin("Draco","Malfoy",22,22,44,55,33,4,44),
        new Slizerin("Graham","Montagu",22,22,33,65,22,33,44),
        new Slizerin("Gregory","Goyle",22,27,,33,33,33,33)};
        //System.out.println("На факультете Slizerin обучаются " + slizerins.length + " Человека");
        for (int i = 0; i < slizerins.length; i++) {
            Slizerin slizerin = slizerins[i];
            //System.out.println(slizerins[i]);
            System.out.println("Имя " + " Фамилия " + " Колдовство " + " Трансгрессия " + "Хитрость " + slizerin.getCunning() + " Решительность " +
                    slizerin.getDetermination() + " Амбициозность " + slizerin.getAmbition() +
                    " Находчивость " + slizerin.getResourcefulness() + " Жажда власти " + slizerin.getThirstForPower());}
        System.out.println("================================================================================");
int[]kkk={1,2,3,4,5,6,7};
        //  Arrays.toString(kkk);
        for (int i = 0; i < kkk.length; i++)
            System.out.println(kkk[i]);





    }}











