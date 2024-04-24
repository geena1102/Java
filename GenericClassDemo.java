public class GenericClassDemo<T> {
    public void displayType(T parameter) {
        System.out.println("Type of the parameter: " + parameter.getClass().getName());
    }

    public static void main(String[] args) {
        GenericClassDemo<Integer> integerInstance = new GenericClassDemo<Integer>();
        GenericClassDemo<Double> doubleInstance = new GenericClassDemo<Double>();
        GenericClassDemo<String> stringInstance = new GenericClassDemo<String>();
        GenericClassDemo<Boolean> booleanInstance = new GenericClassDemo<Boolean>();

        integerInstance.displayType(10);
        doubleInstance.displayType(3.14);
        stringInstance.displayType("Hello");
        booleanInstance.displayType(true);
    }
}
