package cse360assign3;

public class NetworkEntry {

	private String name;
	private int cost;
	private StringListExt predList;
	private StringListExt succList;
	
	NetworkEntry(String nameval, int costval, String pred)
	{
		name = nameval;
		cost = costval;
		predList = new StringListExt();
		predList.add(pred);
		succList = new StringListExt();
	}
	
	public StringListExt getPredList()
	{
		return predList;
	}
	
	public StringListExt getSuccList()
	{
		return succList;
	}
	
	public String getLabel()
	{
		return name;
	}
	
	public int getCost()
	{
		return cost;
	}
	
	public void addSucc(String succElement)
	{
		succList.insert(succElement);
	}
	
	public void addPred(String predElement)
	{
		predList.insert(predElement);
	}
	
	public String toString()
	{
		return (name +" "+ cost +" "+ "Pred" +" "+ predList +" "+ "Succ" +" "+ succList);
	}
}
