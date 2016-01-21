package cn.amichina.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Report {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false, length = 20)
	private String vlanId;
	@Column(nullable = false, length = 20)
	private String appId;
	@Temporal(TemporalType.TIME)
	private Date time;
	private int num;
	@Column(precision = 10, scale = 2)
	private double upload;
	@Column(precision = 10, scale = 2)
	private double download;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVlanId() {
		return vlanId;
	}

	public void setVlanId(String vlanId) {
		this.vlanId = vlanId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getUpload() {
		return upload;
	}

	public void setUpload(double upload) {
		this.upload = upload;
	}

	public double getDownload() {
		return download;
	}

	public void setDownload(double download) {
		this.download = download;
	}

	@Override
	public String toString() {
		return "Report [id=" + id + ", vlanId=" + vlanId + ", appId=" + appId
				+ ", time=" + time + ", num=" + num + ", upload=" + upload
				+ ", download=" + download + "]";
	}
}
