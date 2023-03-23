public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public boolean isElectric() {
        return electric;
    }

    public boolean isDiscountApplied() {
        return discountApplied;
    }

    public void printCar() {
        System.out.println("License plate: " + getLicensePlate() + "\nToll fee: " + getTollFee() + "\nPassengers: " + getPassengers() + "\nDiscount applied?" + discountApplied);
    }

    public boolean dropOffPassengers(int a) {
        int currentPassengers = getPassengers();
        if (a < currentPassengers) {
            setPassengers(currentPassengers - a);
            return true;
        } else {
            return false;
        }
    }

    public void applyDiscount() {
        if (!discountApplied) {
            if (isElectric()) {
                double discount = getTollFee() * 0.5;
                setTollFee(discount);
                discountApplied = true;
            }
        }
    }

    public void setDiscountApplied(boolean check) {
        discountApplied = check;
    }
}
