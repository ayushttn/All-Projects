package com.Ayush12Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class MergeOverlappingIntervals {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time
        pair[] pairs = new pair[arr.length];
        for (int i = 0; i < arr.length; i++){
            pairs[i] = new pair(arr[i][0], arr[i][1]);
        }

        Arrays.sort(pairs);
        Stack<pair> st = new Stack<>();
        for (int i = 0; i < pairs.length; i++){
            if (i == 0){
                st.push(pairs[i]);
            }
            else {
                pair top = st.peek();

                if(pairs[i].st > top.et){
                    st.push(pairs[i]);
                }
                else {
                    top.et = Math.max(top.et, pairs[i].et);
                }
            }
        }
        Stack <pair> rs = new Stack<pair>();
        while (st.size() > 0){
            rs.push(st.pop());
        }
        while (rs.size() > 0){
            pair p = rs.pop();
            System.out.println(p.st + " " + p.et);
        }
    }

    public static class pair implements Comparable<pair>{
        int st;
        int et;
        pair(int st, int et){
            this.st = st;
            this.et = st;
        }
        // this > other return +Ve
        //this  == other return 0
        // this < other return -ve
        public int compareTo(pair other){
            if(this.st == other.st){
                return this.st - other.st;
            }
            else {
                return this.et - other.et;
            }
        }
    }

}
