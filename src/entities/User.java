package entities;

public class User {
	
	private String name;
	private Long cpf;
	private String email;
	private Long phone;
	
	public User() {}

	public User(String name, Long cpf, String email, Long phone) {
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Long getCpf() {
		return cpf;
	}
	
}
