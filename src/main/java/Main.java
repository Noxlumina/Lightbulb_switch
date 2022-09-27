import bulbswitch.Switch;
import bulbswitch.UI;

public class Main {
    /*
    *fonction main permettant de lancer la simulation du switch
     */
    public static void main(String[] args) {
        Switch player = new Switch();
        UI ui = new UI(player);
        ui.init();
    }
}
