import java.util.Arrays;
import java.util.*;
class CustomCollection<E> {
   private static final int INITIAL_CAPACITY = 10;
   private int size = 0;
   private Object data[] = {};
   
   public CustomCollection() {
   data = new Object[INITIAL_CAPACITY];
   }
   
   public void add(E e) {
   if (size == data.length) {
   ensureCapacity(); 
  
   }
   data[size++] = e;
   }
    @SuppressWarnings("unchecked")
   public E get(int index) {
   if (index < 0 || index >= size) {
   throw new IndexOutOfBoundsException("Index: " + index + ", Size "+ index);
   }
   return (E) data[index]; 
   }
   public Object remove(int index) {
 
      if (index < 0 || index >= size) {
   throw new IndexOutOfBoundsException("Index: " + index + ", Size "+ index);
   }
   Object removedElement = data[index];
   for (int i = index; i < size - 1; i++) {
   data[i] = data[i + 1];
   }
   size--; 
   return removedElement;
   }
 
   private void ensureCapacity() {
   int newIncreasedCapacity = data.length * 2;
   data = Arrays.copyOf(data, newIncreasedCapacity);
   }
   
   public void display() {
   System.out.print("Displaying list : ");
   for (int i = 0; i < size; i++) {
   System.out.print(data[i] + " ");
   }
   }
}

public class Main {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
   CustomCollection<Integer> list = new CustomCollection<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(7);
	list.add(8);
	list.add(9);
	list.add(10);
	
	
	System.out.println("Enter your choice Add,remove,get");
	String s=sc.nextLine();
	if(s.equals("Add"))
	{
	System.out.println("Enter element to add in the list");
	list.add(sc.nextInt());
	}
	else if(s.equals("remove")){
	System.out.println("Enter index to remove element in the list");
	System.out.println(list.remove(sc.nextInt()));	
	}
	else if(s.equals("get")){
	System.out.println("Enter index to get element in the array");
	System.out.println(list.get(sc.nextInt()));
	}
	list.display();
	


   
   }
}
