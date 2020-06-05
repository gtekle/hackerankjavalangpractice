import java.util.*;
public class InstanceOfTwo{
	
   static Iterator func(ArrayList mylist){
      Iterator it=mylist.iterator();
      while(it.hasNext()){
         Object element =it.next();
         if(element instanceof String)//Hints: use instanceof operator

			break;
		}
      return it;
      
   }
   @SuppressWarnings({ "unchecked" })
   public static void main(String []args){
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      System.out.println("Type in # of integer elements of the collection: ");
      int n = sc.nextInt();
      System.out.println("Type in # of String elements of the collection: ");
      int m = sc.nextInt();
      System.out.println("Now, type in the int elements of the collection: ");
      for(int i = 0;i<n;i++){
         mylist.add(sc.nextInt());
      }
      System.out.println("Now, type in the string elements of the collection: ");
      mylist.add("###");
      for(int i=0;i<m;i++){
         mylist.add(sc.next());
      }
      
      Iterator it=func(mylist);
      while(it.hasNext()){
         Object element = it.next();
         System.out.println((String)element);
      }
   }
}
