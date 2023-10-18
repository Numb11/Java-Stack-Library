import java.util.List;
import java.util.ArrayList;

class Stack{
    List<String> stack = new ArrayList<String>();
    Integer defined_size;

    public Stack(int parameter_size){
        defined_size = parameter_size;
    }

    public String pop(){
        Integer size = stack.size();
        if (size > 0) {
            String value = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);

            return value;
        }
        return ("Error, Line 29 in main.java, Stack size <= 0");
    }

    public Boolean is_full(){
        return stack.size() == defined_size;
    }

    public void push(String item){
        System.out.println((! is_full())&&(item.getClass().getName() == "java.lang.String"));
        if ((! is_full())&&(item.getClass().getName() == "java.lang.String")){
            stack.add(item);
        }
    }

    public Boolean is_empty(){
        return (stack.size() == 0);
    }

    public String peek(){
        return stack.get(stack.size()-1);
    }

}
