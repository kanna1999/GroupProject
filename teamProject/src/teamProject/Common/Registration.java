package teamProject.Common;

public class Registration {

	private String firstName;
	private String lastName;
	private String address;
	private int zipC;
	private String state;
	private String username;
	private String password;
	private String securityQ;
	
	
	
	
	
	public Registration() {
		
	}
	
	public Registration(String firstName, String lastName, String address, int zipC, String state, String username, String password,
			String securityQ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.zipC = zipC;
		this.state = state;
		this.username = username;
		this.password = password;
		this.securityQ = securityQ;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getZipC() {
		return zipC;
	}

	public void setZipC(int zipC) {
		this.zipC = zipC;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurityQ() {
		return securityQ;
	}

	public void setSecurityQ(String securityQ) {
		this.securityQ = securityQ;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
}
