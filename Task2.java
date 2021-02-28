package sols;


public class Task2{
	
	public static void main(String[] args) {
		String s = "aabbba";
		
		System.out.println(consistentStr(s));
	}
	
public static boolean consistentStr (String s){
	
if(s.isEmpty()) {
	return true;
}

int i=0;
boolean checkFlag=true;

if(s.charAt(i)=='a'){

for(;i<s.length();i++){
if(s.charAt(i)=='a')
 continue;
else if(s.charAt(i)=='b')
 break;
}

for(;i<s.length();i++){
if(s.charAt(i)=='b')
 continue;
else{
checkFlag=false;
break;
}
}
}else if(s.charAt(i)=='b'){

for(;i<s.length();i++){
if(s.charAt(i)=='b')
 continue;
else{
checkFlag=false;
break;
}
}
}

return checkFlag;
}
}
