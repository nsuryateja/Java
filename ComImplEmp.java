package interfaces;

import java.util.Comparator;

import com.Emp;

public class ComImplEmp implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		if(o1.getEmpSalary() > o2.getEmpSalary()){
			return 1;
		}
		return -1;
	}

}
