//8. Stack: Check Balance of Parentheses
//Question: Use a Stack to check if a string of parentheses is balanced.

import java.util.Stack;

public class Q8 {

    //fields:
    String parentheses;                                                                 //input string
    Stack<Character> stack = new Stack<>();                                             //new stack for tallying
    boolean balanced = true;                                                            //boolean flag for if stack becomes prematurely empty (close exceeds open)


    //constructor:
    public Q8(String parentheses) {
        this.parentheses = parentheses;
    }


    //methods:
    //iterates through string of parentheses, pushing for ( and popping for )
    public void checkBalance() {
        for (int i = 0; i < parentheses.length(); i++) {                                //loop iterates through characters of string
            if (parentheses.charAt(i) == '(') {                                         //for open paren, push to stack
                stack.push(parentheses.charAt(i));
            } else if (parentheses.charAt(i) == ')') {                                  //for close paren,
                if (!(stack.isEmpty())) {                                               //pop stack if it's not empty
                    stack.pop();
                } else {                                                                //or give failure message if stack already empty; set false flag and break loop
                    System.out.println("Unbalanced--close parentheses exceeded open parentheses at index " + i + "!");
                    balanced = false;
                    break;
                }
            } else {                                                                    //for character other than paren, give error message
            System.out.println("Invalid entry--contains characters other than parentheses!");
            balanced = false;
            }
        }
        if (balanced == true) {                                                         //after loop, check for false flag
            if (stack.isEmpty()) {                                                      //if not false, and stack is now empty, give success message
                System.out.println("Balanced--open and close parentheses are equal in number, and at no point did close exceed open!");
            } else {                                                                    //if not false, and stack is not empty, give failure message
                System.out.println("Unbalanced--open parentheses remained unclosed.");
            }
        }                                                                               //if flag was false, error message was already given and program done
    }
}
