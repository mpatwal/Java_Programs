public class qn20 {
    public static void main(String[] args) {
        // Primitive data types
        int intValue = 10;
        char charValue = 'A';
        double doubleValue = 25.75;
        boolean booleanValue = true;

        // **Boxing**: Converting primitive types to wrapper class objects
        Integer intWrapper = Integer.valueOf(intValue);       // Using valueOf() method
        Character charWrapper = Character.valueOf(charValue); // Using valueOf() method
        Double doubleWrapper = Double.valueOf(doubleValue);   // Using valueOf() method
        Boolean booleanWrapper = Boolean.valueOf(booleanValue); // Using valueOf() method

        System.out.println("Primitive to Wrapper (Boxing):");
        System.out.println("Integer Wrapper: " + intWrapper);
        System.out.println("Character Wrapper: " + charWrapper);
        System.out.println("Double Wrapper: " + doubleWrapper);
        System.out.println("Boolean Wrapper: " + booleanWrapper);

        // **Unboxing**: Converting wrapper class objects back to primitive types
        int intPrimitive = intWrapper.intValue(); // Using intValue() method
        char charPrimitive = charWrapper.charValue(); // Using charValue() method
        double doublePrimitive = doubleWrapper.doubleValue(); // Using doubleValue() method
        boolean booleanPrimitive = booleanWrapper.booleanValue(); // Using booleanValue() method

        System.out.println("\nWrapper to Primitive (Unboxing):");
        System.out.println("Integer Primitive: " + intPrimitive);
        System.out.println("Character Primitive: " + charPrimitive);
        System.out.println("Double Primitive: " + doublePrimitive);
        System.out.println("Boolean Primitive: " + booleanPrimitive);

        // **Autoboxing**: Java automatically converts primitive to wrapper
        Integer autoBoxedInt = intValue; // Autoboxing
        Double autoBoxedDouble = doubleValue; // Autoboxing

        // **Auto-unboxing**: Java automatically converts wrapper to primitive
        int autoUnboxedInt = intWrapper; // Auto-unboxing
        double autoUnboxedDouble = doubleWrapper; // Auto-unboxing

        System.out.println("\nAutoboxing and Auto-unboxing:");
        System.out.println("Autoboxed Integer: " + autoBoxedInt);
        System.out.println("Auto-unboxed Integer: " + autoUnboxedInt);
        System.out.println("Autoboxed Double: " + autoBoxedDouble);
        System.out.println("Auto-unboxed Double: " + autoUnboxedDouble);
    }
}
