public class InvokeTester{
        public int add(int param1, int param2){
                return param1 + param2;
        }

        public String echo(String message){
                return "hello:" + message;
        }

        public static void main(String[] args) throws Excetion{
                // traditional way
//                InvokeTester test = new InvokeTester();
//                System.out.println(test.add(1,2));
//                System.out.println(test.echo("Tom"));

                // reflection way
                
                Class<?> classType = InvokeTester.class; // get the class Object via java language gramma
                
                Object InvokeTester = classType.newInstance(); // new instance
                
                // System.out.println(invokeTester instanceof InvokeTester); // test the instance have been created
        }
}
