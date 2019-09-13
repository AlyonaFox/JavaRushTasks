public class Test {
    public static void main(String[] args) {
        Wrapper wrapper = new Wrapper();

        int number = wrapper.readInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Hello, World!");
        }

    }
}
