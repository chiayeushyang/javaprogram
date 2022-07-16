class RetailShop extends StockItem {
    
    public static void displayDetail (StockItem... item) {
        for (int i = 0; i < item.length; i++ ) {
            System.out.println(item[i].getItemID() + "\t\t" + item[i].getDescription() + "\t\t" + item[i].getUnitsOnHand() + "\t\t\t" + item[i].getPrice());
        }
    }


    public static void main(String[] args) {

        StockItem [] item = new StockItem[3];
        item[0] = new StockItem(1000, "Mouse     ", 12, 59.00);
        item[1] = new StockItem(2000, "LED Monitor", 40, 534.00);
        item[2] = new StockItem(3000, "Power bank", 20, 250.00);
        System.out.println("\nTable 1: Stock Item Detail");
        System.out.println("Item ID" + "\t\t" + "Description" + "\t\t" + "Units on Hand" + "\t\t" + "Price (RM)" );
        System.out.println("-----------------------------------------------------------------------------" );
        displayDetail(item);
    }
}
