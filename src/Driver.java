
public class Driver
{
	public static void main(String[] args)
	{
		BibleBook b1 = new BibleBook("Genesis", "50", "Covers the stories of creation and Noah's Ark.\n");
		BibleBook b2 = new BibleBook("Job", "42", "Covers the story of Job and the tragidies that befell him.\n");
		BibleBook b3 = new BibleBook("Acts", "28", "Covers some of Christianity's early spread by the apostles.");
		b1.display();
		b2.display();
		b3.display();
	}
}
