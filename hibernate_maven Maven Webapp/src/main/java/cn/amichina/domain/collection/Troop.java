package cn.amichina.domain.collection;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Troop {
	
	@Id
	private Long id;
	
	@OneToMany
	@JoinColumn(name="soldier_id")
	private Set<Soldier> soldiers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Soldier> getSoldiers() {
		return soldiers;
	}

	public void setSoldiers(Set<Soldier> soldiers) {
		this.soldiers = soldiers;
	}
}
