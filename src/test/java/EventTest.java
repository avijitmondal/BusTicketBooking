import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author avijit
 *
 */
// An interface to be implemented by everyone interested in "Hello" events
interface HelloListener {
	void someoneSaidHello();
}

// Someone who says "Hello"
class Initiater {
	private List<HelloListener> listeners = new ArrayList<HelloListener>();

	public void addListener(HelloListener toAdd) {
		listeners.add(toAdd);
	}

	public void sayHello() {
		System.out.println("Hello!!");

		// Notify everybody that may be interested.
		for (HelloListener hl : listeners)
			hl.someoneSaidHello();
	}
}

// Someone interested in "Hello" events
class Responder implements HelloListener {
	@Override
	public void someoneSaidHello() {
		System.out.println("Hello there...");
	}
}

public class EventTest {
	public static void main(String[] args) {
		Initiater initiater = new Initiater();
		Responder responder = new Responder();

		initiater.addListener(responder);
		initiater.addListener(responder);

		initiater.sayHello(); // Prints "Hello!!!" and "Hello there..."
	}
}
