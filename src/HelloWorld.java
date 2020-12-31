import java.util.ArrayList;

public class HelloWorld  extends aa{
	
	int age =2;
	String name="Anish" ;
	
	public HelloWorld() {
		
	}
	
	
	
	
	public HelloWorld(int age, String name) {
	this.age=age;
		this.name=name;
		
		
	
		
	}
	
	public int getAge() {
		return this.age;
	}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.age+" "+this.name;
		
	}
	
	

	public static void main(String[] args) {
		
		HelloWorld h= new   HelloWorld();
		
		System.out.println(h.getAge());
	}

}
