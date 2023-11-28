import java.util.Stack

class TakeCarer {
    var history = Stack<Memento>()

    fun push(memento: Memento){
        history.push(memento)
    }

    fun pop() : Memento{
        return history.pop()
    }

}