package cn.amichina.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
class Home {
	
	@Id
	private String id;
	
	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "first_name", referencedColumnName = "firstName"),
			@JoinColumn(name = "init", referencedColumnName = "I"),
			@JoinColumn(name = "last_name", referencedColumnName = "lastName"), })
	private Student owner;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Student getOwner() {
		return owner;
	}

	public void setOwner(Student owner) {
		this.owner = owner;
	}

}