import factory.Dialog;
import factory.HtmlDialog;
import factory.WindowsDialog;

import javax.swing.*;

public class FactoryConfigure {

    private static Dialog dialog = null;

    static Dialog getInstance(){
        if(System.getProperty("os.name").startsWith("W")){
            System.out.println("ok");
            return new WindowsDialog();
        }else{
            return new HtmlDialog();
        }
    }
}
