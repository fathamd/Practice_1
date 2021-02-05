package demoStingOperationPrograms;
//Userdefined Exceptional handelling with no constructor
public class NonConstructorExceptionMain {
	
	void productCheck(int n) throws NonConstructorException {
		if(n<6) {
			throw new NonConstructorException("Error message here");
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println("try block");
			NonConstructorExceptionMain p = new NonConstructorExceptionMain();
			p.productCheck(5);
		} catch(NonConstructorException ex) {
			System.out.println("catch block");
			System.out.println(ex.getMessage());
		}
	}

}
