import java.io.File;
import java.io.IOException;
import java.util.*;
public class Running
	{
		static ArrayList <String> name = new ArrayList();
		static ArrayList <String> name2 = new ArrayList();
		static ArrayList <String> RandomNameList = new ArrayList();
		public static void main(String[] args) throws IOException
			{
				Scanner names = new Scanner (new File("StudentList.txt") );
				for(int i = 0; i < 22; i++){
					String student = names.nextLine();
					name.add(student);
					name2.add(student);
				}
				
				System.out.println("How many group do you want?");
				Scanner userinput1 = new Scanner(System.in);
				int groups = userinput1.nextInt();		
							
				
					
				for(int i = 0; i < name2.size(); i++){
				int random1 = (int) (Math.random()*name.size()-1);
				RandomNameList.add(name.get(random1));
				name.remove(random1);
				}
				
				
				
				for(int i = 1; i <= groups; i++){
					for(int q = 0; q < RandomNameList.size()/groups; q++){
						
					}
				}
				
				
				
					
					
					
				
				
				
				
			
				
				
				
				
				
			}

	}
