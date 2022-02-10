package in.responsenet.model;

public class LoginModel {
	private String email;
	private Long phonenumber;
	
	public LoginModel(String email, Long phonenumber) {
		this.email = email;
		this.phonenumber = phonenumber;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	

}
