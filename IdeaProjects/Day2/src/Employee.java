public class Employee {
//    data members

    String name ;
    String address;
    int age;

    // Adding an exempt variable
    boolean isExempt ;
    boolean isFullTime ;

//    To refactor the code I Am creating an Constructor
    // To initialize data members using constructor

// Constructor name is same as the class name
    public Employee(String name, String address, int age, boolean isFullTime) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.isFullTime = isFullTime;
    }
    // Now I can Directly use this constructor to intialize in Employeemain class

    // Problem is TO check if  the current employee is Full time or part time

    void showEmployeeInfo(Employee employee){
        System.out.println("EMployee Info : -  "+employee.name+" "+employee.address+" "+employee.age+" "+employee.isFullTime);
    }

    boolean isEmployeeExempt(Employee employee){
        if(employee.age>55)
        {
            return true;
        }else
        {
            return false;
        }
    }
}
