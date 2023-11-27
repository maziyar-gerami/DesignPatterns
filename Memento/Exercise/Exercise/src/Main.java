public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        var editor = new  Editor("a", "Arial", (byte) 10);
        var history = new History();

        history.push(editor.createState());
        editor = new  Editor("ac", "Arial", (byte) 10);
        history.push(editor.createState());

        editor = new  Editor("abc", "Aria", (byte) 2);
        history.push(editor.createState());

        history.pop();

        editor.restore(history.pop());
        System.out.println(editor);

    }
}