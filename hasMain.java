import java.util.*;
public class hasMain{
	public static void main(String [] args){
		String lastString = "";
		if(args.length == 0 ){
			Scanner input = new Scanner(System.in);
			while(input.hasNextLine()){
				String line = input.nextLine();
				if(line.contains("main")){
					System.out.println(true);
					System.exit(0);
				}else if(line.contains("Main")){
					System.out.println(true);
					System.exit(0);
				}

				
			}
		}
	}
}