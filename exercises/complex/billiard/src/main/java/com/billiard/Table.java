package exercises.complex.billiard.src.main.java.com.billiard;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private int id;
    private TableType tableType;
    private List<OrderType> orders;

    private boolean free = true;

    public Table(TableType tableType, int id) {
        this.tableType = tableType;
        this.id = id;
        this.orders = new ArrayList<>();
    }

    public TableType getTableType() {
        return tableType;
    }

    public void addOrders(OrderType order) {
         orders.add(order);
    }

    public void resetTable(){
        orders.clear();
    }

    public int getCost(int hours){
        int tablePrice = tableType.getPrice() * hours;
        int orderPrice = 0;
        for(OrderType order : orders){
            orderPrice += order.getPrice();

        }
        int fullPrice = orderPrice + tablePrice;
        System.out.println("The full price of table " + this.getId() + " is: " + fullPrice);
        return tablePrice + orderPrice;
    }

    public int getOrderCost(){
        int orderPrice = 0;
        for(OrderType order : orders){
            orderPrice += order.getPrice();
        }
        return orderPrice;
    }

    public void closeTable(int hour){
        this.getCost(hour);
        this.setFree(true);
        this.resetTable();
    }

    public int getId() {
        return id;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", tableType=" + tableType +
                ", orders=" + orders +
                ", free=" + free +
                '}';
    }
}
