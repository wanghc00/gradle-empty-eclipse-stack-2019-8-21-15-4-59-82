import javax.print.attribute.standard.MediaSize.Engineering;

public class SportsCar extends Car {
    private String light;
    public SportsCar(String engine, String wheels, String light) {
        super(engine, wheels);
        this.light=light;
    }
    
    public String start() {
        return this.light+" are shining, "+super.engine+" is on and "+super.wheels+" are running!";
    }
    
    public String speedOn() {
        return super.engine+" is overload and "+super.wheels+" are super running";
    }
}
