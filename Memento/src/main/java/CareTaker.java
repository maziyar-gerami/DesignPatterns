package main.java;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> editorStateList = new ArrayList<>();

    public CareTaker() {
    }

    public CareTaker(List<Memento> editorStateList) {
        this.editorStateList = editorStateList;
    }

    public Memento pop (){
        var lastItemIndex = editorStateList.size()-1;
        var  lastState = editorStateList.get(lastItemIndex);
        editorStateList.remove(lastState);
        return lastState;
    }

    public void push(Memento editorState){
        editorStateList.add(editorState);
    }

    public void getHistory() {
    }
}
