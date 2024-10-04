package Old;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shipment airShipment = new AirShipment("1234");
        Shipment seaShipment = new SeaShipment("6378");
        Shipment roadShipment = new RoadShipment("9798");

        ShipProcessor processor = new ShipProcessor();
        processor.process(airShipment);
        processor.process(seaShipment);
        processor.process(roadShipment);
    }
}

class AirShipment extends Shipment {

    private String flightNumber;

    public AirShipment(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public void ship() {
        System.out.println("Shipping by air " + flightNumber);
    }

}

class SeaShipment extends Shipment {
    private String vesselNumber;

    public SeaShipment(String vesselNumber) {
        this.vesselNumber = vesselNumber;
    }

    @Override
    public void ship() {

        System.out.println("Shipping throught sea " + vesselNumber);
    }

}

class RoadShipment extends Shipment {
    private String truckNumber;

    public RoadShipment(String truckNumber) {
        this.truckNumber = truckNumber;
    }

    @Override
    public void ship() {
        System.out.println("Shipping throught road transport " + truckNumber);
    }

}

class ShipProcessor {
    public void process(Shipment shipment) {
        shipment.ship();
    }
}