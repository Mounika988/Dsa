import java.util.*;
public class pairsum {
   public static boolean maxw(ArrayList<Integer>list,int l,int r,int t){
      int maxwa=0;
      while(l<r)
      {
         int cw=list.get(l)+list.get(r);
          maxwa=Math.max(maxwa,cw);
          if(cw==t)
          {
            return true;
          }
          else if(cw<t)
          {
            l++;
          }
          else{
            r--;
          }
      }
      return false;
         } 
      public static void main(String[] args)
      {
         Scanner sc= new Scanner(System.in);
         int i;
         int a;
         ArrayList<Integer>list =new ArrayList<>();
         for(i=1;i<5;i++)
            {
               a=sc.nextInt();
               list.add(a);
            }
          //a=[1,2,3,4,6,8] 
          int l=0;
          int r=list.size()-1;
          int t;
          System.out.print("target is");
          t=sc.nextInt();

          System.out.println(maxw(list,l,r,t)) ;
      
      }   
}
