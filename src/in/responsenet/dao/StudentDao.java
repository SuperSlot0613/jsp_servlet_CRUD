package in.responsenet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import in.responsenet.model.Contact;
import in.responsenet.model.LoginModel;
import in.responsenet.model.RegisterModel;
import in.responsenet.model.Student;

public class StudentDao {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost/vegitable?serverTimezone=UTC";
	static final String USERNAME = "root";
	static final String PASS = "";

	// queries -> insert,select all student,select one student,update delete
	private static final String INSERT_STUD_SQL = "INSERT INTO `tbl_students`(`name`, `lastname`, `clg_name`, `mob_number`, `email`) VALUES (?,?,?,?,?)";
	private static final String INSERT_USE_SQL = "INSERT INTO `contactuser`(`name`, `email`, `subject`, `message`) VALUES (?,?,?,?)";

	private static final String SLECTE_ALL_STU = "SELECT * FROM `tbl_students`";

	private static final String SLECTE_ONE_STU = "SELECT * FROM `tbl_students` where id= ? ";

	private static final String INSERT_REG_SQL = "INSERT INTO `tbl_register`(`firstname`, `lastname`, `phone`, `email`, `exam`, `staterank`, `allindiarank`, `seatnumber`) VALUES (?,?,?,?,?,?,?,?)";
	
	private static final String SELECT_REG_SQL="SELECT `phone`, `email` FROM `tbl_register`";

	protected Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName(JDBC_DRIVER);
		con = DriverManager.getConnection(URL, USERNAME, PASS);
		Statement st = con.createStatement();
		return con;
	}

	public void insertStudent(Student newStudent) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement(INSERT_STUD_SQL);
		st.setString(1, newStudent.getName());
		st.setString(2, newStudent.getLastname());
		st.setString(3, newStudent.getClg_name());
		st.setString(4, newStudent.getMob_no());
		st.setString(5, newStudent.getEmail());

		st.executeUpdate();
	}

	public void insertContact(Contact newContact) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement(INSERT_USE_SQL);
		st.setString(1, newContact.getName());
		st.setString(2, newContact.getEmail());
		st.setString(3, newContact.getSubject());
		st.setString(4, newContact.getMessage());

		st.executeUpdate();
	}

	public List<Student> listAllStudent() throws ClassNotFoundException, SQLException {
		List<Student> students = new ArrayList<>();
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement(SLECTE_ALL_STU);
		ResultSet result = st.executeQuery();

		while (result.next()) {
			String id = result.getString("id");
			String name = result.getString("name");
			String lastname = result.getString("lastname");
			String clg_name = result.getString("clg_name");
			String mob_no = result.getString("mob_number");
			String email = result.getString("email");

			students.add(new Student(id, name, lastname, clg_name, email, mob_no));
		}
		return students;
	}

	public Student selectStudent(int id) throws ClassNotFoundException, SQLException {

		Student student = null;

		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement(SLECTE_ONE_STU);
		st.setInt(1, id);

		ResultSet result = st.executeQuery();

		while (result.next()) {
			String sid = result.getString("id");
			String name = result.getString("name");
			String lastname = result.getString("lastname");
			String clg_name = result.getString("clg_name");
			String mob_no = result.getString("mob_number");
			String email = result.getString("email");
			student = new Student(sid, name, lastname, clg_name, email, mob_no);
		}
		return student;

	}

	public void registerData(RegisterModel newRegister) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement(INSERT_REG_SQL);
		
		st.setString(1, newRegister.getFirstname());
		st.setString(2, newRegister.getLastname());
		st.setLong(3,newRegister.getPhone());
		st.setString(4, newRegister.getEmail());
		st.setString(5, newRegister.getExam());
		st.setInt(6, newRegister.getStaterank());
		st.setInt(7, newRegister.getAllindiarank());
		st.setInt(8, newRegister.getSeatnumber());

		st.executeUpdate();
	}
	
	public boolean loginDate(LoginModel loginmodel) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement(SELECT_REG_SQL);
		
		String email=loginmodel.getEmail();
		long phone=loginmodel.getPhonenumber();
		
		boolean ans=false;
		
		ResultSet result=st.executeQuery();
		
		while(result.next()) {
			String emaildata=result.getString("email");
			long phonedata=result.getLong("phone");
			
			System.out.println(emaildata+" "+phonedata);
			
			if((email==emaildata)&&(phonedata==phone)) {
				ans=true;
			}
		}
		return ans;
	}
	
	

}
