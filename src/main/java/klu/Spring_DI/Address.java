package klu.Spring_DI;

public class Address {
  String Street,city;
  //@Autowired
  public Address()
  {
	  
  }

  public String getStreet() {
	return Street;
  }

  public void setStreet(String street) {
	Street = street;
  }

  public String getCity() {
	return city;
  }

  public Address(String street, String city) {
	super();
	Street = street;
	this.city = city;
}

  public void setCity(String city) {
	this.city = city;
  }

  @Override
  public String toString() {
	return "Address [Street=" + Street + ", city=" + city + "]";
  }
  
}
