package usingautowireannot;
//program to demonstrate on Spring auto-wiring by using @Autowired annotation
public class Passport {
	
	//private data members
	private String city;
	private String enddate;
	
	
	//getters and setters
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	
	//default constructor
	public Passport() {
		System.out.println("Inside default-Passport constructor");
	}

	public void documentation()
	{
		System.out.println("Address and Identity proof");
	}
	

}