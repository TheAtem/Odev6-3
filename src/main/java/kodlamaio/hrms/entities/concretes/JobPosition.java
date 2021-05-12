package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name = "job_position")
public class JobPosition {
	
	@Id
	@GeneratedValue
	@Column(name = "position_id")
	private int positionId;
	
	@Column(name = "employer_id")
	private int employerId;
	
	@Column(name = "job_name")
	private String jobName;
	
	public JobPosition() {
		
	}

	public JobPosition(int positionId, int employerId, String jobName) {
		super();
		this.positionId = positionId;
		this.employerId = employerId;
		this.jobName = jobName;
	}
	
	
	
	
	
}
