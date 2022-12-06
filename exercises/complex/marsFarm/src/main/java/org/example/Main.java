package exercises.complex.marsFarm.src.main.java.org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Almond a = new Almond();
        Almond a1 = new Almond();
        Almond a2 = new Almond();
        Almond a3 = new Almond();
        Almond a4 = new Almond();
        Almond a5 = new Almond();

        Juniper j = new Juniper();
        Juniper j1 = new Juniper();
        Juniper j2 = new Juniper();
        Juniper j3 = new Juniper();
        Juniper j4 = new Juniper();
        Juniper j5 = new Juniper();

        Spruce s = new Spruce();
        Spruce s1 = new Spruce();
        Spruce s2 = new Spruce();
        Spruce s3 = new Spruce();
        Spruce s4 = new Spruce();
        Spruce s5 = new Spruce();


        List<Plant> plants = Arrays.asList(a,a2,a3,a4,a5,a1,j,j1,j2,j3,j4,j5,s,s1,s2,s3,s4,s5);
        List<Plant> plants2 = Arrays.asList(a,j,s);
        Farm farm = new Farm(plants);
        System.out.println(farm.calculateProd(100));

    }
}