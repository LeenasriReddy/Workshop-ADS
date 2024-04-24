/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversequeueusingstack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;


public class ReverseQueueUsingStack {

    public static void main(String[] args) {
        Queue <Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println(q);
        Stack <Integer> s=new Stack<Integer>();
        while(q.size()>0){
            s.push(q.poll());
        }
        while(s.size()>0){
            q.offer(s.pop());
        }
        System.out.println(q);
    }
    
}
