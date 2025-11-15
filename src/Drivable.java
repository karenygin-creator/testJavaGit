public interface Drivable {
    void drive();
    void stop();
    default void startEngine() {
        System.out.println("Двигатель запущен");
    }
}
