import javax.validation.Valid;
import javax.validation.Validator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.validation.constraintvalidation.SupportedValidationTarget;
import javax.validation.constraintvalidation.ValidationTarget;
import javax.validation.executable.ValidateOnExecution;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class ReverseSubstring
{


    public static void main(String[] args) {
        InputModel inputModel= new InputModel();
        String input;
       do {
            System.out.println("Please, Enter lower case English characters, parentheses (a-z) and 1 <= length <= 2000 ");
            System.out.print("Input: ");
            Scanner sc = new Scanner(System.in);
            input = sc.next();
       }while (input.isEmpty() ||
               !input.matches("^(([a-z]|[(]+[a-z]+[)])+)$" )
               || input.length()<1 || input.length()>2000 ) ;

            inputModel.setInputString(input);
            System.out.println("Output: " + reverseInput(inputModel));

    }

    static String reverseInput(@Valid InputModel inputString)
    {
        Stack<Integer> stack= new Stack<Integer>();
        String input = inputString.getInputString();
        int[] temp = new int[input.length()];
        for (int i =0; i<input.length(); i++)
        {
            if (input.charAt(i) == '(')
            {
                    stack.push(i);
            }
            else if (input.charAt(i) == ')') {
                int j = stack.pop();
                stack.push(i);
                stack.push(j);
                temp[j] = i;
                temp[i] = j;
            }
        }
        StringBuilder ans = new StringBuilder();
        int step = 1;
        for (int i = 0; i <input.length(); i+= step) {
            if (input.charAt(i) == '(' || input.charAt(i) == ')') {
                ans.append(input.charAt(stack.pop()));
                i = temp[i];
                step = -step;
            }
            else {
                ans.append(input.charAt(i));
            }
        }

        return ans.toString();
    }
}
