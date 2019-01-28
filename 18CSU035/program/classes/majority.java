import java.util.*;
public class MajorityElement{
	public static void main(String args[]){
		Scanner scan =  new Scanner(System.in);
		int i,j,n,min,pos,cnt=0;
		int maj[] = new int[100];
		System.out.println("Enter the size of the array:");
		n = input.nextInt();
		int arr[] = new int[n];
		
		for(i=0;i<n;i++){
			System.out.println("Enter the array element: ");
			arr[i] = input.nextInt();
		}
		for(i=0;i<n;i++)
			System.out.println("Element" + (i+1) + ": " + arr[i]);
		for(i=0;i<(n-1);i++){
			min = arr[i];
			pos = i;
			for(j=(i+1);j<n;j++){
				if(arr[j]<min){
					min = arr[j];
				    pos = j;
				} }
			temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;	


			}
			j=0;
			for(i=0;i<n;i++){
				if(arr[i] == arr[(i+((n/2)+1))])
				  {cnt++;
                  maj[j++] = arr[i];}			}
		}

		for(j=0;j<cnt;j++){
			System.out.println(" " + maj[j]);

		}

		}
	