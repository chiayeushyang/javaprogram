class ShippedOnlineOrder extends OnlineOrder{
    
    private double shippingCharge = 75;

    public ShippedOnlineOrder() {

    }

    public ShippedOnlineOrder(String custName, int custNumber, int quantity, double unitPrice) {
        super(custName, custNumber, quantity, unitPrice);
    }

    public ShippedOnlineOrder(String custName, int custNumber, int quantity, double unitPrice, double shippingCharge) {
        super(custName, custNumber, quantity, unitPrice);
        this.shippingCharge = shippingCharge;
    }

    public double getShippingCharge() {
        return this.shippingCharge;
    }

    public void setShippingCharge(double shippingCharge) {
        this.shippingCharge = shippingCharge;
    }

    public double computePrice() {
        return ((getQuantity() * getUnitPrice()) + shippingCharge);
    }
}
