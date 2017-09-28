abstract public class SandwichDecorator implements Sandwich{

    protected  Sandwich customSanndwich;

    public SandwichDecorator(Sandwich customSanndwich) {
        this.customSanndwich = customSanndwich;
    }

    public String make(){
        return customSanndwich.make();
    }
}
