package cn.amichina.domain;

import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class Class {

	private int id;
	private Date birthday;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
