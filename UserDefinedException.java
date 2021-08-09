
public class UserDefinedException {
public static void main(String[] args) {
	int i=4;
	int j=9;
	int k;
	try {
	k=i/j;
	if(k==0)
		throw new TeluskoException(" Something Wrong");
		System.out.println(k);
	}
	catch (TeluskoException e){
		System.out.println("Error"+e.getMessage());
	}
}
}
