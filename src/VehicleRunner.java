public class VehicleRunner {
    public static void main(String[] args) {
        // -------------- LAB PART 1 -----------------
        // a. write code to create a Vehicle object with license "MC56WQ",
        //    toll fee of 10.75, and 5 passengers.
        //    Print out the calculated toll TollPrice.
        Vehicle vehicle1 = new Vehicle("MC56WQ", 10.75, 5);
        System.out.println(vehicle1.calculateTollPrice());



        // b. write code to create an electric Car with license "KXN73F",
        //    toll fee of 8.50, and 2 passengers.
        //    Print out the calculated toll price
        Car car1 = new Car("KXN73F", 8.50, 2, true);
        System.out.println(car1.calculateTollPrice());


        // c. add a printCar() void method to the Car class that prints the
        //    Car's license plate, toll fee, number of passengers, whether it is electric,
        //    and whether a discount has been applied.
        //    Add getter methods as necessary to the Vehicle superclass.
        //
        // d. call the method on the Car you made in b to test it.
        car1.printCar();



        // e. write code to create a Truck with license "3K9JMX",
        //    a toll fee of 24.75, 4 passengers, 6 axles, with a trailer.
        //    Print out the calculated toll price
        Truck truck1 = new Truck("3k9JMX", 24.75, 4, 6, true);
        System.out.println(truck1.getTollFee());


        // f. add a printTruck() void method to the Truck class that prints the
        //    Truck's license plate, toll fee, number of passengers, number of axles,
        //    and whether it has a trailer.
        //    Add getter methods as necessary to the Vehicle superclass.
        //
        // g. call the method on the Truck you made in e to test it.
        truck1.printTruck();



        // ------------ LAB PART 2 ---------------
        // ----- instructions in lab sheet -------
        Taxi taxi1 = new Taxi("8KM23Z", 9.25, 3, true, 5.00);
        taxi1.printTaxi();
        System.out.println(taxi1.getLicensePlate());
        System.out.println(taxi1.getTollFee());
        System.out.println(taxi1.getPassengers());
        System.out.println(taxi1.calculateTollPrice());
        System.out.println(taxi1.isElectric());
        System.out.println(taxi1.isDiscountApplied());

        System.out.println(taxi1 instanceof Taxi);
        System.out.println(taxi1 instanceof Car);
        System.out.println(taxi1 instanceof Vehicle);
        // ------------ LAB PART 3 ---------------
        // ----- instructions in lab sheet -------
        System.out.println("--- Testing method on a Car object ---");
        Car testCar1 = new Car("KXN73F", 8.50, 5, true);
        System.out.println(testCar1.getPassengers());
        System.out.println("-----------");
        boolean success = testCar1.dropOffPassengers(3);
        System.out.println(success);
        System.out.println(testCar1.getPassengers());
        System.out.println("-----------");
        success = testCar1.dropOffPassengers(3);
        System.out.println(success);
        System.out.println(testCar1.getPassengers());
        System.out.println("--- Testing method on a Taxi object ---");
        Taxi testTaxi1 = new Taxi("JMD645", 10.35, 3, false, 5.0);
        System.out.println(testTaxi1.getPassengers());
        System.out.println("-----------");
        success = testTaxi1.dropOffPassengers(3);
        System.out.println(success);
        System.out.println(testTaxi1.getPassengers());
        System.out.println("-----------");
        success = testTaxi1.dropOffPassengers(2);
        System.out.println(success);
        System.out.println(testTaxi1.getPassengers());
        System.out.println("-----------");

        System.out.println("--------- TEST 1 ---------");
        System.out.println("---- non-electric Taxi ---");
        System.out.println("--------------------------");
        Taxi testTaxi2 = new Taxi("JMD645", 10.0, 1, false, 5.0); // not electric
        testTaxi2.applyDiscount();
        System.out.println("discount already applied? " + testTaxi1.isDiscountApplied());
        System.out.println("toll fee: " + testTaxi2.getTollFee());
        System.out.println("total fare collected: " + testTaxi2.getFareCollected());
        System.out.println("total passengers: " + testTaxi2.getPassengers());
        testTaxi2.pickupRiders(2, 3.75);
        System.out.println("-----------");
        System.out.println("discount already applied? " + testTaxi2.isDiscountApplied());
        System.out.println("toll fee: " + testTaxi2.getTollFee());
        System.out.println("total fare collected: " + testTaxi2.getFareCollected());
        System.out.println("total passengers: " + testTaxi2.getPassengers());
        testTaxi2.pickupRiders(2, 5.90);
        System.out.println("-----------");
        System.out.println("discount already applied? " + testTaxi2.isDiscountApplied());
        System.out.println("toll fee: " + testTaxi2.getTollFee());
        System.out.println("total fare collected: " + testTaxi2.getFareCollected());
        System.out.println("total passengers: " + testTaxi2.getPassengers());
        testTaxi2.pickupRiders(3, 3.40);
        System.out.println("-----------");
        System.out.println("discount already applied? " + testTaxi2.isDiscountApplied());
        System.out.println("toll fee: " + testTaxi2.getTollFee());
        System.out.println("total fare collected: " + testTaxi2.getFareCollected());
        System.out.println("total passengers: " + testTaxi2.getPassengers());

        System.out.println("\n--------- TEST 2 ---------");
        System.out.println("----- electric Taxi ------");
        System.out.println("--------------------------");
        Taxi testTaxi3 = new Taxi("KCD123", 25, 1, true, 6.0); // electric
        testTaxi3.applyDiscount();
        System.out.println("discount already applied? " + testTaxi3.isDiscountApplied());
        System.out.println("toll fee: " + testTaxi3.getTollFee());
        System.out.println("total fare collected: " + testTaxi3.getFareCollected());
        System.out.println("total passengers: " + testTaxi3.getPassengers());
        testTaxi3.pickupRiders(2, 3.7);
        System.out.println("-----------");
        System.out.println("discount already applied? " + testTaxi3.isDiscountApplied());
        System.out.println("toll fee: " + testTaxi3.getTollFee());
        System.out.println("total fare collected: " + testTaxi3.getFareCollected());
        System.out.println("total passengers: " + testTaxi3.getPassengers());
        testTaxi3.pickupRiders(2, 4.75);
        System.out.println("-----------");
        System.out.println("discount already applied? " + testTaxi3.isDiscountApplied());
        System.out.println("toll fee: " + testTaxi3.getTollFee());
        System.out.println("total fare collected: " + testTaxi3.getFareCollected());
        System.out.println("total passengers: " + testTaxi3.getPassengers());


    }
}
