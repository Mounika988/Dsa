import java.util.*;
public class storewater {
   public static int maxw(ArrayList<Integer>list,int l,int r){
int maxwa=0;
while(l<r)
{
   int h=Math.min(list.get(l),list.get(r));
   int w=r-l;
   int cw=h*w;
    maxwa=Math.max(maxwa,cw);
    if(list.get(l)<list.get(r))
    {
      l++;
    }
    else{
      r--;
    }
}
return maxwa;
   } 
public static void main(String[] args)
{
   Scanner sc= new Scanner(System.in);
   int i;
   int a;
   ArrayList<Integer>list =new ArrayList<>();
   for(i=1;i<10;i++)
      {
         a=sc.nextInt();
         list.add(a);
      }
    //a=[1,2,3,4,6,8] 
    int l=0;
    int r=list.size()-1;
    System.out.println(maxw(list,l,r)) ;

}   
}
