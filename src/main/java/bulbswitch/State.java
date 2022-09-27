package bulbswitch;

public abstract class State {
    Switch switche;


    public State(Switch switche) {
        this.switche = switche;
    }

    public abstract String oN();
    public abstract String oFF();
}
