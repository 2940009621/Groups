import java.io.File;
import java.io.IOException;
import java.util.*;
public class Running
	{
		static ArrayList <String> name = new ArrayList();
		static ArrayList <String> name2 = new ArrayList();
		static ArrayList <String> RandomNameList = new ArrayList();
		static ArrayList <String> WaitingList = new ArrayList();
		static int B = 0;
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
							
				if(groups > name2.size() || groups == 0){
					System.out.println("It is not going to work");
				}
					
				for(int i = 0; i < name2.size(); i++){
				int random1 = (int) (Math.random()*name.size()-1);
				RandomNameList.add(name.get(random1));
				name.remove(random1);
				}
				
				if(name2.size()%groups == 0){
				
				for(int i = 1; i <= groups; i++){
					
					
					System.out.println("Students in group " + i + " are");
					
					for(int a = 0; a < name2.size()/groups; a++){
						System.out.print(RandomNameList.get(0) + " ");
						RandomNameList.remove(0);
					}
					
					System.out.println("");
				}
				}
				
				
				else{
					int last = name2.size()%groups;
					
					for(int f = last - 1; f >= 0; f++ ){
						WaitingList.add(RandomNameList.get(f - 1));
						RandomNameList.remove(f - 1);
					}
					
					for(int i = 1; i <= groups; i++){
						
						System.out.println("Students in group " + (B + 1) + " are: ");
						
						while(!WaitingList.isEmpty()){
							System.out.print(WaitingList.get(0));
							WaitingList.remove(0);
						}
						
						
						for(int a = 0; a < name2.size()/groups; a++){
							System.out.print(RandomNameList.get(0) + " ");
							RandomNameList.remove(0);
						}
						
						System.out.println("");
					}
					
					
					
					
					
				}
				
					/**if(!RandomNameList.isEmpty()){
						System.out.print("There are " + RandomNameList.size() + " left, they are: ");
						for(int i = 0; i < RandomNameList.size(); i++){
							System.out.print(RandomNameList.get(i) + " ");
						}
					}**/
				
				
				
				
					
					
					
				
				
				
				
			
				
				
				
				
				
			}

	}
