class User{
    int id;
    String fName;
    String lName ;
    public User(int id,String fName , String lName){
        this.id = id;
        this.fName  = fName;
        this.lName = lName;
    }

   // @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", fName='" + fName + '\'' +
//                ", lName='" + lName + '\'' +
//                '}';
//    }
}

public class Array {

    public static void main(String[] args){
//        Declaring ways of array
        int num[] = {1,5,6,8,9};
        int num1[] = new int[5];// In new case memory is allocated in heap

        for(int i =0 ; i<num.length;i++){
            System.out.println(num[i]);
        }
        for(int i =0 ; i<num1.length;i++)
        {
            num1[i] = i;
        }
        for(int i =0 ; i<num1.length;i++)
        {
            System.out.println(num1[i]);
        }

        // Creating an Object
        User u1 = new User(1, "mamta", "leel");
        User u2 = new User (2, "adarsh", "bajpai");
        User u3 = new User (3, "Jyoti ", "kumatwat");
        User u4 = new User (4, "Harshita", "garg");
        User users[] = new User[4];
        users[0]= u1;
        users[1] = u2;
        users[2] = u3;
        users[3] = u4;

//         Avoid This instead use tostring

     for (User user : users) {
////            System.out.println(user.id + " " + user.fName + user.lName);
     System.out.println(user);
    }
//        for(User user:users){
//            System.out.println(user);
//        }


    }
}

