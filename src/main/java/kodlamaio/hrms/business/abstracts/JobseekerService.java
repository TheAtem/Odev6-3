package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Jobseeker;

public interface JobseekerService {
	
	List<Jobseeker> getAll();
}
