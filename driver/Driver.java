package driver;

import controller.ControllerMMenu;
import controller.ControllerPerusahaan;
import model.Aplikasi;

public class Driver {
    public static void main(String[] args) {
        Aplikasi app = new Aplikasi();
        ControllerMMenu cm = new ControllerMMenu(app);
    }
}
