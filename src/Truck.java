public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public void printTruck() {
        System.out.println("License plate: " + getLicensePlate() + "\nToll fee: " + getTollFee() + "\nPassengers: " + getPassengers() + "\nAxles: " + axles + "\nTrailer?" + hasTrailer);
    }

    public boolean validateLicensePlate() {
        if (hasTrailer) {
            String lastTwoChars = getLicensePlate().substring(getLicensePlate().length() - 2);
            return (lastTwoChars.equals("MX") && axles > 4) || (lastTwoChars.equals("LX") && axles <= 4);
        } else {
            return true;
        }

    }
}
