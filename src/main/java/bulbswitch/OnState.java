package bulbswitch;

public class OnState extends State{
    public OnState(Switch switche) {
        super(switche);
    }

    @Override
    public String oN() {
        return "locked, déjà allumé";
    }

    @Override
    public String oFF() {
        switche.setState(new OffState(switche));
        return "éteint";
    }
}
