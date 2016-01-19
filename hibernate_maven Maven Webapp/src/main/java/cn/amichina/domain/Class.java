package cn.amichina.domain;

import java.io.Serializable;
import java.util.Date;


public class Class implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8761052219521347899L;
	
	private int id;
	private String name;
	private Date birthday;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
}
