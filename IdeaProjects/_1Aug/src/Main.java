import javax.swing.plaf.synth.SynthTextAreaUI;

public class Main {
    public static void main(String[] args) {

        int num = 54;
        System.out.println(num);
        String num2 = "mamta";
        System.out.println(num2);
        String employeeName  = "rkddebug";
//        int num = "nkdebug"; -> This is not allowed because java is strongly typed languag

     /** Datatypes**/
    //      Primitive
//        Integer - (int (4) , byte (2)(-127to 128)  , long (8)
//        Float - (double(8) , float (4) )
//        Character - char (2 bytes)
//        Boolean - true /false;
        byte b = 125 ;
        int c = 130 ;
        System.out.println("Byte"+b);
        System.out.println("Integer"+c);
        float f= 5.6f;
        System.out.println("float"+f);
        long ll = 20374918l;
        System.out.println(ll);
        double  l= 5.6;
        System.out.println("float"+l);
        char ch = 'm';
        System.out.println(ch);
        /** Typecasting from one data type to another **/
//        We can do type conversion to smaller byte datatype to the larger
        // But to do type casting we have to explicitly define in which datatype we want to cast
        // This may lead to some data losses
        byte blur = 125;
        int present = 254 ;
//        blur = present will show error --- blur = (byte) present ====> Type casting
        // present = blur (Will not because of its range ) ----- Type conversion
        present = blur;
        System.out.println(present);

        /**Operators**/

//        we have + - , * , % Operators to perform mathematical operation between
//
        int nums1 = 50 , nums2 = 60  ;
        System.out.println("Print sum of nums1 and nums2 ");
        System.out.println(nums1+nums2);
        ++nums1 ; nums2++;
        System.out.println("After doing pre increment"+nums1);
        System.out.println("After doing post increment"+nums2);
//        Relational operators (<, >, = , === , != )  and conditional Statements (if and else )
        int a = 10 , p = 20 , k = 20 ;
        if(a>p){
            System.out.println("a is greater than p");
        }else {
            System.out.println("a is smaller than p ");
        }

        if(p==k)
        {
            System.out.println("p And k are equal ");
        }else {
            System.out.println("p and k are not equal ");
        }

     // Switch case
        System.out.println("Switch case ");
        int numberofDays = 1;
        switch (numberofDays){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thrusday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;

        }
                /**Loop **/
                System.out.println("for loop");
                for(int i = 0 ; i<10;i++)
                {
                    System.out.println("count"+i);
                }

        System.out.println("While loop");
         int j = 10;
         while(j>0){
             System.out.println("Count"+j);
             j-- ;
         }
//

        /** **/

    }
//    WIthdraw money method
      void withdraw(String accountNumber , int amount){

      }
}