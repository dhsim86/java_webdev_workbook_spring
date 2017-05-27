package exam.test09;

import java.util.Date;

/**
 * Created by nhnent on 2017. 5. 27..
 */
public class Tire {
	private String maker;
	private String spec;
	private Date createdDate;

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "[Tire: " + maker + ", " + spec + ((createdDate != null) ? (", " + createdDate.toString()) : "") + "]";
	}
}
