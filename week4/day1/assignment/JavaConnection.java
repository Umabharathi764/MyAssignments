package week4.day1.assignment;

public class JavaConnection implements DatabaseConnection {

	//Implementing unimplemented/abstract methods from DatabaseConnection interface
	@Override
	public void connect() {
		System.out.println("Database connection established");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Database is disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Update is executed");
		
	}
	

	public static void main(String[] args) {
		//Creating an object for concrete class
		JavaConnection javaConn = new JavaConnection();
		//calling the implemented methods
		javaConn.connect();
		javaConn.disconnect();
		javaConn.executeUpdate();
		
		

	}

}
