package Entities;

public class Gamer {
	
	private int id;
	private String FirstName;
	private String LastName;
	private String NationalIdentity;
	private int DateOfBirth;
	
	
	public Gamer(int id, String firstName, String lastName, String nationalIdentity, int dateOfBirth) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		NationalIdentity = nationalIdentity;
		DateOfBirth = dateOfBirth;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getNationalIdentity() {
		return NationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		NationalIdentity = nationalIdentity;
	}

	public int getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	

}
