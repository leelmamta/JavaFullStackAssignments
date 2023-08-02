class Os{
    String orgName;
    String Name ;
    int randSize;
   static String location;
    public  void config(){
        System.out.println(this.Name+" "+this.orgName+" "+this.randSize);
    }
    public static void InternalFunc(){

    }

}
public class StaticDemo {
    public static void main(String[] args){
        // Crating objest
        Os o1 = new Os();
        o1.orgName = "msft";
        o1.Name = "windows";
        o1.randSize =16;

        Os o2 = new Os();
        o1.orgName = "Apple";
        o1.Name = "Mac";
        o1.randSize =32;
   Os.location = "Blcs";
//   Static is used for test cases , famous in design pattern
//   When Should We prefer Static ? - util functions these are used
 //  Generic part can be marked as Static function or variables

        o1.config();
        o2.config();
        Os.InternalFunc();
    }
}
