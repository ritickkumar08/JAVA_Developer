package com.NovemberHeHe.math;

import java.util.Stack;

//Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the
//result of the evaluation. Note: You are not allowed to use any built-in function which evaluates strings
//as mathematical expressions, such as eval().
//Example 1:
//
//Input: s = "1 + 1"
//Output: 2
//Example 2:
//
//Input: s = " 2-1 + 2 "
//Output: 3
//Example 3:
//
//Input: s = "(1+(4+5+2)-3)+(6+8)"
//Output: 23
class Calculator {
    public int calculate(String s) {
     Stack<Integer> st = new Stack<>();
     int value = 0;
     int currentNumber = 0;
     int sign = 1;
     for(int i = 0 ; i < s.length() ; i++){
        char c = s.charAt(i);

        if(Character.isDigit(c)){
            currentNumber = currentNumber * 10 + (c - '0');
        } else if (c == '+') {
            value += sign * currentNumber;
            currentNumber = 0;
            sign = 1;
        } else if (c == '-') {
            value += sign * currentNumber;
            currentNumber = 0;
            sign = -1;
        } else if (c == '(') {
            st.push(value);
            st.push(sign);
            value = 0;
            sign = 1;
        }else if(c == ')'){
            value += sign * currentNumber;
            currentNumber = 0;
            value *= st.pop();
            value += st.pop();
        }else {
            continue;
        }
     }

     if(currentNumber != 0){
         value += sign * currentNumber;
     }

     return  value;
    }

    public static void main(String[] args) {
        String s = "(1+(4+5+2)-3)+(6+8)";
        Calculator ob = new Calculator();
        System.out.println(ob.calculate(s));
    }
}