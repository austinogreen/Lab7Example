import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Driver
{
	public static void main(String[] args)
	{
		Stack<String> meStackOVillians = new Stack<String>();
		Queue<String> meQueueOHeroes = new LinkedList<String>();
		
		meStackOVillians.push("Joker");
		meQueueOHeroes.add("Batman");
		
		meStackOVillians.push("Lex Luthor");
		meQueueOHeroes.add("Superman");
		
		meStackOVillians.push("Green Goblin");
		meQueueOHeroes.add("Spiderman");
		
		System.out.println("===== PUSHING =====");
	
		System.out.print("[Stack] >> ")
		for (String vil: meStackOVillians)
		{
			System.out.print(vil + ", ");
		}
		
		System.out.print("\n[Queue] >> ")
		for (String hero: meQueueOHeroes)
		{
			System.out.print(hero + ", ");
		}
		
		System.out.println("===== POPPING =====");
		
		System.out.print("[Stack] >> ")
		for (String vil: meStackOVillians)
		{
			System.out.print(vil.pop() + ", ");
		}
		
		System.out.print("\n[Queue] >> ")
		for (String hero: meQueueOHeroes)
		{
			System.out.print(hero.remove() + ", ");
		}
	}
}