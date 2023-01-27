package dto;

public class newAccountDTO {
	 private int id;
	 private String mail;
	 private String salt;
	 private String password;
	 private String hashedPassword;
	 private String name;
	 private String furigana;
	 
	 
	public newAccountDTO(int id, String mail, String salt, String password, String hashedPassword, String name,
			String furigana) {
		super();
		this.id = id;
		this.mail = mail;
		this.salt = salt;
		this.password = password;
		this.hashedPassword = hashedPassword;
		this.name = name;
		this.furigana = furigana;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFurigana() {
		return furigana;
	}
	public void setFurigana(String furigana) {
		this.furigana = furigana;
	}
	
	 
	 
	 
	 
}
