package com;

public class Emp {

	private String EmpName;
	private Integer EmpSalary;
	private Integer EmpId;

	public Emp(String empName, Integer empSalary, Integer empId) {
		super();
		EmpName = empName;
		EmpSalary = empSalary;
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public int getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(Integer empSalary) {
		EmpSalary = empSalary;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(Integer empId) {
		EmpId = empId;
	}

	@Override
	public String toString() {
		return "Emp [EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + ", EmpId=" + EmpId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((EmpId == null) ? 0 : EmpId.hashCode());
		result = prime * result + ((EmpName == null) ? 0 : EmpName.hashCode());
		result = prime * result + ((EmpSalary == null) ? 0 : EmpSalary.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (EmpId == null) {
			if (other.EmpId != null)
				return false;
		} else if (!EmpId.equals(other.EmpId))
			return false;
		if (EmpName == null) {
			if (other.EmpName != null)
				return false;
		} else if (!EmpName.equals(other.EmpName))
			return false;
		if (EmpSalary == null) {
			if (other.EmpSalary != null)
				return false;
		} else if (!EmpSalary.equals(other.EmpSalary))
			return false;
		return true;
	}
	
	

}
