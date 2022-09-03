package com.company;

public class Main {

    public static void main(String[] args) {

        String brackets = "({})";

        System.out.println(isBalanced("({})"));

        String brackets2 = "{()}{[]}";
        if(isBalanced(brackets2))
        {
            System.out.println("{()}{[]}, True");
        }
        else {
            System.out.println("{()}{[]}, False");
        }

        String brackets3 = "[{}}";
        if(isBalanced(brackets3))
        {
            System.out.println("[{}}, True");
        }
        else {
            System.out.println("[{}}, False");
        }

        String brackets4 = "{()[{}]}{}";
        if(isBalanced(brackets4))
        {
            System.out.println("{()[{}]}{}, True");
        }
        else {
            System.out.println("{()[{}]}{}, False");
        }

        String brackets5 = "{(})";
        if(isBalanced(brackets5))
        {
            System.out.println("{(}), True");
        }
        else {
            System.out.println("{(}), False");
        }

        String brackets6 = "([(]{)})";
        if(isBalanced(brackets6))
        {
            System.out.println("([(]{)}), True");
        }
        else {
            System.out.println("([(]{)}), False");
        }

    }

    public static boolean isBalanced(String brackets)
    {

        LinkedListStack<Character> myStack = new LinkedListStack<>();

        for (int i = 0; i < brackets.length(); i++) {

            char brack = brackets.charAt(i);

            if (brack == '(' || brack == '{' || brack == '[') {
                myStack.push(brack);
            }
            else {

                if(myStack.isEmpty()) return false;

                char top = myStack.peek();

                if (brack == ')' && top == '(' || brack == '}' && top == '{' || brack == ']' && top == '[') {
                    myStack.pop();
                }
            }
        }
        return (myStack.isEmpty());

    }
}
