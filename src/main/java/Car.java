public class Car {
    protected String engine;
    protected String wheels;
    
    public Car(String engine,String wheels) {
        this.engine=engine;
        this.wheels=wheels;
    }
    
    public String start() {
        return engine+" is on and "+wheels+" are running";
    }
}
