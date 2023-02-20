package usingautowireannot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//program to demonstrate on Spring autowiring by using @Autowired annotation
public class Citizen {
	//DI in terms of objects
	private Passport passport;
	
	//default-constructor
	
	public Citizen() {
		System.out.println("Inside Citizen-Default constructor");
		this.passport=passport;
		}

	//DI using setters
	//@Autowired annotation ->to get an element in xml configuration file
	//@Autowired annotation can be used to autowire bean on the setter method
	/*At a one time, if we create multiple beans for same type(class)
 	then we will get exception, to overcome these , we have to use 
 	@Qualifier in class*/
	@Autowired
	@Qualifier("pass")
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	//DI using constructor
	//@Autowired on constructor
	
	/*@Autowired
	public Citizen(Passport passport) {
		System.out.println("Autowired on constructor");
		this.passport = passport;
	}*/


	public void display()
	{
		passport.documentation();
		System.out.println("Result: "+passport.getCity()+" "
				+passport.getEnddate());
	}
	

}