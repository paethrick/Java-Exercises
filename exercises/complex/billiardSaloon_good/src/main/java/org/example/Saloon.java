package exercises.complex.billiardSaloon_good.src.main.java.org.example;

import java.util.ArrayList;
import java.util.List;

public class Saloon {


    private List<Table> tables;


    public Saloon(List<Table> tables) {
    this.tables = new ArrayList<>(tables);
    }

    public void addOrder(int id,OrderType orderType){
        for(Table table : tables){
            if(table.getId() == id){
                table.addOrder(orderType);
            }
        }
    }

    public void addOrders(int id, List<OrderType> orders){
        for(Table table : tables){
            if(table.getId() == id){
                table.addOrders(orders);
            }
        }
    }

    public void payOrder(int id, OrderType orderType){
        for(Table table : tables){
            if(id == table.getId()){
                for(OrderType order : table.getOrders()){
                    if(orderType == order){
                        table.getOrders().remove(order);
                        break;
                    }
                }
            }
        }
    }

    public float checkOrders(int id){
        System.out.println("The orders are:");
        float orderPrice = 0;
        for(Table table : tables){
            if(table.getId() == id){
                for(OrderType order : table.getOrders()){
                    orderPrice += order.getPrice();
                    System.out.println(order + " for: " + order.getPrice());
                }
            }
        }
        System.out.println("The total is:" + orderPrice);
        return orderPrice;
    }


    public void checkOutTable(int id, int endTime){
        float orderPrice = checkOrders(id);
        float tablePrice = 0;
        for(Table table : tables){
            if(table.getId() == id){
                int time = endTime - table.getStart();
                tablePrice += table.getTableType().getPrice() * time;
                table.setFree(true);
                table.clearOrder();
            }
        }
        float fullOrder = orderPrice + tablePrice;
        System.out.println("Your total is:" + fullOrder);
    }

    public void checkFreeTables(TableType tableType){
        System.out.println("The free " + tableType + " tables are:");
        for(Table table : tables){
            if(table.getTableType() == tableType && table.isFree()){
                System.out.println("table " + table.getId());
            }
        }
    }

    public void highestTableRev(int endTime){
        float highest = 0;
        int tableId = 0;
        for(Table table : tables){
            if(!table.isFree()){
                float check = 0;
                int time = endTime - table.getStart();
                check += table.getTableType().getPrice() * time;
                for(OrderType order : table.getOrders()){
                    check += order.getPrice();
                }
                if(highest<check){
                    highest = check;
                    tableId = table.getId();
                }
            }
        }
        System.out.println("Highest revenue is on table " + tableId + ": " + highest);
    }

//    public void printHighestTableRev(int endTime){
//        float rev = highestTableRev(endTime);
//        System.out.println("Highest revenue is on table " + tableId + ": " + rev);
//    }

    public int reserveTable(TableType tableType, int time) throws IllegalAccessException {
        for(Table table : tables){
            if(table.isFree() && table.getTableType() == tableType){
                if(tableType == TableType.REX && time > 17 ||
                        tableType == TableType.SNOOKER && time > 17 ||
                        tableType == TableType.POOL){
                    table.setFree(false);
                    table.setStart(time);
                    return table.getId();
                } else {
                    throw new IllegalAccessException("You cannot play Snooker or Rex before 6 pm");
                }
            }
        }
        throw new IllegalAccessException("There are no free tables");
    }

    //TODO:
    //tables for ID's.


}
