public class word_puzzle
{
	char[][] my_table = new char[][] {
			{'t', 'h', 'i', 's'},
			{'w', 'a', 't', 's'},
			{'o', 'a', 'h', 'g'},
			{'f', 'g', 'd', 't'} };

	public word_puzzle()
	{ 
		
	}
	public int[][] find_word(String word)
	{
		int row_column_length = 4, word_index = 0;
		int[][] Word = new int[2][2];
		for(int x = 0; x < row_column_length; x++)
		{
			for(int y = 0; y < row_column_length; y++)
			{
				if(my_table[x][y] == word.charAt(word_index))
				{
					x = check_right(x);
					System.out.println(x);
				}
			}
		}		
		return Word;
	}
	public int check_right(int x)
	{
		if(x < 4)
		{
			x = x + 1;
		}
		
		return x;
	}
	public void check_below()
	{
		
	}
	public void check_diagonal()
	{
		
	}
}