import java.util.Scanner;

public class EvenoddArray {
    public static void main(String args[]){
	int n,i;
    int a[]=new int[100];
	System.out.println("Enter the no. of elements:");
	Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
	System.out.println("Enter the array elements:");
	for(i=0;i<n;i++){
		a[i] = sc.nextInt();
	}
	for(i=0;i<n;i++){
		if(a[i]%2==0){
		System.out.println(a[i]+ " is even");
	}
	else{
		System.out.println(a[i]+ " is odd");
	}
}
sc.close();
}
	
}
    

