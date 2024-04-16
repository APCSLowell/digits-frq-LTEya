import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
		dL = new ArrayList<Integer>();
		String str = "" + num;
		for (int i=0;i<str.length();i++)
			dL.add(str.charAt(i)-'0');
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for (int i=0;i<dL.size()-1;i++)
			if(dL.get(i+1)<=dL.get(i)) return false;
		return true;
	}
	
	public String toString()
	{
		return dL.toString();
	}
}
