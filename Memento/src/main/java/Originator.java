package main.java;

public class Originator {
    private String content;

    public Originator(String content) {
        this.content = content;
    }

    public Originator() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void restore(Memento editorState){
        content = editorState.getContent();
    }

    public Memento createState(){
        return new Memento(content);
    }

}
