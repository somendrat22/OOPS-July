public class Main {
    // Method overloading is same name but different method parameters

    public static void main(String[] args) throws UserNotFoundException {
//        try{
//            // You will write the code which can throw exception.
//            // Throw : With the help of throw keyword user can manually generate or throw exception by himself.
//
//        }catch (ArrayIndexOutOfBoundsException e){
//            // If in the try block if exception arises then you will catch that exception in the catch bloxk
//            // In catch block if you want to write logic you can write
//            System.out.println("Hey caught exception");
//        }catch(Exception e){
//            System.out.println("Exception");
//        }

//        throw new WrongCredentialsException("Hey crceated wrong credential exception");


        try{
            // If no exception got generated then all the lines that are present in try block will run
            int a = 10/0;
            System.out.println("Exception didn't got generated");
        }catch(Exception e){
            // If exception got generated then all the lines of try block will not run and your
            // catch block will start running
            System.out.println("Exception generated");
        }finally {
            // this is the kind of block that is always going to run
            // either exception got generated or exception will not get generated
            System.out.println("Entered finally block");
            try{

            }catch(Exception e){

            }
        }

    }
}