



public class test {
    public static void main(String[] args){
        Integer a = 5;
        System.out.println((a.getClass().getName()) ==  "java.lang.Integer");
        Stack stack = new Stack(5);
        stack.push("1");
        stack.push("2");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        
        stack.push("Billy smells");

        System.out.println(stack.peek());



    }
}


