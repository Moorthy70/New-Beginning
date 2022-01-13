import java.io.*;
public class Arrayprograms {

	public static void main(String[] args) {
		Arrayprograms fg = new Arrayprograms();
		Arrayprograms.Arrayprograms2 fgg = fg.new Arrayprograms2();
		
		System.out.println("After sort.....");
fgg.sort();     //Bubblesort
System.out.println("Linear......\n");
fgg.linear();    //Linear search
System.out.println("Binary search......\n ");
int y  =fgg.Binarysearch();     //Binary search
if(y>0)
	System.out.println("Yes,The Number is present in the Array\n");
else
System.out.println("The Number is not present\n ");
System.out.println("Two Dimensioal............\n");
fgg.twodim();     //twodimensional
System.out.println("Odd Numbers.....\n");
fgg.odd();
System.out.println("Even Numbers.....\n");
fgg.even();
	}
	
	
class Arrayprograms2 {
	int[]  ar= {2,7,9,1,2,5,4,4};
	public void sort()  {  //Bubblesort
		int i,temp,k,h;
		h=ar.length-1;
		for(i=0;i<ar.length;i++){
			for(k=0;k<h;k++){
			if(ar[k]>ar[k+1]){
				 temp= ar[k+1];
				 ar[k+1] =ar[k];
				 ar[k]=temp;
			}
			}
			h--;
		}
		for(int y :ar)
			System.out.println(y);
	} //sort
	public void linear() {
		int find =5;
		boolean presence =false;
		for(int i=0;i<ar.length;i++)	{
			if(ar[i]==find){
				System.out.println("Yes,"+find +" is present in the Array");
				presence =true;
				break;
			}
		}
		if(presence==false)
			System.out.println(find+" is not in the Array");
	}   //linear
public int Binarysearch(){
	int min =0,max = ar.length-1,mid=0,find =4;
	while(min<=max){
		mid  = (min+max)/2;
	
	if(find==ar[mid]){
	return mid;
	
	}
	else if(find>ar[mid]){
		min=mid+1;
	}
	else{
	max=mid-1;	
	}
	
	}
	return -1;
}   //BinarySearch

	int[] j = {23,2,2,321,1,542,54,32,5,54,234};
	public void odd()	{
		int[] k = new int[j.length/2];
		int l =0;
		for(int i =1;i<j.length;i+=2){
			k[l]=j[i];
			l++;
		}
	for(int y:k)
		System.out.println(y);
	}  //odd
	public void even()	{
		int[] k = new int[j.length/2 +1];
		int l =0;
		for(int i =0;i<j.length;i+=2){
			k[l]=j[i];
			l++;
		}
	for(int y:k)
		System.out.println(y);
	}   //even
	
public void twodim() {

class twodimen {
	int[][]  aj =new int[3][3];
	public void twodimensional(){
		int j,val=0;
		for(int i=0;i<3;i++){
			for(j=0;j<3;j++)	{
				aj[i][j]=val;
				val =val+1;
	}
			j=0;
		}
		for(int i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print(aj[i][j] +" ");
	}
			j=0;
			System.out.println(" ");
		}
		System.out.println("\n");		
}      //twodimensional
public void totrow(){
	int total =0;
	for(int i =0;i<3;i++){
		for(int j =0;j<3;j++){
			total =total+aj[i][j];
		}
		System.out.println("Total of "+i+" row =" + total);
	total=0;
	}
	System.out.println("\n");
}   //totrow
public void totcol()
{
	int total =0;
	for(int i =0;i<3;i++)	{
		for(int j =0;j<3;j++){
			total =total+aj[j][i];
		}
		System.out.println("Total of "+i+" column =" + total);
		total =0;
	}
	System.out.println("\n");
}  //totcol
public void diagnol()
{
	int total =0;
	for(int i =0;i<3;i++) {
		for(int j =0;j<3;j++)	{
			if(i==j){
				total = total +aj[i][j];
			}
		}
	}
	System.out.println("Total of the Diagonal  =" + total);
	System.out.println("\n");
}  //diagnol
}   // Inner class inside Method twodim

twodimen r = new twodimen();
r.twodimensional();
r.totcol();
r.totrow();
r.diagnol();
}    // method twodim
}  // Inner class
} // Main class