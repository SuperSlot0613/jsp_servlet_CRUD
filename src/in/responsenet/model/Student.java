package in.responsenet.model;

public class Student {

	private String id;
	private String name;
	private String lastname;
	private String clg_name;
	private String email;
	private String mob_no;

	public Student(String id, String name, String lastname, String clg_name, String email, String mob_no) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.clg_name = clg_name;
		this.email = email;
		this.mob_no = mob_no;
	}
	
	public Student(String name, String lastname, String clg_name, String email, String mob_no) {
		this.name = name;
		this.lastname = lastname;
		this.clg_name = clg_name;
		this.email = email;
		this.mob_no = mob_no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getClg_name() {
		return clg_name;
	}

	public void setClg_name(String clg_name) {
		this.clg_name = clg_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMob_no() {
		return mob_no;
	}

	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", lastname=" + lastname + ", clg_name=" + clg_name + ", email="
				+ email + ", mob_no=" + mob_no + "]";
	}

}
