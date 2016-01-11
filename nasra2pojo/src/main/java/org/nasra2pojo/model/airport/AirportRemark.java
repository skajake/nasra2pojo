package org.nasra2pojo.model.airport;

import com.github.ffpojo.metadata.positional.annotation.PositionalField;
import com.github.ffpojo.metadata.positional.annotation.PositionalRecord;

@PositionalRecord
public class AirportRemark extends AirportBase {

	private String name;
	private String remark;
	
	@PositionalField(initialPosition = 17, finalPosition = 29)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@PositionalField(initialPosition = 30, finalPosition = 1529)
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "AirportRemark [name=" + name + ", remark=" + remark + "]";
	}
}
