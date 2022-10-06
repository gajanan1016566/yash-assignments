package com.yash.oppsassignment;
import java.time.LocalDate;


public class TenPro {
	
	    int emp_id;
	    String emp_name;
	    long emp_salary;
	    String emp_address;
	    private LocalDate emp_dob;
	    private LocalDate emp_doj;
	    
	    
	    
	    public TenPro(int emp_id, String emp_name, long emp_salary, String emp_address, LocalDate emp_dob,
	            LocalDate emp_doj)
	    {
	        super();
	        this.emp_id = emp_id;
	        this.emp_name = emp_name;
	        this.emp_salary = emp_salary;
	        this.emp_address = emp_address;
	        this.emp_dob = emp_dob;
	        this.emp_doj = emp_doj;
	    }





	   @Override
	    public String toString()
	    {
	        return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + ", emp_address="
	                + emp_address + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	    }
	    
	    public static void main(String[] args)
	    {
	    	TenPro emp = new TenPro(200,"Viraj Patil", 57000, "clone colony,Pune",LocalDate.of(1992, 06, 24),LocalDate.of(2022, 10, 28));
	        System.out.println(emp);
	    }
	}

	