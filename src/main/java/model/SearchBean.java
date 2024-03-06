package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SearchBean implements Serializable{
	
	private String p_name;
	private List<String> p_categorys = new ArrayList<>();
	
	public SearchBean() {
		
	}
	public SearchBean(String p_name) {
		this.p_name = p_name;
	}
	public SearchBean(List<String> p_categorys) {
		this.p_categorys = p_categorys;
	}
	
	
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public List<String> getP_categorys() {
		return p_categorys;
	}
	public void setP_categorys(List<String> p_categorys) {
		this.p_categorys = p_categorys;
	}
	
	
}
