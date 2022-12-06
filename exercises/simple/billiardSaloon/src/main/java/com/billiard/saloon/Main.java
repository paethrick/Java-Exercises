package exercises.simple.billiardSaloon.src.main.java.com.billiard.saloon;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Table table1 = new Table(1,TableType.POOL,20);
        Table table2 = new Table(2,TableType.SNOOKER,19);
        Table table3 = new Table(3,TableType.REX,21);
        Table table4 = new Table(4,TableType.POOL,20);
        Table table5 = new Table(5,TableType.POOL,20);


        Saloon saloon = new Saloon(Arrays.asList(table1,table2,table3,table4,table5));
        int table1Res = saloon.reserveTable(TableType.POOL);
        int table2Res = saloon.reserveTable(TableType.REX);


        saloon.placeOrders(table1Res,Arrays.asList(OrderType.BEER,OrderType.COKE,OrderType.BURGER));
        saloon.checkOrdersOnTable(table1);
        saloon.payOrder(table1Res,OrderType.COKE);
        saloon.checkOrdersOnTable(table1);

    }
}
