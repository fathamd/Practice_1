package demoStingOperationPrograms;

public class ConstructorException extends Exception {
	String str;

	public ConstructorException(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "Exception occured here:" + str;
	}
	

}
