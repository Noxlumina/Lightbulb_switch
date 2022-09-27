package bulbswitch;

public class OffState extends State{
    public OffState(Switch switche) {
        super(switche);
    }
    /*
     *méthode permettant d'allumer quand le switch est en position off
     */
    @Override
    public String oN() {
        switche.setState(new OnState(switche));
        return "allumé";
    }
    /*
     *méthode permettant d'indiquer le switch est déjà sur la position off
     */
    @Override
    public String oFF() {
        return "locked,déjà éteint";
    }
}
