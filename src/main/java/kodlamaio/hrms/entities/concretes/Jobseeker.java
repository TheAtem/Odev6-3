package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "jobseeker")
public class Jobseeker {
	
	@Id
	@GeneratedValue
	@Column(name = "jobseeker_id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "identity_number")
	private String identityNumber;
	
	@Column(name = "birth_year")
	private Date BirthDay;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "passwrd")
	private String password;
	
	@Column(name = "passwrd_recap")
	private String paswordRecap;
	
	public Jobseeker() {
		
	}

	public Jobseeker(int id, String firstName, String lastName, String identityNumber, Date birthDay, String email,
			String password, String paswordRecap) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		BirthDay = birthDay;
		this.email = email;
		this.password = password;
		this.paswordRecap = paswordRecap;
	}

	
	
	
}
