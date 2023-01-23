import java.util.*;
public class beautifularrl {
   public static void arr(int n){
      ArrayList<Integer>temp =new ArrayList<>();
      ArrayList<Integer>list =new ArrayList<>();
      int a;
list.add(1);
int i,j;
for(i=2;i<=n;i++){
   for(j=0;j<list.size();j++){
      a=list.get(j);
      if(2*a<=n)
      {
         temp.add(a*2);
      }
   }
   
   for(j=0;j<list.size();j++){
      a=list.get(j);
      if(2*a-1<=n)
      {
         temp.add(a*2-1);
      }
   }
   list=temp;
 
}
for(i=0;i<temp.size();i++)
      {
         System.out.println(temp.get(i));
      }

}
      public static void main(String[] args)
      {
         Scanner sc= new Scanner(System.in);
         arr(4);
      }   
}

