package model;

import java.io.Serializable;

public class SearchBean implements Serializable{
	
	private String p_name;
	private String[] p_categorys;
	
	public SearchBean() {
		
	}
	public SearchBean(String p_name) {
		this.p_name = p_name;
	}
	public SearchBean(String[] p_categorys) {
		this.p_categorys = p_categorys;
	}
	
	
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String[] getP_categorys() {
		return p_categorys;
	}
	public void setP_categorys(String[] p_categorys) {
		this.p_categorys = p_categorys;
	}
	
	
}
