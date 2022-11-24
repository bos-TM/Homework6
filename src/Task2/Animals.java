package Task2;

public enum Animals {
        WOLF(5) , FOX(15), ELEPHANT(10);
        int age;

        Animals(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Animal: " + super.toString() + ", age = " + getAge();
        }

        public int getAge() {
            return age;
        }

    public static void main(String[] args) {
        System.out.println(Animals.WOLF);
        System.out.println(Animals.FOX);
        System.out.println(Animals.ELEPHANT);
    }
}
