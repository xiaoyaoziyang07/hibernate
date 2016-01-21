package cn.amichina.domain.collection;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Soldier {
	
	@Id
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}