public class BenzModel extends CarModel{
    @Override
    protected void start() {
        System.out.println("Benz Start");
    }

    @Override
    protected void stop() {
        System.out.println("Benz Stop");
    }

    @Override
    protected void alarm() {
        System.out.println("Benz Alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("Benz EngineBoom");
    }
}
