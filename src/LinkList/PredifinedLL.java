package LinkList;
import java.util.LinkedList;
/**
 *
 * @author Vedant Warhekar
 */
public class PredifinedLL
{
   public static void main(String[] args)
   {
     LinkedList<String> list = new  LinkedList<String>();
     
     list.addFirst("a");
     System.out.println(list);
     
     list.addFirst("is");
     System.out.println(list);
     
     list.addLast("list");
     System.out.println(list);
     
     list.addFirst("this");
     System.out.println(list);
     
     list.removeFirst();
     System.out.println(list);
     
     list.removeLast();
     System.out.println(list);
     
     for(int i=0;i<list.size();i++)
     {
       System.out.println(list.get(i)+"->");
     }
     
     System.out.println(list.size());
           
   }        
}
