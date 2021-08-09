class Addition{
	public int add(int ... n) {
		int sum=0;
		for(int i:n) {
			sum+=i;
			
		}
		return sum;
	}
}
public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj=new Addition();
		System.out.println(obj.add(2,3,4,5,6,7));
	}

}
