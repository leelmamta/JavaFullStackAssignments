public class EmployeeMain {


    public static void main(String[] args){
//      Employee emp = new Employee();

//      // Created Object  , = COntructor
//      // Reference (Emp) variable - this will point to employee
//      emp.name = "mamta";
//      emp.address = "4-s , a block Jaipur , rajasthan ";
//      emp.age = 22;
//      // Setting data members
//      emp.showEmployeeInfo(emp);
//      System.out.println("Employee is Exempt is : - "+emp.isEmployeeExempt(emp));

      // Using refactored code
      Employee reFacEmp = new Employee("Adarsh", "R.D. Memorial , lucknow", 22, true);
      reFacEmp.showEmployeeInfo(reFacEmp);
      System.out.println("Employee is Exempt is : - "+reFacEmp.isEmployeeExempt(reFacEmp));

      Employee emp1 = new Employee("Kamlesh", "Udaipur , rajasthan ", 56, false);
      emp1.showEmployeeInfo(emp1);
      System.out.println("Employee is Exempt is : - "+emp1.isEmployeeExempt(emp1));

//      Lets access getter and setter for  managers Name
      Employee emp2 = new Employee("pratyush", "livin in ", 56, true);
      // we can access getter and setter method but not private managers name

  }

}
