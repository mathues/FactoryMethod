import factory.Dialog;

public class Application {
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        Dialog dialog = FactoryConfigure.getInstance();
        dialog.actionRender();
    }
}
