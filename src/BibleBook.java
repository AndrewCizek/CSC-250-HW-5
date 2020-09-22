
public class BibleBook
{
	private String bName;
	private String chapters;
	private String summary;

	public BibleBook(String bName, String chapters, String summary)
	{
		this.bName = bName;
		this.chapters = chapters;
		this.summary = summary;
	}
	
	public String getbName()
	{
		return this.bName;
	}

	public void display()
	{
		System.out.println("Book: " + this.bName + "\nChapter count: " + this.chapters + "\nSummary: " + this.summary);
	}
}