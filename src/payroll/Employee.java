package payroll;

public class Employee {
	private int empId;
	private String name;
	private String address;
	private PaymentClassification paymentClassification;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee(int empId, String name, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public PaymentClassification getPaymentClassification() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setPaymentClassification(PaymentClassification paymentClassification) {
		this.paymentClassification = paymentClassification;
	}
	public PaymentMethod getPaymentMethod() {
		// TODO Auto-generated method stub
		return null;
	}

}
