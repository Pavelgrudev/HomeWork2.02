package HogwartsM;
public  class Main<systema> {

    public static void main(String[] args) {;
Gryffindor garry=new Gryffindor("Garry", " Potter", 45, 22, 95, 88, 95);
Gryffindor hermione =new Gryffindor("Hermione", " Granger", 22, 22, 88, 75, 95);
Gryffindor ron =new Gryffindor("Ron ",  " Weasley", 22, 22, 79, 85, 89);
Puffenduy zachariah =  new Puffenduy("Zachariah", " Smith", 27, 22,55,99,78);
Puffenduy cedric = new Puffenduy("Cedric", " Diggory", 22, 22,88,98,55);
Puffenduy justin =  new Puffenduy("Justin", " Finch-Fletchley", 22, 22,88,98,42);
Kogtevran zhou =   new Kogtevran(" Zhou", " Chang", 22, 24, 44,79,95,88);
Kogtevran padma =  new Kogtevran("Padma", " Patil", 22, 22, 60,75,35,55);
Kogtevran marcus = new Kogtevran("Marcus", " Belbi.", 22, 22, 57,69,83,70);
Slizerin draco = new Slizerin("Draco"," Malfoy",22,22,68,55,33,4,44);
Slizerin graham = new Slizerin("Graham"," Montagu",22,22,33,65,22,33,44);
Slizerin gregory = new Slizerin("Gregory"," Goyle",22,27,33,33,33,33,55);
        System.out.println("=====================================================================");
        ron.compareGrif(garry);
        System.out.println();
        System.out.println("=====================================================================");
        zachariah.comparePuff(cedric);
        System.out.println();
        System.out.println("=====================================================================");
        marcus.compareKogt(padma);
        System.out.println("=====================================================================");
        draco.compareSliz(graham);
        System.out.println("=====================================================================");
        draco.compareHogwarts(garry);
        System.out.println();
        System.out.println("=====================================================================");
    }



}
























