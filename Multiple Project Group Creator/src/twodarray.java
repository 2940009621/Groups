import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class twodarray
	{

		public static void main(String[] args) throws IOException
			{
				String name [] [] = new String [22] [3];
				String name2 [] [] = new String [22] [3]; 
				String RandomList [] [] = new String [22][3];
				
				Scanner names = new Scanner (new File("StudentList.txt") );
				for(int i = 0; i < 22; i++){
					String student = names.nextLine();
					name[i][0] = student;
					name2[i][0] = student
					}
				String a = "0";
				for(int i = 0; i < 22; i++){
					name[i][1] = a;
					name2[i][1] = a;
					a += 1;
			}
				
				Collections.shuffle(name);

	}
	}
