package repeatingelement;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class RepeatingElement {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int key=arr[i];
            if(!hm.containsKey(key))
            {
                hm.put(key,i);
            }
            else
            {
                int value=hm.get(key);
                hm.put(key, value+1);
                
            }
        }
        System.out.println(hm);
    }
    
}