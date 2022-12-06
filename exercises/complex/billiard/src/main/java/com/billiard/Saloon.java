package exercises.complex.billiard.src.main.java.com.billiard;

import java.util.ArrayList;
import java.util.List;

public class Saloon {

    private List<Table> tables;

    public Saloon(List<Table> tables) {
        this.tables = tables;
    }

    public int reserveTable(TableType tableType, int time) throws NoFreeTableException {
        for(Table table : tables){
            if (table.isFree() == true){
                if(tableType == TableType.SNOOKER && time > 17 ||
                        tableType == TableType.REX && time > 17 || tableType == TableType.POOL){
                    table.setFree(false);
                    return table.getId();
                } else {
                    throw new IllegalArgumentException("Snooker and Rex can only be accessed after 6 pm");
                }
            }
        }
        throw new NoFreeTableException();
    }

    public List<Table> getFreeTables(){
        System.out.println("Free tables:");
        List<Table> freeTable = new ArrayList<>();
        for(Table table : tables){
            if(table.isFree()){
                freeTable.add(table);
                System.out.println("table: "+table.getId());
            }
        }
        return freeTable;
    }

    public void placeOrder(int reservationNumber, OrderType beer) {
        for(Table table : tables){
            if(reservationNumber == table.getId()){
                table.addOrders(beer);
                break;
            }
        }
    }

    public void checkActiveTables(){
        List<Table> freeTables= new ArrayList<>();
        System.out.println("Active tables and their current order revenue: ");
        for(Table table : tables){
            if (!table.isFree()){
                System.out.println(
                        "table ID: " + table.getId() + ", table type: " + table.getTableType() + ", table revenue: " + table.getOrderCost()
                );
            }
        }
    }



//    public void calculatePrice(Table table){
//        LocalTime timeStart = LocalTime.of(table.getStart().getHour(), table.getStart().getMinute());
//        LocalTime timeFinish = LocalTime.of(table.getFinish().getHour(), table.getFinish().getMinute());
//        long timeInHour = Duration.between(timeStart,timeFinish).getSeconds() / 3600;
//        float timePrice = 0;
//        if(timeStart.getHour() < 17 &&
//                table.getTableType() == TableType.REX ||
//                timeStart.getHour() < 17 &&
//                        table.getTableType() == TableType.SNOOKER){
//            throw new IllegalArgumentException("Snooker and Rex are unavailable before 6 pm");
//        } else {
//            timePrice += timeInHour * table.getTableType().getPrice();
//        }
//        float orderPrice = 0;
//        for(OrderType order : table.getOrders()){
//            orderPrice += order.getPrice();
//        }
//        float fullPrice = timePrice + orderPrice;
//        System.out.println("The customers total is: "+fullPrice);
//    }
//
}
