package AbstractFactory;
public class MacFactory implements GUIFactory{
    @Override
    public Button buildButton() {
        return new MacButton();
    }
    @Override
    public CheckBox buildCheckBox() {
        return new MacCheckBox();
    }
}
