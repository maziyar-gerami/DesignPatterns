class Memento {

   private var content = ""

    constructor(content: String) {
        this.content = content
    }


    public fun getContent() : String {
        return this.content
    }
}