package org.example;

import java.util.Optional;

class Friends{
    private String name;
    private int age ;

    public Friends(String name, int age ) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Friends{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class OptionalDemo {
    public static void main(String[] args) {
         Friends frd = new Friends("mamta", 22);

         if(frd!=null){
             System.out.println(frd);
         }
        Optional<Friends>frd2 = Optional.ofNullable(frd);
         if(frd2.isPresent()){
             frd.setName("adarsh");
             frd.setAge(23);
         }
         System.out.println(frd2);


    }
}