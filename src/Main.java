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


        A c = new C();
        c.sayHello();

    }
}