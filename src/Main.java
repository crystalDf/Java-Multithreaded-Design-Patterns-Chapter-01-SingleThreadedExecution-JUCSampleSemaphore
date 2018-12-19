public class Main {

    public static void main(String[] args) {

        BoundedResource boundedResource = new BoundedResource(3);

        for (int i = 0; i < 10; i++) {
            new UserThread(boundedResource).start();
        }
    }
}
