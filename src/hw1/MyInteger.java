package hw1;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int intValue() {
        return value;
    }

    public short shortValue() {
        return (short) value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same reference
        if (obj == null || getClass() != obj.getClass()) return false; // Type check
        MyInteger myInteger = (MyInteger) obj;
        return value == myInteger.value; // Compare values
    }

    public static void main(String[] args) {
        MyInteger num1 = new MyInteger(7);
        MyInteger num2 = new MyInteger(7);
        MyInteger num3 = new MyInteger(10);

        System.out.println("Value: " + num1.getValue());
        System.out.println("Int Value: " + num1.intValue());
        System.out.println("Short Value: " + num1.shortValue());
        System.out.println("num1 equals num2? " + num1.equals(num2));
        System.out.println("num1 equals num3? " + num1.equals(num3));
    }
}
