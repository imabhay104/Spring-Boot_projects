
package world.ferrina.simple_bean_practice;

public class Car implements Vehicle{
    private long id;
    private String name;
    private double speed;

    public Car(String name, long id, double speed) {
        this.name=name;
        this.id = id;
        this.speed = speed;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String move() {
        return getName()+"is moving with speed of "+getSpeed();
    }

    @Override
    public String Features() {
        return "";
    }
    public String Capacity()
    {
        return "";

    }
}
