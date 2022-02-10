package in.responsenet.model;

public class RegisterModel {
	private String id,firstname,lastname,email,exam;
	private long phone;
	private int staterank,allindiarank,seatnumber;
	
	
	public RegisterModel(String id, String firstname, String lastname, String email, String exam, long phone,
			int staterank, int allindiarank, int seatnumber) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.exam = exam;
		this.phone = phone;
		this.staterank = staterank;
		this.allindiarank = allindiarank;
		this.seatnumber = seatnumber;
	}
	
	public RegisterModel(String firstname, String lastname, String email, String exam, long phone,
			int staterank, int allindiarank, int seatnumber) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.exam = exam;
		this.phone = phone;
		this.staterank = staterank;
		this.allindiarank = allindiarank;
		this.seatnumber = seatnumber;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getExam() {
		return exam;
	}
	public void setExam(String exam) {
		this.exam = exam;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getStaterank() {
		return staterank;
	}
	public void setStaterank(int staterank) {
		this.staterank = staterank;
	}
	public int getAllindiarank() {
		return allindiarank;
	}
	public void setAllindiarank(int allindiarank) {
		this.allindiarank = allindiarank;
	}
	public int getSeatnumber() {
		return seatnumber;
	}
	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}
	

}
