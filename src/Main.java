public class Main {
    // Method overloading is same name but different method parameters
    public void fun(){

    }

    public void fun(String name){

    }



    public void fun(String a, int x){

    }
    public static void main(String[] args) {
        // You all have to see with the eyes of the reference
        //       C c = new C();
        //       B obj = c;
        ////       System.out.println(c.sayHello());
        //       c.sayHello();
        //       c.sayBye();
        //       obj.s

        // Abstraction is a way of hiding unnecessary details
        // Abstraction is a way with the help of which we can show
        // Only important information
        // Hiding implementation


        // Abstract class and abstract methods

//        Mercedes m = new Mercedes();
//        Audi a = new Audi();
//    User u = new User();
//    u.setEmail();
//       //User u = new User("Somendra", "tiwarisomendra22@gmail.com", "123456");
//
//       u.setEmail("ndneinf");
//
//       System.out.println(u.getPass());

        A c = new C();
        c.sayHello();

    }
}