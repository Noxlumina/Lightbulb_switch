import bulbswitch.Switch;
import bulbswitch.UI;

public class Main {
    public static void main(String[] args) {
        Switch player = new Switch();
        UI ui = new UI(player);
        ui.init();
    }
}
