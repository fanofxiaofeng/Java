import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true){
            int n = in.nextInt();
            if(n == 0)
                break;

            SimpleStack<Integer> is = new SimpleStack<Integer>();
            for(int i = 0;i < n;i++){
                String s = in.next();
                char c = s.charAt(0);
                if(c == 'A'){
                    if(is.isEmpty()){
                        System.out.println("E");
                    } else {
                        int temp = is.pop();
                        System.out.println(temp);
                        is.add(temp);
                    }
                } else if(c == 'O'){
                    if(is.isEmpty() == false){
                        is.pop();
                    }
                } else if(c == 'P'){
                    int value = in.nextInt();
                    is.add(value);
                }
            }
            System.out.println();
        }
    }
}

// copied from "folder useful"
class SimpleStack<Item>{
    Node first;
	int numel;// number of elements

    private class Node{
        Item item;
        Node next;
    }

    SimpleStack(){
        first = null;
    }

    public void add(Item it){
        Node oldFirst = first;
        Node temp =  new Node();
        temp.item = it;
        temp.next = oldFirst;
        first = temp;

		numel++;
    }

    public Item pop(){
        Node oldFirst = first;
        first = first.next;
		numel--;
        return oldFirst.item;
    }

	public boolean isEmpty(){
		return numel == 0;
	}
}
