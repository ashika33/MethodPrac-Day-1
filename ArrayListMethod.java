import java.util.ArrayList;
public class ArrayListMethod{
	public static ArrayList<Integer> combineList(ArrayList <Integer> list,ArrayList <Integer> list1){
		for (int i = 0; i<list1.size();i++)
			list.add(list1.get(i));

		return list;
	}
	public static void main (String[]args){

		ArrayList <Integer> list = new ArrayList<>();
		for(int  i = 0; i<5;i++)
			list.add(i);
		ArrayList <Integer> list1 = new ArrayList<>();
		for(int i = 5; i<10; i++)
			list1.add(i);

		System.out.println(list);
		System.out.println(list1);
		System.out.println(combineList(list, list1));


	}
}