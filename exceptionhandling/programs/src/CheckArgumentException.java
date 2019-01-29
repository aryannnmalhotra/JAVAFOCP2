import java.lang.throwable.*;
class CheckArgException extends Exception{
	{
		CheckArgException(String m);
		{
			Super(m);
		}
	}
}
class Test{
	public static void main(String args[]){
		try{
			if(args.length<5)
				throw new CheckArgException("Num<5" + "\n");
			int i,sum = 0;
			for(i=0;i<args.length;i++){
				sum=sum+Integer.parseInt(args[i]);
			}
			system.out.println("The sum of the command line arguments is" + "\n" + sum);
			else
				throw new CheckArgException("Arguments should be of integer type only" + "\n");

		}
		Catch(CheckArgException e){
			system.out.println(e.getMessage());
		}

		}
	}
