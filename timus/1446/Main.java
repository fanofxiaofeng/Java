import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String rubbish = in.nextLine();

        Queue<String> Slytherin = new LinkedList<String>();
        Queue<String> Hufflepuff = new LinkedList<String>();
        Queue<String> Gryffindor = new LinkedList<String>();
        Queue<String> Ravenclaw = new LinkedList<String>();
        for(int i = 0;i < n;i++){
            String name = in.nextLine();
            String house = in.nextLine();
            char c = house.charAt(0);
            if(c == 'S')
                Slytherin.offer(name);
            else if(c == 'H')
                Hufflepuff.offer(name);
            else if(c == 'G')
                Gryffindor.offer(name);
            else
                Ravenclaw.offer(name);
        }
        System.out.println("Slytherin:");
        while(Slytherin.peek() != null)
            System.out.println(Slytherin.poll());

        System.out.println("\nHufflepuff:");
        while(Hufflepuff.peek() != null)
            System.out.println(Hufflepuff.poll());

        System.out.println("\nGryffindor:");
        while(Gryffindor.peek() != null)
            System.out.println(Gryffindor.poll());

        System.out.println("\nRavenclaw:");
        while(Ravenclaw.peek() != null)
            System.out.println(Ravenclaw.poll());
        System.out.println();
    }
}

