package com.ll;

import java.util.*;

public class Polynomial {
    String expression;
    Queue<Integer> numList;
    Queue<Character> opList;

    Polynomial(String expression) {
        this.expression = expression;
        numList = new LinkedList<>();
        opList = new LinkedList<>();
    }

    public static void main(String[] args) {
    }

    public int calc() {
        this.getSplitInfo();
        int num = numList.poll();
        while (!opList.isEmpty()) {
            char op = opList.poll();
            switch (op) {
                case '+':
                    num = num + numList.poll();
                    break;
                case '-':
                    num = num - numList.poll();
                    break;
                case '*':
                    num = num * numList.poll();
                    break;
                case '/':
                    num = num / numList.poll();
                    break;
            }
        }
        return num;
    }

    public void getSplitInfo() {
        String[] tmp = expression.split(" ");
        for (String x : tmp) {
            if (x.matches("\\d+")) {
                numList.offer(Integer.parseInt(x));
            } else opList.offer(x.charAt(0));
        }
    }
}

