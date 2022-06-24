package com.Ayush19thHeapp;
import java.util.*;
import java.io.*;
public class PriQueEfiCons {
    public static class PriorityQueue {
        ArrayList<Integer> data;

        public PriorityQueue(int[] arr) {
            data = new ArrayList<>();
            for (int val : arr){
                this.add(val);
            }
        }

        public void add(int val) {
            // write your code here
            data.add(val);
            upheapify(data.size() - 1);
        }
        private void upheapify(int i){
            if(i == 0){
                return;
            }
            int pi = (i - 1) / 2;
            if(data.get(i) < data.get(pi)){
                swap(i, pi);
                upheapify(pi);
            }
        }
        private void swap(int i, int j){
            int ith = data.get(i);
            int jth = data.get(j);
            data.set(i, jth);
            data.set(j, ith);
        }
        public int remove() {
            // write your code here
            if(this.size() == 0){
                System.out.println("Underflow");
                return -1;
            }
            swap(0, data.size() - 1);
            int val = data.remove(data.size() - 1);
            downheapify(0);
            return val;
        }
        private void downheapify(int  pi){
            int mini = pi;
            int li = 2 * pi + 1;
            if(li < data.size() && data.get(li) < data.get(mini)){
                mini = li;
            }
            int ri = 2 * pi + 2;
            if(ri < data.size() && data.get(ri) < data.get(mini)){
                mini = ri;
            }
            if(mini != pi){
                swap(pi, mini);
                downheapify(mini);
            }
        }

        public int peek() {
            // write your code here
            if(this.size() == 0){
                System.out.println("Underflow");
                return -1;
            }
            return data.get(0);
        }

        public int size() {
            // write your code here
            return data.size();
        }
    }
}
