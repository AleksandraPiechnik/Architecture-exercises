package factories;

import products.menus.Menu;
import products.texts.Text;

public abstract  class UIFactory {
    public abstract Menu getMenu();
    public abstract Text getText();
}
