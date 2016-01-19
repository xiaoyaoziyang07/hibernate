package cn.amichina.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "CATS")
@Inheritance(strategy = InheritanceType.JOINED)
public class Cat implements Serializable {
	
	@Id
	@GeneratedValue(generator = "cat-uuid")
	@GenericGenerator(name = "cat-uuid", strategy = "uuid")
	private String id;
	
	public String getId() {
		return id;
	}
}

