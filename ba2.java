import java.util.*;
public class ba2 {
   public static ArrayList<Integer> arr(int n){
      ArrayList<Integer>list =new ArrayList<>();
      dc(1,1,list,n);
return list;
}
public static void dc(int s,int e, ArrayList<Integer>list,int n){
  if(s+e>n)
  {
list.add(s);
return;
  }
  dc(s,2*e,list,n);
  System.out.println(s);
  System.out.println(e);
  System.out.println(s+e);
  dc(s+e,2*e,list,n);
}
      public static void main(String[] args)
      {
         Scanner sc= new Scanner(System.in);
         System.out.println(arr(4));
      }   
}
