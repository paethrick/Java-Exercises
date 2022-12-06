package exercises.complex.billiard.src.main.java.com.billiard;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoFreeTableException {
        Table table1 = new Table(TableType.SNOOKER,1);
        Table table2 = new Table(TableType.POOL,2);
        Table table3 = new Table(TableType.REX,3);
        Table table4 = new Table(TableType.SNOOKER,4);
        Table table5 = new Table(TableType.SNOOKER,5);
        List<Table> tables = Arrays.asList(table1,table2,table3,table4, table5);
        Saloon saloon = new Saloon(tables);


        int reservTable_01 = saloon.reserveTable(TableType.SNOOKER,19);
        int reservTable_02 = saloon.reserveTable(TableType.POOL,19);
        int reservTable_03 = saloon.reserveTable(TableType.POOL,19);
        int reservTable_04 = saloon.reserveTable(TableType.POOL,19);

        saloon.placeOrder(reservTable_01,OrderType.BEER);
        saloon.placeOrder(reservTable_01,OrderType.BEER);
        saloon.placeOrder(reservTable_01,OrderType.COKE);
        saloon.placeOrder(reservTable_01,OrderType.FRIES);
        saloon.placeOrder(reservTable_01,OrderType.PIE);

        saloon.placeOrder(reservTable_02,OrderType.PIE);
        saloon.placeOrder(reservTable_02,OrderType.BURGER);
        saloon.placeOrder(reservTable_02,OrderType.PIE);

        saloon.placeOrder(reservTable_03,OrderType.PIE);
        saloon.placeOrder(reservTable_03,OrderType.BURGER);
        saloon.placeOrder(reservTable_03,OrderType.PIE);
        saloon.placeOrder(reservTable_03,OrderType.FRIES);
        saloon.placeOrder(reservTable_03,OrderType.PIE);

        saloon.placeOrder(reservTable_04,OrderType.PIE);
        saloon.placeOrder(reservTable_04,OrderType.BURGER);
        saloon.placeOrder(reservTable_04,OrderType.COKE);
        saloon.placeOrder(reservTable_04,OrderType.BURGER);
        saloon.placeOrder(reservTable_04,OrderType.PIE);

        saloon.checkActiveTables();

        saloon.getFreeTables();
        table1.closeTable(3);
        saloon.getFreeTables();
    }
}
