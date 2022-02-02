package mine;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
	
	int row, column;

	public MineSweeper(int row, int column) {
	
		this.row = row;
		this.column = column;
	}

	void print(String field[][])
	{
		for(int i=0; i<this.row; i++)
		{
			for(int j=0; j<this.column; j++)
			{
				System.out.print(field[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	int countMines(int r, int c, String[][] field)
	{
		int count = 0;
		
		if(isValid(r-1, c-1) == true)
		{
			if(field[r-1][c-1] == "*" )
				count++;
		}
		

		if(isValid(r-1, c) == true)
		{
			if(field[r-1][c] == "*" )
				count++;
		}
		

		if(isValid(r-1, c+1) == true)
		{
			if(field[r-1][c+1] == "*" )
				count++;
		}
		

		if(isValid(r, c-1) == true)
		{
			if(field[r][c-1] == "*" )
				count++;
		}
		

		if(isValid(r, c+1) == true)
		{
			if(field[r][c+1] == "*" )
				count++;
		}
		

		if(isValid(r+1, c-1) == true)
		{
			if(field[r+1][c-1] == "*" )
				count++;
		}
		

		if(isValid(r+1, c) == true)
		{
			if(field[r+1][c] == "*" )
				count++;
		}
		

		if(isValid(r+1, c+1) == true)
		{
			if(field[r+1][c+1] == "*" )
				count++;
		}
		
		return count;
	}
	
	boolean isValid(int r, int c)
	{
	    return (r >= 0) && (r < this.row) &&
	           (c >= 0) && (c < this.column);
	}

	void run()
	{
		
		String[][] field = new String[this.row][this.column];
		String[][] temp = new String[this.row][this.column];
		
		for(int i=0; i<this.row; i++)
		{
			for(int j=0; j<this.column; j++)
			{
				field[i][j] = "-";
				temp[i][j] = "-";
			}
		}
		
		print(field);
		
		int n = (this.row * this.column) / 4;
		
		while(n > 0)
		{
			int i = (int) (Math.random() * this.row);
			int j = (int) (Math.random() * this.column);
			
			temp[i][j] = "*";
			n--;
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row and column value: ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		while(!isValid(r, c))
		{
			System.out.println("Out of boundary!\n");
			System.out.println("Enter row and column value: ");
			r = sc.nextInt();
			c = sc.nextInt();
		}
		
		
		while(temp[r][c] != "*")
		{
			
			if(countMines(r, c, temp) != 0)
			{
				String number = Integer.toString(countMines(r, c, temp));
				field[r][c] = number;
			}
			else
			{
				field[r][c] = "0";
			}
			
			print(field);
			
			System.out.println("Enter row and column value: ");
			r = sc.nextInt();
			c = sc.nextInt();
			
			while(!isValid(r, c))
			{
				System.out.println("Out of boundary!\n");
				System.out.println("Enter row and column value: ");
				r = sc.nextInt();
				c = sc.nextInt();
			}
		}
		
		if(temp[r][c] == "*")
		{
			temp[r][c] = "x";
			System.out.println("You lost: "); 
			print(temp);
		}
		
	}
	
}
