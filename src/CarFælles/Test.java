package CarFælles;

public class Test {
  public static void main(String[] args) {
    Car car1 = new Car("VolsWargen", "bult", "dyt");
    Driver driver1 = new Driver("John");
    car1.setDriver(driver1);
    System.out.println(car1.getDriver().getName());
  }

}
