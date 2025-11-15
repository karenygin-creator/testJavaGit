public class Car implements Drivable,MusicPlay {
    private String model;

    public Car(String model) {
        this.model = model;
    }
    @Override
    public void drive() {
        System.out.println(model+" едет вперед");
    }
    @Override
    public void stop() {
        System.out.println(model+" останавливается");
    }
    @Override
    public void playMusic() {
        System.out.println(model+" играет музыка Rap");
    }
}
