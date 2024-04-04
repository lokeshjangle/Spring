package example.spring.core;

public class Address {
	private String city;
	private int pinCode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, int pinCode) {
		super();
		this.city = city;
		this.pinCode = pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + "]";
	}


	public static class Customer {
		private String customerId;
		private String name;
		private Address permanantAddress;

		public Customer() {
			// TODO Auto-generated constructor stub
		}

		public Customer(String customerId, String name, Address permanantAddress) {
			super();
			this.customerId = customerId;
			this.name = name;
			this.permanantAddress = permanantAddress;
		}

		public String getCustomerId() {
			return customerId;
		}

		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Address getPermanantAddress() {
			return permanantAddress;
		}

		public void setPermanantAddress(Address permanantAddress) {
			this.permanantAddress = permanantAddress;
		}

		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", name=" + name + ", permanantAddress=" + permanantAddress + "]";
		}







	}
}
