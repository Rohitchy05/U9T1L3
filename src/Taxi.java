public class Taxi extends Car{
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
        super(licensePlate, tollFee, passengers, isElectric);
        this.fareCollected = fareCollected;
    }

    public void printTaxi() {
        System.out.println("License plate: " + getLicensePlate() + "\nToll fee: " + getTollFee() + "\nPassengers: " + getPassengers() + "\nDiscount applied?" + isDiscountApplied() + "\nElectric?" + isElectric() + "\nTotal fare collected: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        int currentPassenger = getPassengers();
        setPassengers(currentPassenger + numRiders);
        double fareCost = numRiders * farePerRider;
        fareCollected += fareCost;
        if (getPassengers() >= 4 && !isDiscountApplied()) {
            setTollFee(getTollFee() * 0.5);
            setDiscountApplied(true);
        }
    }

    public double getFareCollected() {
        return fareCollected;
    }
}
