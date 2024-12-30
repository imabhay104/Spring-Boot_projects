
package world.ferrina.simple_bean_practice;

public class Hyundai extends Car{
    public Hyundai(String name, long id, double speed) {
        super(name, id, speed);
    }
    @Override
    public String Features() {
        return getName()+" is in Red color";
    }

    @Override
    public String Capacity() {
        return getName()+" has 5 sitter";
    }
}
