class Student{
	int rollno;
	String name;
}
public class ArrayDemo {
public static void main(String[] args) {
	//int arr[]=new int[4];
	int arr[]= {4,5,67,7};
	//int arr1[]=new int[] {2,3,45,6};
 	System.out.println(arr[2]);
 	int a[][]= {{1,2,3,4},{4,5,6},{4,5,6,6}};
// 	for(int i=0;i<a.length;i++) {
// 		for(int j=0;j<a[i].length;j++) {
// 			System.out.print(a[i][j]+" ");
// 		}
// 		System.out.println();
// 	}
 	for(int k[]:a) {
 		for(int l:k) {
 			System.out.print(l+" ");
 		}
 		System.out.println();
 	}
}
}
