package hr.fer.zemris.java.tecaj.hw5.observer1;

/**
 * Observer which counts the number value changes in the IntegerStorage class it is connected to.
 * Implements hr.fer.zemris.java.tecaj.hw5.observer1.IntegerStorageObserver.
 * 
 * @author Goran Brlas
 * @version 1.0
 *
 */
public class ChangeCounter implements IntegerStorageObserver {
	/**
	 * Integer counting the number of changes in the IntegerStorage class the observer is connected to.
	 */
	private int changes = 0;
	
	@Override
	/**
	 * Prints out the number of value changes since the observer was connected with the IntegerStorage class.
	 */
	public void valueChanged(IntegerStorage iStorage) {
		changes++;
		System.out.println("Number of value changes since tracking: " + changes);
	}
	
}
