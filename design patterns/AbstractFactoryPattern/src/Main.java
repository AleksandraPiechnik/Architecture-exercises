import factories.BlackUIFactory;
import factories.UIFactory;
import factories.WhiteUIFactory;
import products.menus.Menu;
import products.texts.Text;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UIFactory uiFactory;
        Menu menu;
        Text text;
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Choose UI theme. Type B for black o W for white");
        String input=scanner.next();
        if(input.equals("B")){
            uiFactory=new BlackUIFactory();
            menu = uiFactory.getMenu();
            text = uiFactory.getText();
            System.out.println("Menu: "+menu+" text: "+text);
        }
        else if(input.equals("W")){
            uiFactory=new WhiteUIFactory();
            menu = uiFactory.getMenu();
            text = uiFactory.getText();
            System.out.println("Menu: "+menu+" text: "+text);
        }
        else System.out.println("There is no option "+input);

    }
}
