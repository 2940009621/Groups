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
		static ArrayList<String> B = new ArrayList();
		static ArrayList<String> B1 = new ArrayList();
		static ArrayList<String> C = new ArrayList();
		static ArrayList<String> Stay = new ArrayList();
		
		
		
		
		public static void main(String[] args) throws IOException
			{
				

				
				
				
				
				Scanner names = new Scanner (new File("StudentList.txt") );
				for(int i = 0; i < 22; i++){
					String student = names.nextLine();
						A.add(student);
						
					}
				Collections.shuffle(A);
				
				
				for(int i = 0; i < A.size(); i ++){
					B.add(A.get(i));
					C.add(A.get(i));
					Stay.add(A.get(i));
				}
				
				
				
				
				
		/**		for(int i = 0; i < 22; i++){
					name[i][0] = A.get(i);
					name2[i][0] = A.get(i);
				}	
				String a = "0";
				for(int i = 0; i < 22; i++){
					name[i][1] = a;
					name2[i][1] = a;
					a += 1;
			}**/
				System.out.println("How many people do you want in one group?");
				Scanner userinput1 = new Scanner(System.in);
				int people = userinput1.nextInt();	
				int group = A.size()/people;
				int count = 0;
				int groupcount = 1;
				
				
		//First Round		
				
		/**	System.out.println("First round");
				System.out.println();
				System.out.println();
				for(int i = 0; i < group; i++){
					System.out.println("Students in group " + groupcount + " are");
					
					for(int h = 0; h < people; h++){
						System.out.print(A.get(0) + " ");
						System.out.println();
						A.remove(0);
					}
					groupcount += 1;
				}
				
				if(!A.isEmpty()){
					for(int i = 0; i < A.size(); i++){
						System.out.println("Students in group " + groupcount + " are");
						System.out.print(A.get(0) + " ");
						A.remove(0);
						
					}
				}  
				
				**/
				//First Round Finish
				
				
				//Second round
				System.out.println();
				System.out.println();
				System.out.println("Secound round");
				System.out.println();
				System.out.println();
				int group2 = B.size()/people;
				/**if(B.size()%people == 0){
				 group2 = B.size()/people;
				}
				
				else {
					group2 = B.size()/people;
					group2++;
				}**/
				int count2 = 0;
				
				int groupcount2 = 1;
				int countA = 0;
				for(int i = 0; i < group2; i++){
					
					for(int u = 0; u < people; u++){
						if(countA<=B.size()){
						B1.add(B.get(countA));
						countA += people; 
						}
						
						countA ++;
						
						}
					
						
					}
				
				
				if(!B.isEmpty()){
					for(int i = 0; i < B.size(); i++){
						B1.add(B.get(0));
						B.remove(0);
					}
				}
				System.out.println(B1.size());
			
		
				
	
			
			}
	}

				
				
				

	
	
