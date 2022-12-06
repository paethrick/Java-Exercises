package exercises.complex.billiardSaloon_good.src.main.java.org.example;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private int id;
    private TableType tableType;
    private List<OrderType> orders;
    private int start;
    private boolean isFree = true;

    public Table(int id, TableType tableType) {
        this.id = id;
        this.tableType = tableType;
        this.orders = new ArrayList<>();
    }

    public List<OrderType> getOrders() {
        return orders;
    }

    public void clearOrder(){
        orders.clear();
    }

    public void addOrder(OrderType orderType){
        orders.add(orderType);
    }

    public void addOrders(List<OrderType> orderType){
        orders.addAll(orderType);
    }

    public void setFree(boolean free){
        this.isFree = free;
    }

    public int getId() {
        return id;
    }

    public TableType getTableType() {
        return tableType;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public boolean isFree() {
        return isFree;
    }
}
