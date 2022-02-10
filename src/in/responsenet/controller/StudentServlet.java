package in.responsenet.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.responsenet.dao.StudentDao;
import in.responsenet.model.Contact;
import in.responsenet.model.LoginModel;
import in.responsenet.model.RegisterModel;
import in.responsenet.model.Student;

@WebServlet("/")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudentDao studentDao;

	public void init(ServletConfig config) throws ServletException {
		studentDao = new StudentDao();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();
		switch (action) {
		case "/":
			IndexPage(request, response);
			break;
		case "/view":
			try {
				ListAllStudent(request, response);
			} catch (ClassNotFoundException | ServletException | IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "/new-student":
			AddPage(request, response);
			break;
		case "/edit-student":
			EditPage(request, response);
			break;
		case "/success":
			SuccessPage(request, response);
			break;
		case "/registerpage":
			RegisterPage(request, response);
			break;
		case "/loginpage":
			LoginPage(request, response);
			break;
		case "/contact":
			try {
				ContactUser(request, response);
			} catch (ClassNotFoundException | ServletException | IOException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "/insert":
			try {
				InsertStudent(request, response);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "/register":
			try {
				RegisterData(request,response);
			} catch (ClassNotFoundException | ServletException | IOException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "/loginsys":
			try {
				LoginData(request,response);
			} catch (ClassNotFoundException | ServletException | IOException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "/show":
			try {
				ShowStudentForm(request, response);
			} catch (ClassNotFoundException | ServletException | IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			ErrorPage(request, response);
			break;
		}
	}

	public void ShowStudentForm(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		int id = Integer.parseInt(req.getParameter("id"));

		Student singlestudent = studentDao.selectStudent(id);

		req.setAttribute("signlestudent", singlestudent);

		RequestDispatcher reqD = req.getRequestDispatcher("show-Page.jsp");
		reqD.forward(req, res);

	}

	public void ListAllStudent(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException, ClassNotFoundException, SQLException {

		List<Student> studentslist = studentDao.listAllStudent();
//        System.out.println(studentslist);

		req.setAttribute("studentslist", studentslist);
		RequestDispatcher reqD = req.getRequestDispatcher("view-Page.jsp");
		reqD.forward(req, res);

	}
	
	public void LoginData(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		long phone = Long.parseLong(req.getParameter("phonenumber"));
		String email = req.getParameter("email");
		System.out.println(email+" "+phone);
		LoginModel loginmodel=new LoginModel(email,phone);
		
		boolean ans=studentDao.loginDate(loginmodel);
		System.out.println(ans);
		if(ans) {	
			res.sendRedirect("success");
		}else {
			res.sendRedirect("");
		}
	}
	
	public void RegisterData(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		long phone = Long.parseLong(req.getParameter("phone"));
		String email = req.getParameter("email");
		String exam = req.getParameter("exam");
		int staterank = Integer.parseInt(req.getParameter("staterank"));
		int allindiarank = Integer.parseInt(req.getParameter("allindiarank"));
		int seatnumber = Integer.parseInt(req.getParameter("seatnumber"));
		
		RegisterModel register=new RegisterModel(firstname, lastname, email, exam, phone, staterank, allindiarank, seatnumber);
		
		studentDao.registerData(register);

		res.sendRedirect("success");
	}

	public void InsertStudent(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		String name = req.getParameter("name");
		String lastname = req.getParameter("lastname");
		String clg_name = req.getParameter("clg_name");
		String mob_no = req.getParameter("mob_no");
		String email = req.getParameter("email");

		Student newStudent = new Student(name, lastname, clg_name, email, mob_no);

		studentDao.insertStudent(newStudent);

		res.sendRedirect("success");

	}

	private void ContactUser(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String subject = req.getParameter("subject");
		String message = req.getParameter("message");

		Contact newContact = new Contact(name, email, subject, message);

		studentDao.insertContact(newContact);
		res.sendRedirect("success");
	}
	
	private void LoginPage(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher reqD = req.getRequestDispatcher("Login-Page.jsp");
		reqD.forward(req, res);
	}

	private void RegisterPage(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher reqD = req.getRequestDispatcher("register-page.jsp");
		reqD.forward(req, res);
	}

	private void SuccessPage(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher reqD = req.getRequestDispatcher("successPage.jsp");
		reqD.forward(req, res);
	}

	private void IndexPage(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher reqD = req.getRequestDispatcher("index.jsp");
		reqD.forward(req, res);
	}

	private void AddPage(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher reqD = req.getRequestDispatcher("add-Page.jsp");
		reqD.forward(req, res);
	}

	private void EditPage(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher reqD = req.getRequestDispatcher("edit-page.jsp");
		reqD.forward(req, res);
	}

	private void ErrorPage(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher reqD = req.getRequestDispatcher("error-Page.jsp");
		reqD.forward(req, res);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
