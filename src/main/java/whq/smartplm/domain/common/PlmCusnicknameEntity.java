package whq.smartplm.domain.common;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the plm_cusnickname database table.
 * 
 */
@Entity
@Table(name = "plm_cusnickname", schema = "public", catalog = "smartplm")
public class PlmCusnicknameEntity implements Serializable {
	@Id
	@Column(name="nickname")
	private String nickName;

	@Column(name="customergroup")
	private String customerGroup;

	@Column(name="customername")
	private String customerName;

	public PlmCusnicknameEntity() {
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getCustomerGroup() {
		return customerGroup;
	}

	public void setCustomerGroup(String customerGroup) {
		this.customerGroup = customerGroup;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}