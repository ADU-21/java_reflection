public class InvokeTester{
        public int add(int param1, int param2){
                return param1 + param2;
        }

        public String echo(String message){
                return "hello:" + message;
        }

        public static void main(String[] args){
                InvokeTester test = new InvokeTester();
                System.out.println(test.add(1,2));
                System.out.println(test.echo("Tom"));
        }
}
