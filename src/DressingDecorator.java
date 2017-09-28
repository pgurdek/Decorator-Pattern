public class DressingDecorator extends SandwichDecorator{
    public DressingDecorator(Sandwich customSanndwich) {
        super(customSanndwich);
    }
    public String make(){
        return  customSanndwich.make() + addDressing();
    }

    private String addDressing() {
        return "+ mustard";
    }
}
