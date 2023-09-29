package lab3__1;

public class Task1 {
    public static void main(String[] args) {
        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf(42.0);

        String stringValue = "123.45";
        double doubleValue = Double.parseDouble(stringValue);


        Double doubleObj = Double.valueOf(7.5);
        double primitiveDouble = doubleObj.doubleValue();
        float primitiveFloat = doubleObj.floatValue();
        long primitiveLong = doubleObj.longValue();
        int primitiveInt = doubleObj.intValue();
        short primitiveShort = doubleObj.shortValue();
        byte primitiveByte = doubleObj.byteValue();


        System.out.println("Значение объекта Double: " + doubleObj);


        double value = 3.14;
        String doubleString = Double.toString(value);


        System.out.println("doubleObj1: " + doubleObj1);
        System.out.println("doubleObj2: " + doubleObj2);
        System.out.println("doubleValue: " + doubleValue);
        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Primitive float: " + primitiveFloat);
        System.out.println("Primitive long: " + primitiveLong);
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Primitive short: " + primitiveShort);
        System.out.println("Primitive byte: " + primitiveByte);
        System.out.println("doubleString: " + doubleString);
    }
}
