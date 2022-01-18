package factory;

import buttons.IButton;

import java.awt.*;

public abstract class Dialog {

    public void actionRender(){
        IButton button = createButton();
        button.render();
    }


    protected abstract IButton createButton();

}
