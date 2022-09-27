package bulbswitch;

public class Switch {
    private State state;

    public Switch() {
        this.state = new OffState(this);
        setOn(true);
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    private boolean isOn = false;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
