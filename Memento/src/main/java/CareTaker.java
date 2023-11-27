package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CareTaker {
    private Stack<Memento> mementoList = new Stack<>();

    public CareTaker() {
    }

    public CareTaker(Stack<Memento> mementoList) {
        this.mementoList = mementoList;
    }

    public Memento pop (){
        return mementoList.pop();
    }

    public void push(Memento memento){
        mementoList.push(memento);
    }

    public void getHistory() {
    }
}
