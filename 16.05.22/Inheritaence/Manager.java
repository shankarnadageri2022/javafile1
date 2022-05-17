package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Managaer")
public class Manager extends Emp {

	private String temName;

	public String getTemName() {
		return temName;
	}

	public void setTemName(String temName) {
		this.temName = temName;
	}
	
	
}
