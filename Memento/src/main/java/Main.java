package main.java;

public class Main {
    public static void main(String[] args) {
        var editor = new Originator();
        var history = new CareTaker();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}

