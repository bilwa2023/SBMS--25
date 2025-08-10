package com.biswal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("dbcon")
public class DBConnection {
	@Value("${my.db.driver}")
	private String driver;
	@Value("${my.db.url}")
	private String url;
	@Value("${my.db.username}")
	private String username;
	@Value("${my.db.password}")
	private String password;
	
	
	@Override
	public String toString() {
		return "DBConnection [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password
				+ "]";
	}
	
	
}
