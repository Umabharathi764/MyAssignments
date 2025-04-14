package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of java sessions in java week1";
		int count = 0;
		String[] arrOfText = text.split(" ");
		int lengthOfArrText =arrOfText.length;
		for (int i=0; i<lengthOfArrText; i++)
		{
			for (int j=i+1; j<lengthOfArrText; j++)
			{
				if ((arrOfText[i].equals(arrOfText[j])) && (i != j))
				{
					System.out.println("Duplicate Element is:" + arrOfText[j]);
					count=count+1;
					if(count>0)
					{
				
							String modified = text.replaceAll(arrOfText[j]," ");
							System.out.println("Modified String is:" + " " +modified);
						}
				}
					
				}		
											
		}			
		}
		
		}
		




