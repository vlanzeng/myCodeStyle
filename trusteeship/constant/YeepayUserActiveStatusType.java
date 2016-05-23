package com.weilingtou.soa.internal.common.util.trusteeship.constant;

public enum YeepayUserActiveStatusType {
	ACTIVATED("已激活", "ACTIVATED"), DEACTIVATED("未激活", "DEACTIVATED");
	private String name;
	private String value;

	private YeepayUserActiveStatusType(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return this.name;
	}

	public String getValue() {
		return this.value;
	}
}
