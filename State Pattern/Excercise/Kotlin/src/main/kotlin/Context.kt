class Context {

    private lateinit var state : Statable;

    constructor(state : Statable){
        this.state = state;
    }

    public fun getState() : Statable{
        return this.state;
    }

    public fun setState(state : Statable){
        this.state = state
    }
}