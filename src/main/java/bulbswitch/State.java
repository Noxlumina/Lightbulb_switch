package bulbswitch;
/*
*classe abstraite patron des classes des états on (allumé) et off (éteint)
* permettant d'implémenter les méthode oN() pour allumé et oFF() pour éteindre
 */
public abstract class State {
    Switch switche;


    public State(Switch switche) {
        this.switche = switche;
    }

    public abstract String oN();
    public abstract String oFF();
}
