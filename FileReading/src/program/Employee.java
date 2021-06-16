/**
 * 
 */
package program;

/**
 * @author Divya Deverapally
 *
 *
 */
public class Employee {
	
	String Employee_Number;
	String wage_Type;
	String pay_Value;
	/**
	 * @param employee_Number
	 * @param wage_Type
	 * @param pay_Value
	 */
	public Employee(String employee_Number, String wage_Type, String pay_Value) {
		super();
		Employee_Number = employee_Number;
		this.wage_Type = wage_Type;
		this.pay_Value = pay_Value;
	}
	/**
	 * @return the employee_Number
	 */
	public String getEmployee_Number() {
		return Employee_Number;
	}
	/**
	 * @param employee_Number the employee_Number to set
	 */
	public void setEmployee_Number(String employee_Number) {
		Employee_Number = employee_Number;
	}
	/**
	 * @return the wage_Type
	 */
	public String getWage_Type() {
		return wage_Type;
	}
	/**
	 * @param wage_Type the wage_Type to set
	 */
	public void setWage_Type(String wage_Type) {
		this.wage_Type = wage_Type;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [Employee_Number=" + Employee_Number + ", wage_Type=" + wage_Type + ", pay_Value=" + pay_Value
				+ "]";
	}
	/**
	 * @return the pay_Value
	 */
	public String getPay_Value() {
		return pay_Value;
	}
	/**
	 * @param pay_Value the pay_Value to set
	 */
	public void setPay_Value(String pay_Value) {
		this.pay_Value = pay_Value;
	}
	

}
