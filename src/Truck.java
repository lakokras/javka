import javax.swing.plaf.TreeUI;

public class Truck extends Transport{

    private boolean isLoaded;
    public Engine engine = new Engine();

    public Truck(int weight, byte[] coordinate) {
        super(weight, coordinate);
    }

    public Truck(int weight, byte[] coordinate, boolean isLoaded) {
        super(weight, coordinate);
        this.isLoaded = isLoaded;
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Наш объект двигается со скоростью: " + speed);
    }

    @Override
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }

    public void setValue(float speed, int weight, String color, byte[] coordinate, boolean isLoaded) {
        super.setValue(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
    }

    @Override
    protected String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public void setLoaded(boolean loaded) { isLoaded = loaded; }

    public String getLoaded() {
        if(isLoaded)
            return "Грузовик загружен";
        else
            return "Грузовик не загружен";
    }

}