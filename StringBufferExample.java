public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello"); // Create a StringBuffer object
	    sb.append(" World"); // Append method

	    System.out.println("After append(): " + sb);

	    sb.insert(5, " Java"); // Insert method

	    System.out.println("After insert(): " + sb);	 

	    sb.delete(5, 10); // Delete method

	    System.out.println("After delete(): " + sb);

	    sb.reverse(); // Reverse method

	    System.out.println("After reverse(): " + sb);

	    int length = sb.length(); // Length method

	    System.out.println("Length of StringBuffer: " + length);
	    int capacity = sb.capacity(); // Capacity method

	    System.out.println("Capacity of StringBuffer: " + capacity);	 

	    sb.setLength(5); // SetLength method

	    System.out.println("After setLength(): " + sb);

	    sb.replace(0, 5, "Hola"); // Replace method

	    System.out.println("After replace(): " + sb);

	    sb.ensureCapacity(50); // EnsureCapacity method

	    System.out.println("After ensureCapacity(): " + sb);

	    sb.trimToSize(); // TrimToSize method

	    System.out.println("After trimToSize(): " + sb);

	    }
	}
