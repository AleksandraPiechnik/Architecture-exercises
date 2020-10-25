package factories;

import products.menus.Menu;
import products.menus.WhiteMenu;
import products.texts.BlackText;
import products.texts.Text;

public class WhiteUIFactory extends UIFactory {
    @Override
    public Menu getMenu() {
        return new WhiteMenu();
    }

    @Override
    public Text getText() {
        return new BlackText();
    }
}
