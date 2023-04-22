package HogwartsM;

import javax.print.attribute.standard.MediaSize;
import java.util.Comparator;
import java.util.Objects;

public class Gryffindor extends Hogwarts {
        protected String name;
        private String surName;
        private int sorcery;
        private int transgression;
        private int nobility;
        private int honor;
        private int courage;

        public Gryffindor(String name, String surName, int sorcery, int transgression, int nobility, int honor, int courage) {
                super(name, surName, sorcery, transgression);
                this.name = name;
                this.surName = surName;
                this.sorcery = sorcery;
                this.transgression = transgression;
                this.nobility = nobility;
                this.honor = honor;
                this.courage = courage;
        }


        public String getName() {
                return name;
        }

        public void setName(String name)   {
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


        public String toString() {

                int  jj= getSorcery() + getTransgression() + getCourage() + getHonor() + getNobility();
                return "Gryffindor{" +
                        "name='" + name + '\'' +
                        ", surName='" + surName + '\'' +
                        ", sorcery=" + sorcery +
                        ", transgression=" + transgression +
                        ", nobility=" + nobility +
                        ", honor=" + honor +
                        ", courage=" + courage +
                        '}';

        }

public class compareGriff {


}
}

