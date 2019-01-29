import java.lang.throwable.*;
class CheckArgException extends Exception{
	{
		CheckArgException(String m);
		{
			Super(m);
		}
	}
}
boolean tryParseInt(String b){
	try{
		Integer.parseInt(b);
		return true;
	} catch(NumberFormatException e){
		return false;
	}
}
class Test{
	public static void main(String args[]){
		try{
			if(args.length<5)
				throw new CheckArgException("Num<5" + "\n");
			int i,sum = 0,flag = 1;
			if
			for(i=0;i<args.length;i++){
				if(tryParseInt(args[i]))
				   sum=sum+Integer.parseInt(args[i]);
			    else{
			    	flag = 0;
			    	break;
			    }
			}
			if(flag == 1)
			    system.out.println("The sum of the command line arguments is" + "\n" + sum);
			else
				throw new CheckArgException("Arguments should be of integer type only" + "\n");

		}
		Catch(CheckArgException e){
			system.out.println(e.getMessage());
		}

		}
	}
