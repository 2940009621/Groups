import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class twodarray
	{

		static String name [] [] = new String [22] [3];
		static String name2 [] [] = new String [22] [3]; 
		static String RandomList [] [] = new String [22][3];
		static ArrayList<String> A = new ArrayList();
		
		static int count = 0;
		static int groupcount = 1;
		
		
		public static void main(String[] args) throws IOException
			{
				

				System.out.println("How many people do you want in one group?");
				Scanner userinput1 = new Scanner(System.in);
				int people = userinput1.nextInt();	
				int group = A.size()/people;
				
				
				
				Scanner names = new Scanner (new File("StudentList.txt") );
				for(int i = 0; i < 22; i++){
					String student = names.nextLine();
						A.add(student);
					}
				Collections.shuffle(A);
				
				
				
				
				
				
				
				for(int i = 0; i < 22; i++){
					name[i][0] = A.get(i);
					name2[i][0] = A.get(i);
				}	
				String a = "0";
				for(int i = 0; i < 22; i++){
					name[i][1] = a;
					name2[i][1] = a;
					a += 1;
			}
				
				
				
				
		//First Round		
				for(int i = 0; i < group; i++){
					System.out.println("Students in group " + groupcount + " are");
					
					for(int h = 0; h < people; h++){
						System.out.print(A.get(0) + " ");
						System.out.println();
						A.remove(0);
					}
					groupcount ++;
				}
				
				if(!A.isEmpty()){
					for(int i = 0; i < A.size(); i++){
						System.out.println("Students in group " + groupcount + " are");
						System.out.print(A.get(0) + " ");
						A.remove(0);
						
					}
				}
				
				
				//First Round Finish
				
			}
				
				
				

	}
	
