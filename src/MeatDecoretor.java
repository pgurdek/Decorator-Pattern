public class MeatDecoretor extends SandwichDecorator {

    public MeatDecoretor(Sandwich customSanndwich) {
        super(customSanndwich);
    }

    public String make(){
        return  customSanndwich.make() +addMeat();
     }

    private String addMeat() {
        return "+ turkey";
    }
}
