package com.Ayush12Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class PrefixEvaluationAndConversion {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack<Integer> vs = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        for (int i = exp.length() - 1; i >= 0; i--){
            char ch = exp.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch =='/'){
                int v1 = vs.pop();
                int v2 = vs.pop();
                int val = operation(v1, v2, ch);
                vs.push(val);

                String iv1 = infix.pop();
                String iv2 = infix.pop();
                String ival = "(" + iv1 + ch + iv2 + ")";
                infix.push(ival);

                String pv1 = postfix.pop();
                String pv2 = postfix.pop();
                String pval = pv1 + pv2 + ch;
                postfix.push(pval);
            }
            else {
                vs.push(ch - '0');
                infix.push(ch + "");
                postfix.push(ch + "");
            }
        }
        System.out.println(vs.pop());
        System.out.println(infix.pop());
        System.out.println(postfix.pop());
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
