package exercises.complex.kidsCamp.src.main.java.com.kids.camp;

import java.util.List;

public class BigLeader extends Person{

    public BigLeader() {
    }

    public void averageInspection(List<Group> group){
        double tidyPoints = 0;
        for(Group g : group){
            if(g.getBigLeader() == this){
                throw new IllegalArgumentException("Leaders cannot inspect their own color groups");
            } else {
                List<Children> children = g.getChildrenList();
                for(Children child : children){
                    tidyPoints += child.getBedType().getTidyPoints();
                }
            }
        }
        double tidiestPoints = tidyPoints / (group.size() * 10);
        System.out.println("The average points are " + tidiestPoints);
    }

    public void MinMaxInseption(List<Group> group){
        double tidyPoints = 0;
        double dirtyPoints = 100;
        String tidyGroupName = "";
        String dirtyGroupName= "";
        for(Group g : group){
            if(g.getBigLeader() == this){
                throw new IllegalArgumentException("Leaders cannot inspect their own color groups");
            } else {
                List<Children> children = g.getChildrenList();
                double pointBuilder = 0;
                for(Children child : children){
                    pointBuilder += child.getBedType().getTidyPoints();
                }
                if (pointBuilder> tidyPoints){
                    tidyGroupName = g.getColor();
                    tidyPoints = pointBuilder;
                }
                if(pointBuilder<dirtyPoints){
                    dirtyGroupName = g.getColor();
                    dirtyPoints = pointBuilder;
                }
            }
        }
        System.out.println("The tidiest group is group " + tidyGroupName + " with " + tidyPoints + " points!");
        System.out.println("The dirtiest group is group " + dirtyGroupName + " with " + dirtyPoints + " points!");
    }
}
