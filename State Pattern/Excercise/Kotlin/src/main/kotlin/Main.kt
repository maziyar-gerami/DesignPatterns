fun main(){

    var sa = StateA()
    var c = Context(sa)
    c.getState().handle()
    c.setState(StateB())
    c.getState().handle()
}