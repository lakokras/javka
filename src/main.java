public class main {

    public static void main(String[] args) {
        // ООП: классы и объекты
        Car bmw = new Car(250.5f, 2500, "White", new byte[] {0, 0, 0});

        Truck truck = new Truck(5600, new byte[] {100, 0, 100}, false);

        truck.setLoaded(true);
        truck.getLoaded();
    }

}