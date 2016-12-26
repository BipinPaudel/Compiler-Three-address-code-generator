import java.util.Stack;

/**
 * Created by Bipin on 12/25/16.
 */
public class Stack1 {

    Character getTopOfOperator(Stack<Character> stack){
        if (stack.isEmpty()){
            return 'e';
        }

        Character top=stack.peek();
        return top;
    }

}
