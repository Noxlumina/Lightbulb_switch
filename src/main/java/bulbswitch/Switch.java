package bulbswitch;

public class Switch {
    private State state;
/*
*constructeur qui définit la position initiale à off
 */
    public Switch() {
        this.state = new OffState(this);
        setOn(true);
    }

    public void setOn(boolean on) {
        isOn = on;
    }
/*
*variable permettant d'indiquer de dire si le switch est sur on ou non
 */
    private boolean isOn = false;
/*
*permet de récupérer la valeur du state
 */
    public State getState() {
        return state;
    }
/*
*permet de changer la valeur du state
 */
    public void setState(State state) {
        this.state = state;
    }
}
