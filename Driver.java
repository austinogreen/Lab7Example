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
	}
}