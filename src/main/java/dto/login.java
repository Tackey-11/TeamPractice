package dto;

public class login {
	private int id;
	private String name;
	private String mail;
	private String salt;
	private String password;
	private String hashedPassword;
	private String furigana;
	
	public login(int id, String name, String mail, String salt, String password, String hashedPassword, String furigana) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.salt = salt;
		this.password = password;
		this.hashedPassword = hashedPassword;
		this.furigana = furigana;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHashedPassword() {
		return hashedPassword;
	}

	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}
	
	public String  furigana() {
		return  furigana;
	}
	
	public void  furigana(String  furigana) {
		this.furigana = furigana;
	}
}
