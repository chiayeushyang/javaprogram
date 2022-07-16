
class CustomerOnlineOrder extends ShippedOnlineOrder {

    public CustomerOnlineOrder() {
    }

    public CustomerOnlineOrder(String custName, int custNumber, int quantity, double unitPrice) {
        super(custName, custNumber, quantity, unitPrice);
    }

    public CustomerOnlineOrder(String custName, int custNumber, int quantity, double unitPrice, double shippingCharge) {
        super(custName, custNumber, quantity, unitPrice, shippingCharge);
    }

    public static void main(String[] args) {
        ShippedOnlineOrder order1 = new ShippedOnlineOrder("Jin Lee", 20001, 15, 20.0, 75.0);
        System.out.println("\n" + "Customer name: " + order1.getCustName() + "\n" + "Customer number: " + order1.getCustNumber() + "\n" + "Quantity Ordered: " + order1.getQuantity() + "\n" + "Unit price: RM" + order1.getUnitPrice() + "\n" + "Shipping Charge: RM" + order1.getShippingCharge() + "\n" +  "Total Price: RM" + order1.computePrice() + "\n");
    }
}
