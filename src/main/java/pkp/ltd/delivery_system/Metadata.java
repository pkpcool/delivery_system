/**
 * 
 */
package pkp.ltd.delivery_system;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pankajkumar
 *
 */
public class Metadata {
	private boolean status=true;
	private List<Message> errorMessage;
	private List<Message> warningMessage;
	private List<Message> message;
	private int code;
	private Status statusCode=Status.SUCCESS;
	
	public Status getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Status statusCode) {
		this.statusCode = statusCode;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public List<Message> getErrorMessage() {
		return errorMessage;
	}
	public void addErrorMessage(int code,String messagetxt, String className, Exception exception) {
		if(this.errorMessage==null) this.errorMessage=new ArrayList<>();
		Message message= new Message();
		message.setCode(code);
		message.setClassName(className);
		message.setText(messagetxt);
		message.setException(exception);
		this.errorMessage.add(message);
	}
	public List<Message> getWarningMessage() {
		return warningMessage;
	}
	public void addWarningMessage(int code,String messagetxt, String className, Exception exception) {
		if(this.warningMessage==null) this.warningMessage=new ArrayList<>();
		Message message= new Message();
		message.setCode(code);
		message.setClassName(className);
		message.setText(messagetxt);
		message.setException(exception);
		this.warningMessage.add(message);
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public List<Message> getMessage() {
		return message;
	}
	public void addMessage(int code,String messagetxt, String className) {
		if(this.message==null) this.message=new ArrayList<>();
		Message message= new Message();
		message.setCode(code);
		message.setClassName(className);
		message.setText(messagetxt);
		this.message.add(message);
	}
	
	
}

class Message{
	private int code;
	private String text;
	/**
	 * class Name where event occurred.
	 */
	private String className;
	/**
	 * Exception if any occurred
	 */
	private Exception exception;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Exception getException() {
		return exception;
	}
	public void setException(Exception exception) {
		this.exception = exception;
	}
	
	
	
	
}
