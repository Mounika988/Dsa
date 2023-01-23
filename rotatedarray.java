import java.util.*;
public class rotatedarray {
   public static boolean rd(ArrayList<Integer>list,int t){
      int b=-1;//break point where the array is rotated
      int maxwa=0;
      int i;
      int r;
      int l;
      int n=list.size();
      for(i=0;i<list.size();i++)
            {
               if(list.get(i)>list.get(i+1))
               {
                  b=i;
                  break;
               }
            }
            l=b+1;
            r=b;
      while(l!=r)
      {
         int cw=list.get(l)+list.get(r);
          if(cw==t)
          {
            return true;
          }
          else if(cw<t)
          {
            l=(l+1)%n;
           
          }
          else{
            r=(n+r-1)%n;
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
         for(i=0;i<6;i++)
            {
               a=sc.nextInt();
               list.add(a);
            }
          //a=[1,2,3,4,6,8] 
          int t;
          System.out.print("target is");
          t=sc.nextInt();

          System.out.println(rd(list,t)) ;
      
      }   
}

