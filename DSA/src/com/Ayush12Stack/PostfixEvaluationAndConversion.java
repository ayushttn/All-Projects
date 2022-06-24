package com.Ayush12Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostfixEvaluationAndConversion{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack<Integer> vs = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        for (int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch =='/'){
                int v2 = vs.pop();
                int v1 = vs.pop();
                int val = operation(v1, v2, ch);
                vs.push(val);

                String iv2 = infix.pop();
                String iv1 = infix.pop();
                String ival = "(" + iv1 + ch + iv2 + ")";
                infix.push(ival);

                String pv2 = prefix.pop();
                String pv1 = prefix.pop();
                String pval = ch + pv1 + pv2;
                prefix.push(pval);
            }
            else {
                vs.push(ch - '0');
                infix.push(ch + "");
                prefix.push(ch + "");
            }
        }
        System.out.println(vs.pop());
        System.out.println(infix.pop());
        System.out.println(prefix.pop());
    }
    public static int operation(int v1, int v2, char op){
        if(op == '+'){
            return v1 + v2;
        }
        else if(op == '-'){
            return v1 - v2;
        }
        else if(op == '*'){
            return v1 * v2;
        }
        else {
            return v1 / v2;
        }
    }
}
