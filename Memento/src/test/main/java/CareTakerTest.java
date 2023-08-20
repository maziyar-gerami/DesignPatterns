package test.main.java;

import main.java.CareTaker;
import main.java.Memento;
import main.java.Originator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class CareTakerTest {


    @Test
    @DisplayName("History Pop() Test")
    public void testPop(){
        LinkedList<Memento> sample = new LinkedList<Memento>();
        Memento a = new Memento("a");
        sample.add(a);
        Memento b = new Memento("b");
        sample.add(b);
        var careTake = new CareTaker(sample);
        var result = careTake.pop();

        Assertions.assertNotEquals("a" , result.getContent());
        
    }
}
