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
public class Response<I,O> {

	private Metadata metadata;
	private I input;
	private O output;
	public Metadata getMetadata() {
		if(this.metadata==null) this.metadata=new Metadata();
		return metadata;
	}
	public I getInput() {
		return input;
	}
	public void setInput(I input) {
		this.input = input;
	}
	public O getOutput() {
		return output;
	}
	public void setOutput(O output) {
		this.output = output;
	}
	
	
	
}

