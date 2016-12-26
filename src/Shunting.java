import java.beans.Expression;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by Bipin on 12/25/16.
 */
public class Shunting {
    Shunting operand1;
    Shunting operand2;
    Character charac;
    String name;
    Shunting(Character num){
        charac=num;
        this.name=num+"";

    }

    Shunting(Character num,Shunting e1,Shunting e2,String name){
        operand1=e1;
        operand2=e2;
        charac=num;
        this.name=name;
    }


}
