public class EditorState {
    String content;
    String fontName;
    byte fontSize;

    public EditorState(String content, String fontName, byte fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }
}
