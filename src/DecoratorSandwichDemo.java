public class DecoratorSandwichDemo {
    public static void main  (String args[]){
        Sandwich sandwich = new DressingDecorator(new MeatDecoretor(new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}
