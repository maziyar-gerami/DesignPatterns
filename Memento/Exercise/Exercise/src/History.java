import java.util.Stack;

public class History {
    Stack<EditorState> states;

    public History() {
        states = new Stack<>();
    }

    public void push (EditorState editorState){
        states.push(editorState);
    }

    public EditorState pop (){
        return  states.pop();
    }
}
