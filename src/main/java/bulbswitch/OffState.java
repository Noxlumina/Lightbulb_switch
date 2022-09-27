package bulbswitch;

public class OffState extends State{
    public OffState(Switch switche) {
        super(switche);
    }

    @Override
    public String oN() {
        switche.setState(new OnState(switche));
        return "allumé";
    }

    @Override
    public String oFF() {
        return "locked,déjà éteint";
    }
}
