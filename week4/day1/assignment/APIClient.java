package week4.day1.assignment;

public class APIClient {
	
	//Creating a method sendRequest to pass one argument
		
	public void sendRequest(String endpoint) {		
		System.out.println("Endpoint URL is : " + endpoint);
		
	}
	
	//Creating a method sendRequest to pass 3 arguments
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Endpoint URL is : " + endpoint);
		System.out.println("Request Body is : " + requestBody);
		System.out.println("Request Status is : " + requestStatus);
	}
	
	public static void main(String[] args) {
		//Creating an object for APIClient class
		APIClient apiRequest = new APIClient();
		//calling the method with 1 argument
		apiRequest.sendRequest("https://api.example.com/users");
		//Calling the method with 3 arguments
		String requestBody ="{ \"username\": \"Demo User\", \"email\": \"demo.testuser@example.com\" }";
		apiRequest.sendRequest("https://api.example.com/registration", requestBody, true);

}
}
