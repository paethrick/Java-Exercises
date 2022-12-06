package exercises.simple.billiardSaloon.src.main.java.com.billiard.saloon;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private int id;
    private TableType tableType;
    private List<OrderType> orders;
    private boolean isFree = true;
    private int startTime;

    public Table(int id,TableType tableType, int startTime) {
        this.id = id;
        this.tableType = tableType;
        this.orders = new ArrayList<>();
        this.startTime = startTime;
    }

    public TableType getTableType() {
        return tableType;
    }

    public List<OrderType> getOrders() {
        return orders;
    }

    public boolean isFree() {
        return isFree;
    }

    public void clearTable(){
        orders.clear();
    }

    public void removeOrder(OrderType orderType){
        for(OrderType order : orders){
            if(order == orderType){
                orders.remove(order);
                break;
            }
        }
    }

    public int getStartTime() {
        return startTime;
    }

    public int getId() {
        return id;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public void addOrder(OrderType order){
        orders.add(order);
    }


}
