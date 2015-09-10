
public class CreditCard {
	private String name;
	private Integer creditNumber;
	
	public CreditCard(String name, Integer creditNumber) {
		super();
		this.name = name;
		this.creditNumber = creditNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCreditNumber() {
		return creditNumber;
	}

	public void setCreditNumber(Integer creditNumber) {
		this.creditNumber = creditNumber;
	}

	@Override
	public String toString() {
		return "CreditCard [name=" + name + ", creditNumber=" + creditNumber + "]";
	}
	
	

}
