package exam.test14;

import java.util.Date;
import java.util.Map;
import java.util.Properties;

/**
 * Created by nhnent on 2017. 5. 27..
 */
public class Tire {
	private String maker;
	private Properties spec;
	private Date createdDate;

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public Properties getSpec() {
		return spec;
	}

	public void setSpec(Properties spec) {
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
		StringBuffer specInfo = new StringBuffer();

		if (spec != null) {
			for (Map.Entry<Object, Object> entry : spec.entrySet()) {
				specInfo.append(entry.getKey() + ":" + entry.getValue() + ", ");
			}
		}

		return "[Tire: " + maker + ", " + specInfo.toString() + ((createdDate != null) ? (", " + createdDate.toString()) : "") + "]";
	}
}
