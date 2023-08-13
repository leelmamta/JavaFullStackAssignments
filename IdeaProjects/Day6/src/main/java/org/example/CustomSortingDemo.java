package org.example;

import java.util.*;

class Employee implements Comparable<Employee>{
    String name ;
    int age ;
   public Employee(String name,int  age){
       this.age = age;
       this.name = name;
   }
   // Print
    public String toString(){
       return "Employee{ name = '"+name+'\''+"age= "+age+'}';
    }

    @Override
    public int compareTo(Employee o) {
        if(this.age>o.age) return 1;
        else if (this.name.compareTo(o.name)>0) {
            if (this.age == o.age) {
                return 1;
            } else return -1;
        } else {
            return -1;
        }
    }
    // Write compare function
}
class  Student implements Comparable<Student>{
    String name ;
    int age ;

    public Student(String name, int age ) {
        this.name = name;
        this.age = age;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Student o) {
        if(this.age>o.age) return 1;
        else if(this.age==o.age){
            if(this.name.compareTo(o.name)>0) return 1;
            else return -1;
        }
        else return -1;
    }
}
public class CustomSortingDemo {


    public static void main(String[] args) {
        List<Employee> l1 = new ArrayList<Employee>();
        l1.add(new Employee("mamta", 23));
        l1.add(new Employee("adarsh", 22));
        l1.add(new Employee("ravi", 21));
        l1.add(new Employee("jyoti", 22));
        Collections.sort(l1);

        // Now compare Lambda Expression
        System.out.println(l1);
        List<Employee>l2 = new ArrayList<>();
        l2.add(new Employee("Harshita", 21));
        l2.add(new Employee("Parul", 22));
        l2.add(new Employee("moni", 22));
        l2.add(new Employee("Harshit", 23));

        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
               if(o1.age>o2.age) return 1;
               else return -1;
            }
        };

        Comparator<Employee> comparator1 = (Employee o1, Employee o2)-> {
        return ((o2.age>o1.age)?1:-1);
        };



        Collections.sort(l2,comparator1);
        System.out.println(l2);
        Collections.sort(l2,comparator);
        System.out.println(l2);

        List<String>l3 = Arrays.asList( "Adarsh","Mamta", "Harshita", "priyanka", "moni");

        Collections.sort(l3);// (nlogn + n) , (nlogn)
        Collections.reverse(l3);
        System.out.println(l3);


        List<Student>Lst = Arrays.asList(new Student("Adarsh", 32), new Student("Mamta", 32),
                new Student("Hashita",22),new Student("Moni", 23), new Student("Anita", 32));
//        Comparator<Student>comparator = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//               if(o1.age<o2.age)return 1;
//               else if(o1.age==o2.age) {
//                   if(o1.name.compareTo(o2.name)<0) return 1;
//                   else return -1;
//               }else return -1;
//            }
//        };

        Collections.sort(Lst);

        for(Student student:Lst){
            System.out.println("Name : "+student.name+" Age : "+student.age);
        }

    }
}
