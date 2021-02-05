package demoStingOperationPrograms;
// Userdefined Exceptional handelling using constructor
public class ConstructorExceptionMain {

	public static void main(String[] args) throws ConstructorException {
		try {
			System.out.println("starting of try block");
			throw new ConstructorException("This is error message");
		}catch(ConstructorException ex){
			System.out.println("catch block");
			System.out.println(ex);
		}
	}

}
