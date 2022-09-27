package bulbswitch;

public class OnState extends State{
    public OnState(Switch switche) {
        super(switche);
    }
    /*
     *méthode permettant d'indiquer le switch est déjà sur la position on
     */
    @Override
    public String oN() {
        return "locked, déjà allumé";
    }
/*
*méthode permettant d'éteindre quand le switch est en position on
 */
    @Override
    public String oFF() {
        switche.setState(new OffState(switche));
        return "éteint";
    }
}
