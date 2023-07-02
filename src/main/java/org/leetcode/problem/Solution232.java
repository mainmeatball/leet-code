package org.leetcode.problem;

import java.util.Stack;


/**
 * Implement Queue using Stacks
 */
public class Solution232 {

    public static void main(String[] args) {
        final MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
        param_2 = obj.pop();
        System.out.println(param_2);
        param_2 = obj.pop();
        System.out.println(param_2);
        param_2 = obj.pop();
        System.out.println(param_2);
    }

    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */
    private static class MyQueue {

        final Stack<Integer> initStack = new Stack<>();
        final Stack<Integer> qStack = new Stack<>();

        public MyQueue() {}

        public void push(int x) {
            initStack.push(x);
        }

        public int pop() {
            if (!qStack.isEmpty()) {
                return qStack.pop();
            }

            doTransfer();
            if (!qStack.isEmpty()) {
                return qStack.pop();
            }
            throw new IllegalStateException("stack is empty");
        }

        public int peek() {
            if (!qStack.isEmpty()) {
                return qStack.peek();
            }

            doTransfer();
            if (!qStack.isEmpty()) {
                return qStack.peek();
            }
            throw new IllegalStateException("stack is empty");
        }

        public boolean empty() {
            return qStack.isEmpty() && initStack.isEmpty();
        }

        private void doTransfer() {
            final int initStackSize = initStack.size();
            for (int i = 0; i < initStackSize; i++) {
                final int initPop = initStack.pop();
                qStack.push(initPop);
            }
        }
    }
}
