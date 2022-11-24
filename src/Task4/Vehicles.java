package Task4;

public enum Vehicles {

    MERCEDES(35000) {
        @Override
        public String getColor() {
            return "Red";
        }
    } , BMW(31000) {
        @Override
        public String getColor() {
            return "Black";
        }
    }, TOYOTA(25000) {
        @Override
        public String getColor() {
            return "White";
        }
    };
    int cost;
    String color;

    Vehicles(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Vehicle: " + super.toString() + ", Color: " + getColor() + ", Cost: " + cost;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        System.out.println(Vehicles.MERCEDES);
        System.out.println(Vehicles.BMW);
        System.out.println(Vehicles.TOYOTA);
    }
}
