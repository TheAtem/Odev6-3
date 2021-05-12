package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "employer")
@Data
public class Employer {
	
	@Id
	@GeneratedValue
	@Column(name = "employer_id")
	private int id;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "company_website")
	private String webAdres;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "passwrd")
	private String password;
	
	@Column(name = "passwrd_recap")
	private String passwordRecap;
	
	public Employer() {
		
	}

	public Employer(int id, String companyName, String webAdres, String email, String phoneNumber, String password,
			String passwordRecap) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.webAdres = webAdres;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.passwordRecap = passwordRecap;
	}
	
	
	
}
