public class Main {
    public static void main(String[] args) {

        Context context = new Context();
        context.setState(new StateA());
        context.getState().handle();
        context.setState(new StateB());
        context.getState().handle();

    }
}