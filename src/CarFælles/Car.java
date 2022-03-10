package CarFælles;

public class Car {

  private String Brand;
  private String Make;
  private String Honk;
  private boolean isOff;
  private Driver driver;

 Car(String Brand, String Make, String Honk){
   //Konstrukter skal være over settere og gettere
   setBrand(Brand);
   setMake(Make);
   setHonk(Honk);
   isOff = true;
 }

  public boolean isOff() {
    return isOff;
  }

  public void isOff(boolean isOff){
   this.isOff = isOff;
  }

  public String getBrand() {
    return Brand;
  }

  public Driver getDriver(){
   return driver;
  }

  public void setBrand(String Brand){
    //this bliver brugt til at værre sikke på vi bruger det rigtige variable
    //Skal skrives sådan her fremover
    this.Brand = Brand;
  }

  public void setMake(String make) {
    Make = make;
  }

  public void setHonk(String honk) {
    Honk = honk;
  }

  public void setDriver(Driver driver){
   this.driver = driver;
  }

  public void sound(){
    System.out.println(Honk);
  }

  public void drive() {
    if (driver != null) {

      if (isOff == true) {
        System.out.println("Turn on the engine");
      } else
        System.out.println(Brand + " " + Make);
    } else System.out.println("We need a driver!");
  }

  public void park(){
    System.out.println(Brand + Make + " Is parked");
  }

  public void turnEngineOn(){
   isOff(false);


   }
   public void turnEngineOff(){
   isOff(true);
  }


}
