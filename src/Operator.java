/**
 * Created by Bipin on 12/25/16.
 */
public class Operator {

    public int getOperatorPrecedence(Character inOperator){


        if (inOperator=='+' || inOperator=='-'){
            return 1;
        }
        else if (inOperator=='*'){
            return 2;
        }

        else if (inOperator=='/'){
            return 3;
        }

        else if (inOperator=='%'){
            return 4;
        }

        else if (inOperator=='e'){
            return 0;
        }

        else{
            return 0;
        }
    }
}
