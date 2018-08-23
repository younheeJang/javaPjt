package HW;

public class SaleVO {

	private String code;
	private String sname;
	private String created;
	private int quantity;
	
	public SaleVO(String sname, String created, int quantity) {
		this.sname = sname;
		this.created = created;
		this.quantity = quantity;
		
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
