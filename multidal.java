import java.util.*;
public class multidal {

   public static void main(String[] args)
    { 
      int i,j;
      ArrayList<Integer> list1 =new ArrayList<>();
      ArrayList<Integer> list2 =new ArrayList<>();
      ArrayList<Integer> list3 =new ArrayList<>();
      ArrayList<ArrayList<Integer>> mainl =new ArrayList<>();
      for(i=1;i<6;i++)
      {
         list1.add(i*2);
         list2.add(i*3);
         list3.add(i*4);
      }
      list1.remove(2);
      list2.remove(2);
      mainl.add(list1);
      mainl.add(list2);
      mainl.add(list3);
      for(i=0;i<mainl.size();i++)
      {
         ArrayList<Integer> cl =mainl.get(i);
         System.out.println("list is");
         for(j=0;j<cl.size();j++)
         {
            System.out.print(cl.get(j) +" ");
         }
      
    }
}
}
