package armorize.annonymous;

public class AnnynomusOneplus {

	public static void main(String[] args) {
		
		Oneplus o=new Oneplus() {
			
			@Override
			public void process() {
			System.out.println("hiiiiiiiiii");	
			System.out.println("helloooooooo");
			System.out.println("how r u teja");
			}
			
			@Override
			public void method() {
				System.out.println(" how r u teja ");
				System.out.println(" how r u  ");
				
			}
		};
		o.process();
		o.method();
	}

}
