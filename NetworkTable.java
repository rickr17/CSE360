package cse360assign3;

import java.util.ArrayList;

public class NetworkTable {

	private ArrayList<NetworkEntry> table;
	private StringListExt lookup;
	
	NetworkTable()
	{
		table = new ArrayList<NetworkEntry>();
		lookup = new StringListExt();
	}
	
	public void print()
	{
		int count = 0;
		while(count < table.size())
		{
			System.out.println(table.get(count).toString());
			count++;
		}
	}
	
	public void add(String node, int val, String pred)
	{
		if(lookup.search(node) == -1)
		{
			NetworkEntry adding = new NetworkEntry(node,val,pred);
			lookup.add(node);
			table.add(adding);
		}
		else
		{
			table.get(lookup.search(node)).addPred(pred);
		}
	}	
	public void setSuccessors()
	{
		int position = 0;
		int travel = 0;
		while(position < table.size())
		{
			String traverser = table.get(position).getLabel();
			
			while(travel < table.size())
			{
				StringListExt locator = new StringListExt();
				locator = table.get(travel).getPredList();
				
				String sucLetter = new String();
				sucLetter = table.get(travel).getLabel();
				
				int search = locator.search(traverser);
				
				if(search != -1)
				{
					table.get(position).addSucc(sucLetter);
				}
				travel++;
			}
			travel=0;
			position++;
		}
		
	}
	
}
