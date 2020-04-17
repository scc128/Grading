import java.util.*;
public class getPackageName{
	public static void main(String []args ){
		String lastString = "";
		if(args.length == 0 ){
			Scanner input = new Scanner(System.in);
			while(input.hasNextLine()){
				Scanner line = new Scanner(input.nextLine());
				while(line.hasNext()){
					lastString = processString(lastString , line.next());
				}
			}
		}else{
			
			for(String tmp : args){
				lastString = processString(lastString , tmp);
			}
		}
		
	}
	public static String processString(String lastString , String thisString){
		if(thisString.equalsIgnoreCase("package")){
			lastString = thisString;
			return lastString;
		}else{
			if(lastString.equalsIgnoreCase("package")){
				lastString = thisString;
				String [] tmp = thisString.split(";");
				System.out.println(tmp[0]);
				return lastString;

			}else{
				lastString = thisString;
				return lastString;
			}
		}
				// if string is package
					// update lastString value to = package 
					// go to the next string in agrs 

				//else 
					// if last string was package 
						//output the this string without the semicolon 
						// update the last string value
					// if last string was not package 
						// update last string value 
						// and continue to the next string in args  
	}
}