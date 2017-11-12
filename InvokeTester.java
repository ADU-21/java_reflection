import java.lang.reflect.Method;

public class InvokeTester{
        public int add(int param1, int param2){
                return param1 + param2;
        }

        public String echo(String message){
                return "hello:" + message;
        }

        public static void main(String[] args) throws Exception{
                // traditional way
//                InvokeTester test = new InvokeTester();
//                System.out.println(test.add(1,2));
//                System.out.println(test.echo("Tom"));

                // reflection way
                Class<?> classType = InvokeTester.class; // get the class Object via java language gramma
                Object InvokeTester = classType.newInstance(); // new instance
                // System.out.println(invokeTester instanceof InvokeTester); // test the instance have been created

                // call method via reflection way
                Method addMethod = classType.getMethod("add", new Class[] {int.class, int.class });  // get add method via method name add parameters 
                Object result = addMethod.invoke(InvokeTester, new Object[]{1, 2});
                System.out.println((Integer)result);
                
                // call echo Method
                Method echoMethod = classType.getMethod("echo", new Class[] { String.class });
                Object speak = echoMethod.invoke(InvokeTester, new Object[]{"Tom"});
                System.out.println(speak);
        }
}
