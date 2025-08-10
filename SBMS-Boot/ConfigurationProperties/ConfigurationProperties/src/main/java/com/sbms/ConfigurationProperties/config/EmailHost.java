package com.sbms.ConfigurationProperties.config;

public class EmailHost {
	private int hostid;
	private String hostname;
	public int getHostid() {
		return hostid;
	}
	public void setHostid(int hostid) {
		this.hostid = hostid;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	@Override
	public String toString() {
		return "EmailHost [hostid=" + hostid + ", hostname=" + hostname + "]";
	}
	
	
}
