class Machine {
    public void start() {
        System.out.println("snapping a picture");
    }
}

public class SandboxMain {
    public static void main(String[] args) {

        Machine machine1 = new Machine() {
            @Override
            public void start() {
                System.out.println("running as anonymously");
            }
        };

        machine1.start();
    }
}
