package com.loginradius.sdk.models.userprofile;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class UnverifiedEmail {
	@SerializedName("Type")
	@Expose
	private String type;
	@SerializedName("Value")
	@Expose
	private String value;

	public String getType() {
	return type;
	}

	public void setType(String type) {
	this.type = type;
	}

	public String getValue() {
	return value;
	}

	public void setValue(String value) {
	this.value = value;
	}
}