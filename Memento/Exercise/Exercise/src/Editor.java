public class Editor {
    private  String content;
    private String fontName;
    private  byte fontSize;

    public EditorState createState(){
        return  new EditorState(content, fontName, fontSize);
    }

    public void restore(EditorState editorState){
        this.content = editorState.content;
        this.fontName = editorState.fontName;
        this.fontSize = editorState.fontSize;
    }

    public Editor(String content, String fontName, byte fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
