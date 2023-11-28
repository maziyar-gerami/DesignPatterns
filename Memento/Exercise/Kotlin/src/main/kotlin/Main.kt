
    fun main(){
        var organizer = Organizer("A")
        var history = TakeCarer()

        history.push(organizer.createState())

        organizer = Organizer("B")
        history.push(organizer.createState())

        organizer = Organizer("C")
        history.push(organizer.createState())

        history.pop();

        organizer.restore(history.pop())
        println(organizer.content)
    }
