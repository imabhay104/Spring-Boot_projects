package world.ferrina.rest.webservices.restful_web_services.helloworld;

public class HelloWorldBean {
	private String message;

	public HelloWorldBean(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}
	
}
