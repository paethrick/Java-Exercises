package exercises.simple.network.src.main.java.com.network;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lightweight l1 = new Lightweight(1,1000);
        Lightweight l2 = new Lightweight(2,800);
        Lightweight l3 = new Lightweight(3,800);

        Smart s1 = new Smart(3,1000,"bob",ScreenSize.HD);
        Smart s2 = new Smart(1,2000,"bob2",ScreenSize.UHD);

        Normal n1 = new Normal(4,700,2010,ScreenSize.HD);
        Normal n2 = new Normal(10,500,1995,ScreenSize.HD);

        Network network = new Network(Arrays.asList(l1,l2,s1,s2,n1,n2));
        System.out.println(l1.getLWDevices(network));
        System.out.println(network.checkNormalDevices(s1,400));
        System.out.println(network.getAllDevices());

        System.out.println(s1.getPower());
        s1.losePower(network);
        l3.losePower(network);
        System.out.println(l3.getPower());
        System.out.println(s1.getPower());
    }
}
