package exercises.complex.kidsCamp.src.main.java.com.kids.camp;

import java.util.List;

public class Group {

    private String color;
    private List<Children> childrenList;
    private SmallLeader smallLeader;
    private BigLeader bigLeader;

    public Group(String color, List<Children> childrenList, SmallLeader smallLeader, BigLeader bigLeader) {
        this.color = color;
        this.childrenList = childrenList;
        this.smallLeader = smallLeader;
        this.bigLeader = bigLeader;
    }

    public List<Children> getChildrenList() {
        return childrenList;
    }

    public SmallLeader getSmallLeader() {
        return smallLeader;
    }

    public BigLeader getBigLeader() {
        return bigLeader;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Group{" +
                "color='" + color + '\'' +
                ","+"\n"+" childrenList=" + "\n" +childrenList +
                ", smallLeader=" + smallLeader +
                ", bigLeader=" + bigLeader +
                '}';
    }
}
