public class StringDemo {
    public static void main(String[] args){
        String str = "mamta";
        String s1 = new String("mamta");
        // literal Pool - s1 will allocate to heap memory but here as it will first search
        // if the particular string is already present in the memory , if it is true then it will point to the same address as that of str
        // else it will create a new ====> literal pool

        System.out.println(str.hashCode());
        System.out.println(s1.hashCode());

        // It will be same is we are creating str with new as well
        // Strings are immutable - means we cant overwrite because in the java it is final assigned


        /** String Buffer and String Builder ==> Multithreading  **/

        StringBuffer s2 = new StringBuffer("Adarsh ");
        System.out.println(s2.reverse());
        System.out.println(s2.length());


    }
}
