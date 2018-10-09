import java.util.Random;

public class UserThread extends Thread {

    private final static Random random = new Random(26535);
    private final BoundedResource boundedResource;

    public UserThread(BoundedResource boundedResource) {

        this.boundedResource = boundedResource;
    }

    @Override
    public void run() {
        try {

            while (true) {

                boundedResource.use();

                Thread.sleep(random.nextInt(3000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
