package dataStructure;

import java.util.Stack;

public class ImplementQueueByStack {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public void push(int value) {
        s1.push(value);
    }

    public int pop() {
        while (!s1.empty())
            s2.push(s1.pop());
        int res = s2.pop();
        while (!s2.empty())
            s1.push(s2.pop());
        return res;
    }

}
