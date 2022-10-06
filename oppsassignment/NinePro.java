package com.yash.oppsassignment;

public class NinePro {
	
	    int empId;
	    String empName;
	    Double empSalary;
	    String deptname;
	    
	    
	   
	   public NinePro(int empId, String empName,  String deptname) {
	        super();
	        this.empId = empId;
	        this.empName = empName;
	        this.deptname = deptname;
	    }
	    
	    public int getEmpId() {
	        return empId;
	    }

	   public void setEmpId(int empId) {
	        this.empId = empId;
	    }


	   public String getEmpName() {
	        return empName;
	    }


	   public void setEmpName(String empName) {
	        this.empName = empName;
	    }

	   public Double getEmpSalary() {
	        return empSalary;
	    }

	   public void setEmpSalary(Double empSalary) {
            this.empSalary = empSalary;
	    }


	   public String getDeptname() {
	        return deptname;
	    }


	   public void setDeptname(String deptname) {
	        this.deptname = deptname;
	    }


	   @Override
	    public String toString() {
	        return "NinePro [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", deptname="
	                + deptname + "]";
	    }
	    
	    public Object clone()
	       {
	          NinePro emp;
	          emp = new NinePro(this.empId, this.empName, this.deptname);
	          emp.setEmpSalary(this.empSalary); 
	          return emp;
	       }
	    
	   public static void main(String[] args) {
	        NinePro  emp1=new NinePro(11, "Viraj", "IT");
	        emp1.setEmpSalary(40000.0); 
	        NinePro emp2 = (NinePro) emp1.clone(); 
	          emp1.setEmpName("Kalpesh"); 
	          System.out.println(emp1); 
	          System.out.println(emp2); 
	          
	          System.out.println(emp2 instanceof NinePro);
	          System.out.println(emp1.equals(emp2));
	    }
	}


