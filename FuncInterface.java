interface Dc{
	void show();
}
public class FuncInterface {
public static void main(String[] args) {
Dc obj=()->{
	System.out.println("I am LambdaExpression");
};

obj.show();
}
}