package CarFælles;

public class Driver {
  private String name;

  Driver(String name){
    setName(name);
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
