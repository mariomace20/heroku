package pe.edu.unmsm.fisi.biblioteca.model;

public class Usuario {
	private String userName;
	private String pass;
	
	public Usuario() {
		super();
	}
	public Usuario(String userName, String pass) {
		super();
		this.userName = userName;
		this.pass = pass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Usuario [userName=" + userName + ", pass=" + pass + "]";
	}
	
}
