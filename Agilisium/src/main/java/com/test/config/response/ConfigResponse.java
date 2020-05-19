package com.test.config.response;

public class ConfigResponse {

	private String domain;
	private long port;
	private String appname;
	private String jdbcurl;
	private String jdbcusername;
	private String password;
	private String showsql;
	private String ddlauto;
	private String dialect;

	public long getPort() {
		return port;
	}

	public void setPort(long port) {
		this.port = port;
	}

	public String getAppname() {
		return appname;
	}

	public void setAppname(String appname) {
		this.appname = appname;
	}

	public String getJdbcurl() {
		return jdbcurl;
	}

	public void setJdbcurl(String jdbcurl) {
		this.jdbcurl = jdbcurl;
	}

	public String getJdbcusername() {
		return jdbcusername;
	}

	public void setJdbcusername(String jdbcusername) {
		this.jdbcusername = jdbcusername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getShowsql() {
		return showsql;
	}

	public void setShowsql(String showsql) {
		this.showsql = showsql;
	}

	public String getDdlauto() {
		return ddlauto;
	}

	public void setDdlauto(String ddlauto) {
		this.ddlauto = ddlauto;
	}

	public String getDialect() {
		return dialect;
	}

	public void setDialect(String dialect) {
		this.dialect = dialect;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

}
