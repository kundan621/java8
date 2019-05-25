
public class GroupingBy {
	public static void main(String args[]) {
		
		String str="[{()}]";
		char arr[]=str.toCharArray();
		
		char arr2[]=new char[arr.length];
		
		//no for each on char array
		int top=-1;
		for(char c : arr) {
			//for the first time;
			if(top==-1)
			{
				arr2[++top]=c;
				continue;
			}
			
			if(arr2[top]==c) {
				top--;
			}else {
				arr2[++top]=c;
			}
			
			
			
		}
		if(top==0) {
			System.out.println("Yes");
			
		}else {
			System.out.println("No");
		}
		
		
		
		
		
		
		
		
	}

}
