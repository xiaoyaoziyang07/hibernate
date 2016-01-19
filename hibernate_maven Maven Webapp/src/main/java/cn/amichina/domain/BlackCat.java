package cn.amichina.domain;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "DOMESTIC_CATS")
@PrimaryKeyJoinColumn(name = "CAT")
public class BlackCat extends Cat {

	private String name;

	public String getName() {
		return name;
	}
}
