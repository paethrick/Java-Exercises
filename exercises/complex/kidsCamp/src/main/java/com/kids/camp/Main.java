package exercises.complex.kidsCamp.src.main.java.com.kids.camp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Children
        List<Children> firstGroupList = new ArrayList<>();
        List<Children> secondGroupList = new ArrayList<>();
        List<Children> thirdGroupList = new ArrayList<>();
        List<Children> fourthGroupList = new ArrayList<>();
        for(int i=0; i< 10;i++){
            firstGroupList.add(new Children());
            secondGroupList.add(new Children());
            thirdGroupList.add(new Children());
            fourthGroupList.add(new Children());
        }

        //Leaders
        BigLeader campOfficer = new BigLeader();
        BigLeader bigLeader = new BigLeader();
        BigLeader bigLeader1 = new BigLeader();
        SmallLeader smallLeader = new SmallLeader();
        SmallLeader smallLeader1 = new SmallLeader();

        //Groups
        Group groupOne = new Group("Blue",firstGroupList,smallLeader,bigLeader1);
        Group groupTwo = new Group("Red",secondGroupList,smallLeader1,bigLeader1);
        Group groupThree = new Group("Orange",thirdGroupList,smallLeader1,bigLeader1);
        Group groupFour = new Group("Yellow",fourthGroupList,smallLeader1,bigLeader1);


        campOfficer.averageInspection(Arrays.asList(groupTwo,groupOne,groupThree,groupFour));
        campOfficer.MinMaxInseption(Arrays.asList(groupTwo,groupOne,groupThree,groupFour));
    }
}
