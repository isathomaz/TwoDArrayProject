package array.controller;

import array.model.Giraffe;

public class ArrayController
{
	private int [][] myIntArray;
	private Giraffe [][] myGiraffes;
	private String [][] myStringArray;
	
	public ArrayController()
	{
		myIntArray = new int [5][3];
		myGiraffes = new Giraffe[6][4];
		myStringArray = new String[4][4];
	}
	
	public void start()
	{
		
	}

	public Giraffe[][] getMyGiraffes()
	{
		return myGiraffes;
	}

	public void setMyGiraffes(Giraffe[][] myGiraffes)
	{
		this.myGiraffes = myGiraffes;
	}


	public int[][] getMyInt()
	{
		return myIntArray;
	}

	public void setMyInt(int[][] myIntArray)
	{
		this.myIntArray = myIntArray;
	}
	
	public String[][] getMyStringArray()
	{
		return myStringArray;
	}

	public void setMyStringArray(String[][] myStringArray)
	{
		this.myStringArray = myStringArray;
	}

	public void setGiraffe(int position, int legs, int eyes, int spots, String name, double necklength )
	{
		
	}
	
	public void addGiraffe(int legs, int eyes, int spots, String name, double necklength)
	{
		for(int row = 0; row < myGiraffes.length; row++)
		{
			for(int col = 0; col < myGiraffes[0].length; row++)
			{
				myGiraffes[6][4] = new Giraffe();
			}
		}
	}
}
