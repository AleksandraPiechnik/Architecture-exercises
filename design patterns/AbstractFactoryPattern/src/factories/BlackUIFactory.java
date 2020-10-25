package factories;

import products.menus.BlackMenu;
import products.menus.Menu;
import products.texts.Text;
import products.texts.WhiteText;

public class BlackUIFactory extends UIFactory{

    @Override
    public Menu getMenu() {
        return new BlackMenu();
    }

    @Override
    public Text getText() {
        return new WhiteText();
    }
}
