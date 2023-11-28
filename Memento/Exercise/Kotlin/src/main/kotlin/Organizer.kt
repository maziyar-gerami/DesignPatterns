class Organizer {
    var content = ""
    var takeCarer = TakeCarer()

    constructor(content : String){
        this.content = content
    }

    fun restore (memento: Memento){
        this.content = memento.getContent()
    }

    fun createState() : Memento{
        return Memento(content)

    }
}