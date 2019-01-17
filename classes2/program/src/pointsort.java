import.java.util.*;
class PointSort{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int i,j,num=0;
		Point pArr[] = new Point[num];
		System.out.println("Enter the number of objects that you want to enter the records for : ");
		num = in.nexxtInt();
		Point temp = new Point();
		double  x,y;
		for(i=0;i<pArr.length;i++){
			System.out.println("Enter the values for Point 1 : ");
			System.out.println("Enter the value for x : ");
			x = in.nextDouble();
			System.out.println("Enter the value for y : ");
			y = in.nextDouble();
			pArr[i] = new Point(x,y);

		}
		for(i=0;i<pArr.length;i++){
			for(j=0;j<pArr.length;j++){
				if(pArr[i].getY() > pArr[j].getY()){
					temp = pArr[i];
					pArr[i] = pArr[j];
					pArr[j] = temp;
				}
			}
		}

	}
}