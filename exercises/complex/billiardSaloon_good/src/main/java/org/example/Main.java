package exercises.complex.billiardSaloon_good.src.main.java.org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalAccessException{
        Table table1 = new Table(1,TableType.POOL);
        Table table2 = new Table(2,TableType.REX);
        Table table3 = new Table(3,TableType.REX);
        Table table4 = new Table(4,TableType.SNOOKER);
        Table table5 = new Table(5,TableType.SNOOKER);
        Table table6 = new Table(6,TableType.POOL);
        Table table7 = new Table(7,TableType.REX);
        Table table8 = new Table(8,TableType.SNOOKER);
        Table table9 = new Table(9,TableType.POOL);
        Table table10 = new Table(10,TableType.POOL);


        Saloon saloon = new Saloon(Arrays.asList(table1,table2,table3,table4,table5,table6,table7,table8,table9,table10));
        int resRex1 = saloon.reserveTable(TableType.REX,19);

        saloon.addOrders(resRex1,Arrays.asList(OrderType.BEER,OrderType.BEER,OrderType.BEER,OrderType.BURGER,OrderType.BURGER,OrderType.FRIES,OrderType.FRIES));
//        saloon.checkOrders(resRex1);
//        saloon.payOrder(resRex1,OrderType.BEER);
//        saloon.checkOrders(resRex1);
//        saloon.checkOutTable(resRex1,21);
//        saloon.checkFreeTables(TableType.POOL);
        saloon.highestTableRev(20);

    }
}