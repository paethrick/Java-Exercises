package exercises.simple.billiardSaloon.src.main.java.com.billiard.saloon;

import java.util.List;

public class Saloon {

    private List<Table> tables;

    public Saloon(List<Table> tables) {
        this.tables = tables;
    }

    public int reserveTable(TableType tableType){
        for(Table table : tables){
            if(table.isFree() && table.getTableType() == tableType){
                if(table.getTableType() == TableType.REX && table.getStartTime() > 17 ||
                        table.getTableType() == TableType.SNOOKER && table.getStartTime() > 17 ||
                table.getTableType() == TableType.POOL){
                    table.setFree(false);
                    return table.getId();
                } else {
                    throw new IllegalArgumentException("Snooker and Rex cannot be accessed before 6 pm");
                }
            }
        }
        throw new IllegalArgumentException("There are no free tables");
    }

    public void placeOrder(int id, OrderType order){
        for(Table table : tables){
            if (id == table.getId()){
                table.addOrder(order);
                break;
            }
        }
    }

    public void placeOrders(int id, List<OrderType> orders){
        for(Table table : tables){
            if(table.getId() == id){
                for(OrderType order : orders){
                    table.addOrder(order);
                }
            }
        }
    }

    public void checkFreeTables(TableType tableType){
        System.out.println("The free " + tableType + " tables are:");
        for(Table table : tables){
            if(table.isFree() && table.getTableType() == tableType){
                System.out.println("table " + table.getId());
            }
        }
    }

    public void checkOutTable(int id, int checkOutTime){
        System.out.println("Your total from this table is:");
        int orderCost = 0;
        for(Table table : tables){
            if(table.getId() == id){
                table.setFree(true);
                int time = checkOutTime - table.getStartTime();
                System.out.println("Table cost: " + table.getTableType().getPrice() * time);
                System.out.println("Orders: " + table);
                for(OrderType order : table.getOrders()){
                    orderCost += order.getPrice();
                }
                System.out.println("Order cost: " + orderCost);
                table.clearTable();
            }
        }
    }

    public void checkOrdersOnTable(Table table){
        System.out.println("The orders to this table are: ");
        for(OrderType order : table.getOrders()){
            System.out.println(order);
        }
    }

    public void payOrder(int id,OrderType orderType){
        for(Table table : tables){
            if(id == table.getId()){
                table.removeOrder(orderType);
            }
        }
    }

    public void highestRevTable(int time){
        int tableId=0;
        float tableRev = 0;
        for(Table table : tables){
            if(!table.isFree()){
                int hours = time - table.getStartTime();
                tableRev = table.getTableType().getPrice() * hours;
            }
        }
    }




}
