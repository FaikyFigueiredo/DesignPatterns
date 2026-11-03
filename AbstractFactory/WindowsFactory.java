package AbstractFactory;
public class WindowsFactory implements GUIFactory {
    @Override
    public Button buildButton() {
        return new WindowsButton();
    }
    @Override
    public CheckBox buildCheckBox() {
        return new WindowsCheckBox();
    }
}
