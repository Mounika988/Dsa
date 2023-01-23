import java.util.*;
public class arrayl {
public static void main(String[] args)
    {
        int i;
        //swap and max of array
        ArrayList<Integer>list1 =new ArrayList<>();
        list1.add(1);
        list1.add(6);
        list1.add(3);
        list1.add(4);
        int indx=2;
        int indx2=1;
        int temp=list1.get(indx);
        list1.set(indx,list1.get(indx2));
        list1.set(indx2,temp);
        int maxr=Integer.MIN_VALUE;
        int maxt=0;
        for(i=0;i<list1.size();i++){
            maxr=Math.max(maxr,list1.get(i));
            System.out.println(list1.get(i));
        }
        System.out.println(maxr);
      //Collections.sort(list1);

      Collections.sort(list1,Collections.reverseOrder());

        
        for(i=0;i<list1.size();i++){
            System.out.print(list1.get(i));
        }
    }
    }

