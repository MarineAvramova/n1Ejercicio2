public class Main {
    public static void main(String[] args) {
        // Creating an instance of the class to invoke the non-static method
Car car1 = new Car();
car1.accelerate();
car1.slow();

        System.out.println(car1.BRAND);
        System.out.println(car1.model);
        System.out.println(car1.power);

        // Invoking a static method directly
        Car.slow();
    }
}