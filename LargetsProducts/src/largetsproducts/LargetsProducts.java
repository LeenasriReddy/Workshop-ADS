/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package largetsproducts;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Scanner;



public class LargetsProducts {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            pq.offer(s.nextInt());
            if(i<2)
            {
                System.out.println(-1);
            }else
            {
                int first=pq.poll();
                int second=pq.poll();
                int third=pq.poll();
                int res=first*second*third;
                System.out.println(res);
                pq.offer(first);
                pq.offer(second);
                pq.offer(third);
            }
            }
        pq.add(100);
        pq.add(200);
        pq.add(300);
        pq.add(400);
        System.out.println(pq);
    }
    
}
