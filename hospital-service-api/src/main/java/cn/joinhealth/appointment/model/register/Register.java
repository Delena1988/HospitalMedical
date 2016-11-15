package cn.joinhealth.appointment.model.register;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 预约挂号
 */
public class Register implements Serializable{
	private static final long serialVersionUID = 2144926158584388649L;
	private String organCode;//组织机构代码
	private String resultCode;//结果代码
	private String resultName;//结果描述
	private String password;//取号密码

	public String getOrganCode() {
		return organCode;
	}

	public void setOrganCode(String organCode) {
		this.organCode = organCode;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultName() {
		return resultName;
	}

	public void setResultName(String resultName) {
		this.resultName = resultName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Register{" +
				"organCode='" + organCode + '\'' +
				", resultCode='" + resultCode + '\'' +
				", resultName='" + resultName + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}