package com.company;

public class Main {
    public static void main(String args[]) {
        dataTypesTester.testByte();
        dataTypesTester.testShort();
        dataTypesTester.testInt();
        dataTypesTester.testLong();
        dataTypesTester.testFloat();
        dataTypesTester.testDouble();
        dataTypesTester.testChar();
        dataTypesTester.testBoolean();
        Student st = new Student("Dima", 7);
        dataTypesTester.testStringStudent(st.toString());
    }
}

/**
 * creating a class to test permitted operations in java over
 * primitive data types
 */

class dataTypesTester {
// Integral types

    public static void testByte() {
        byte a = 10, b = 3, c;
        System.out.println("\n Arithmetical Operators");
//addition
        c = (byte) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
// substraction
        c = (byte) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
// multiplication
        c = (byte) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = (byte) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
//modulus
        c = (byte) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);
        /* ArithmeticException
     c = (byte) (a / 0);
     c = (byte)(a % 0);
         */
//unary minus
        a = 10;
        c = (byte) -a;
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = (byte) +a;
        System.out.printf("+%d = %d\n", a, c);
        //prefix increment
        a = 10;
        System.out.printf("++%d = %d\n", a, ++a);

//postfix increment
        a = 10;
        System.out.printf("%d++ = %d\n", a, a++);

//prefix decrement
        a = 10;
        System.out.printf("--%d = %d\n", a, --a);
//postfix decrement
        a = 10;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n Bitwise Operators");
// AND &
        a = 10;
        c = (byte) (a & b);
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("Binary:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
// OR |
        c = (byte) (a | b);
        System.out.printf("\n %d | %d = %d\n", a, b, c);
        System.out.println("Binary: ");
        System.out.printf("\n %s | s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
// XOR ^
        c = (byte) (a ^ b);
        System.out.printf("\n%d ^ %d = %d\n", a, b, c);
        System.out.println("Binary: ");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
//Compliment ~
        c = (byte) ~a;
        System.out.printf("\n~%d = %d\n", a, c);
        System.out.println("Binary: ");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
// left shift
        c = (byte) (a << 1);
        System.out.printf("\n%d << 1 = %d\n", a, c);
        System.out.println("Binary: ");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
// right shift
        c = (byte) (a >> 1);
        System.out.printf("\n%d >> 1 = %d\n", a, c);
        System.out.println("Binary: ");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
//zero fill right shift
        c = (byte) (a >>> 1);
        System.out.printf("\n%d >>> 1 = %d\n", a, c);
        System.out.println("Binary: ");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n Assignment operators");

        c = 13;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

//c %= 0; --> Arithmetical Exception
// c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        c = 7;
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n Relational Operators");

// greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
// greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
// less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
// less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
// equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
// not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n Logical Operators");

// logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));

// bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

// logical OR
        System.out.printf("(%d >= %d) || (%d == 0) --> %b\n", a, b, b,
                (a >= b) || (b == 0));

// bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

// logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

// logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***Condition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\n***Type Cast Operator:");

        int i = 123;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = (byte) i;
        System.out.printf("int = byte: c = (byte)%d --> c = %d\n", i, c);
        c = (byte) sh;
        System.out.printf("int = short: c = (byte)%d --> c = %d\n", sh, c);
        c = (byte) ch;
        System.out.printf("int = char: c = (byte)%c --> c = %d\n", ch, c);
        c = (byte) l;
        System.out.printf("int = long: c = (byte)%d --> c = %d\n", l, c);
        c = (byte) f;
        System.out.printf("int = float: c = (byte)%f --> c = %d\n", f, c);
        c = (byte) d;
        System.out.printf("int = double: c = (byte)%f --> c = %d\n", d, c);
        // c = (byte)bool;
        System.out.printf("int = boolean: c = (byte)%b --> Compile Error\n", bool);
    }

    public static void testShort() {
        short a = 10, b = 3, c;
        System.out.println("\n Arithmetical Operators");
//addition
        c = (short) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
// substraction
        c = (short) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
// multiplication
        c = (short) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = (short) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
//modulus
        c = (short) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);
        /* ArithmeticException
     c = (byte) (a / 0);
     c = (byte)(a % 0);
         */
//unary minus
        a = 10;
        c = (short) -a;
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = (short) +a;
        System.out.printf("+%d = %d\n", a, c);
        //prefix increment
        a = 10;
        System.out.printf("++%d = %d\n", a, ++a);

//postfix increment
        a = 10;
        System.out.printf("%d++ = %d\n", a, a++);

//prefix decrement
        a = 10;
        System.out.printf("--%d = %d\n", a, --a);
//postfix decrement
        a = 10;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n Bitwise Operators");
// AND &
        a = 10;
        c = (short) (a & b);
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("Binary:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
// OR |
        c = (short) (a | b);
        System.out.printf("\n %d | %d = %d\n", a, b, c);
        System.out.println("Binary: ");
        System.out.printf("\n %s | s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
// XOR ^
        c = (short) (a ^ b);
        System.out.printf("\n%d ^ %d = %d\n", a, b, c);
        System.out.println("Binary: ");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
//Compliment ~
        c = (short) ~a;
        System.out.printf("\n~%d = %d\n", a, c);
        System.out.println("Binary: ");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
// left shift
        c = (short) (a << 1);
        System.out.printf("\n%d << 1 = %d\n", a, c);
        System.out.println("Binary: ");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
// right shift
        c = (short) (a >> 1);
        System.out.printf("\n%d >> 1 = %d\n", a, c);
        System.out.println("Binary: ");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
//zero fill right shift
        c = (short) (a >>> 1);
        System.out.printf("\n%d >>> 1 = %d\n", a, c);
        System.out.println("Binary: ");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n Assignment operators");

        c = 13;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

//c %= 0; --> Arithmetical Exception
// c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        c = 7;
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n Relational Operators");

// greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
// greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
// less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
// less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
// equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
// not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n Logical Operators");

// logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));

// bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

// logical OR
        System.out.printf("(%d >= %d) || (%d == 0) --> %b\n", a, b, b,
                (a >= b) || (b == 0));

// bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

// logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

// logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***Condition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\n***Type Cast Operator:");

        int i = 123;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = (short) i;
        System.out.printf("int = byte: c = (short)%d --> c = %d\n", i, c);
        c = (short) sh;
        System.out.printf("int = short: c = (short)%d --> c = %d\n", sh, c);
        c = (short) ch;
        System.out.printf("int = char: c = (short)%c --> c = %d\n", ch, c);
        c = (short) l;
        System.out.printf("int = long: c = (short)%d --> c = %d\n", l, c);
        c = (short) f;
        System.out.printf("int = float: c = (short)%f --> c = %d\n", f, c);
        c = (short) d;
        System.out.printf("int = double: c = (short)%f --> c = %d\n", d, c);
        // c = (short)bool;
        System.out.printf("int = boolean: c = (short)%b --> Compile Error\n", bool);
    }

    public static void testInt() {
        int a = 10, b = 3, c;
        System.out.println("\n Arithmetical Operators");
//addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
// substraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
// multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
//modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        /* ArithmeticException
     c = a / 0;
     c = a % 0;
         */
//unary minus
        a = 10;
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        //prefix increment
        a = 10;
        System.out.printf("++%d = %d\n", a, ++a);

//postfix increment
        a = 10;

        System.out.printf("%d++ = %d\n", a, a++);

//prefix decrement
        a = 10;
        System.out.printf("--%d = %d\n", a, --a);
//postfix decrement
        a = 10;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n Bitwise Operators");
// AND &
        a = 10;
        c = a & b;
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("Binary:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
// OR |
        c = a | b;
        System.out.printf("\n %d | %d = %d\n", a, b, c);
        System.out.println("Binary: ");
        System.out.printf("\n %s | s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
// XOR ^
        c = a ^ b;
        System.out.printf("\n%d ^ %d = %d\n", a, b, c);
        System.out.println("Binary: ");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
//Compliment ~
        c = ~a;
        System.out.printf("\n~%d = %d\n", a, c);
        System.out.println("Binary: ");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
// left shift
        c = a << 1;
        System.out.printf("\n%d << 1 = %d\n", a, c);
        System.out.println("Binary: ");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
// right shift
        c = a >> 1;
        System.out.printf("\n%d >> 1 = %d\n", a, c);
        System.out.println("Binary: ");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
//zero fill right shift
        c = a >>> 1;
        System.out.printf("\n%d >>> 1 = %d\n", a, c);
        System.out.println("Binary: ");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n Assignment operators");

        c = 13;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

//c %= 0; --> Arithmetical Exception
// c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        c = 7;
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n Relational Operators");

// greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
// greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
// less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
// less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
// equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
// not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n Logical Operators");

// logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));

// bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

// logical OR
        System.out.printf("(%d >= %d) || (%d == 0) --> %b\n", a, b, b,
                (a >= b) || (b == 0));

// bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

// logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

// logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***Condition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\n***Type Cast Operator:");

        int i = 123;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = i;
        System.out.printf("int = byte: c = %d --> c = %d\n", i, c);
        c = (int) sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = (int) ch;
        System.out.printf("int = char: c = %c --> c = %d\n", ch, c);
        c = (int) l;
        System.out.printf("int = long: c = %d --> c = %d\n", l, c);
        c = (int) f;
        System.out.printf("int = float: c = %f --> c = %d\n", f, c);
        c = (int) d;
        System.out.printf("int = double: c = %f --> c = %d\n", d, c);
        // c = bool;
        System.out.printf("int = boolean: c = %b --> Compile Error\n", bool);
    }

    public static void testLong() {
        long a = 31548916521L;
        long b = 164651132165L;
        long c;
        System.out.println("\n Arithmetical Operators");
//addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
// substraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
// multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
//modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        /* ArithmeticException
     c = a / 0;
     c = a % 0;
         */
//unary minus
        a = 10;
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        //prefix increment
        a = 10;
        System.out.printf("++%d = %d\n", a, ++a);

//postfix increment
        a = 10;

        System.out.printf("%d++ = %d\n", a, a++);

//prefix decrement
        a = 10;
        System.out.printf("--%d = %d\n", a, --a);
//postfix decrement
        a = 10;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n Bitwise Operators");
        a = 8;

        c = a & b; // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

        c = a | b; // bitwise OR
        System.out.printf("\n%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

        c = a ^ b; // bitwise XOR
        System.out.printf("\n%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

        c = ~a; // bitwise unary compliment
        System.out.printf("\n~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        c = a << 1; // left shift
        System.out.printf("\n%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        c = a >> 1; // right shift
        System.out.printf("\n%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        a = -8;
        c = a >> 1; // right shift
        System.out.printf("\n%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        a = 8;
        c = a >>> 1; // zero fill right shift
        System.out.printf("\n%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        a = -8;
        c = a >>> 1; // zero fill right shift
        System.out.printf("\n%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        //ASSIGNMENT OPERATORS
        System.out.println("\n***** Assignment operators *****");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        c = 7;
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        //RELATIONAL OPERATORS
        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));

        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc operators *****");
        //MISC OPERATORS

        System.out.println("\n***Condition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\n***Type Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        int i = 123;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);
        c = i;
        System.out.printf("long = long: c = %d --> c = %d\n", i, c);
        c = (long) f;
        System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
        c = (long) d;
        System.out.printf("long = double: c = (long)%f --> c = %d\n", d, c);
        // c = (long)bool;
//System.out.printf("long = boolean: c = (long)%b --> Compile Error\n", bool);
    }

    public static void testChar() {
        char a = 9, b = 6, c;

        System.out.println("\n Arithmetical operators");

//addition
        c = (char) (a + b);
        System.out.printf("%c + %c = %c\n", a, b, c);
//substraction
        c = (char) (a - b);
        System.out.printf("%c - %c = %c\n", a, b, c);
//multiplicator
        c = (char) (a * b);
        System.out.printf("%c * %c = %c\n", a, b, c);
//division
        c = (char) (a / b);
        System.out.printf("%c / %c = %c\n", a, b, c);
//modulus
        c = (char) (a % b);
        System.out.printf("%c %% %c = %c\n", a, b, c);
        // c = (char)(a / 0); --> Arithmetical Exception
        // c = (char)(a & 0); --> Arithmetical Exception

        //unary minus
        c = (char) -a;
        System.out.printf("-%c = %c\n", a, c);
        //unary plus
        c = (char) +a;
        System.out.printf("+%c = %c\n", a, c);
        //prefix increment
        System.out.printf("++%c = %c\n", a, ++a);

        a = 9;
        //postfix increment
        System.out.printf("%c++ = %c\n", a, a++);

        a = 9;
        //prefix decrement
        System.out.printf("--%c = %c\n", a, --a);

        a = 9;
        //postfix decrement
        System.out.printf("%c-- = %c\n", a, a--);

        System.out.println("\n Bitwise operators ");
        a = 9;

        // bitwise AND &
        c = (char) (a & b);

        System.out.printf("%c & %c = %c\n", a, b, c);
        System.out.println("Binary: ");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
// bitwise OR |
        c = (char) (a | b);
        System.out.printf("\n%c | %c = %c\n", a, b, c);
        System.out.println("Binary: ");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
// bitwise XOR ^
        c = (char) (a ^ b);
        System.out.printf("\n%c ^ %c = %c\n", a, b, c);
        System.out.println("Binary: ");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

// bitwise unary compliment
        c = (char) ~a;
        System.out.printf("\n~%c = %c\n", a, c);
        System.out.println("Binary: ");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

// left shift
        c = (char) (a << 1);
        System.out.printf("\n%c << 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        // right shift
        a = (char) -9;
        c = (char) (a >> 1);
        System.out.printf("\n%c >> 1 = %c\n", a, c);
        System.out.println("Binary: ");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        // zero full right shift
        a = (char) -9;
        c = (char) (a >>> 1);
        System.out.printf("\n%c >>> 1 = %c\n", a, c);
        System.out.println("Binary: ");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        //    System.out.println("Compile error!");

        System.out.println("\n***** Assignment operators *****");

        c = 7;
        System.out.printf("%c += %c --> c = %c\n", c, a, c += a);
        System.out.printf("%c -= %c --> c = %c\n", c, a, c -= a);
        System.out.printf("%c *= %c --> c = %c\n", c, a, c *= a);
        System.out.printf("%c /= %c --> c = %c\n", c, a, c /= a);
        System.out.printf("%c %%= %c --> c = %c\n", c, a, c %= a);

        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%c |= %c --> c = %c\n", c, a, c |= a);
        System.out.printf("%c &= %c --> c = %c\n", c, a, c &= a);
        System.out.printf("%c ^= %c --> c = %c\n", c, a, c ^= a);
        c = 7;
        System.out.printf("%c >>= 1 --> c = %c\n", c, c >>= 1);
        System.out.printf("%c <<= 1 --> c = %c\n", c, c <<= 1);
        System.out.printf("%c >>>= 1 --> c = %c\n", c, c >>>= 1);

        //RELATIONAL OPERATORS
        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%c > %c --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%c >= %c --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%c < %c --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%c <= %c --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%c == %c --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%c != %c --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));

        // bitwise logical AND
        System.out.printf("(%c > %c) & (%c > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%c >= %c) || (%c != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%c >= %c) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***Condition Operator:");

        System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\n***Type Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char i = 123;
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = (char) bt;
        System.out.printf("char = byte: c =(char) %c --> c = %c\n", bt, c);
        c = (char) sh;
        System.out.printf("char = short: c = (char)%d --> c = %c\n", sh, c);
        c = i;
        System.out.printf("char = int: c = (char)%c --> c = %c\n", i, c);
        c = (char) l;
        System.out.printf("char = long: c = (char)%d --> c = %c\n", l, c);
        c = (char) f;
        System.out.printf("char = float: c = (char)%f --> c = %c\n", f, c);
        c = (char) d;
        System.out.printf("char = double: c = (char)%f --> c = %c\n", d, c);
// c = (int)bool;
    }

    //Floating types
    public static void testFloat() {
        float a = 5.6f;
        float b = 7.8f;
        float c;

        //ARITHMETICAL
        System.out.println("\n***** Arithmetical operators *****");

        //addition
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);

        //substraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);

        //multiplicator
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);

        //division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);

        //modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);

        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception
        //unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);

        //unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);

        //prefix increment
        System.out.printf("++%f = %f\n", a, ++a);

        a = 8.9f;
        //postfix increment
        System.out.printf("%f++ = %f\n", a, a++);

        a = 8.9f;
        //prefix decrement
        System.out.printf("--%f = %f\n", a, --a);

        a = 8.9f;
        //postfix decrement
        System.out.printf("%f-- = %f\n", a, a--);

        //ASSIGNMENT OPERATORS
        System.out.println("\n***** Assignment operators *****");

        c = 7.6f;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);

        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        //RELATIONAL OPERATORS
        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));

        // bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc operators *****");
        //MISC OPERATORS

        System.out.println("\n***Condition Operator:");

        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\n***Type Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        int i = 123;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("float = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c);
        c = (float) l;
        System.out.printf("float = long: c = (float)%d --> c = %f\n", l, c);
        c = (float) i;
        System.out.printf("float = int: c = (float)%d --> c = %f\n", i, c);
        c = (float) d;
        System.out.printf("float = double: c = (float)%f --> c = %f\n", d, c);
        // c = (int)bool;
//System.out.printf("float = boolean: c = (float)%b --> Compile Error\n", bool);
    }

    public static void testDouble() {
        double a = 5.6f;
        double b = 7.8f;
        double c;

        //ARITHMETICAL
        System.out.println("\n***** Arithmetical operators *****");

        //addition
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);

        //substraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);

        //multiplicator
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);

        //division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);

        //modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);

        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception
        //unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);

        //unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);

        //prefix increment
        System.out.printf("++%f = %f\n", a, ++a);

        a = 8.9f;
        //postfix increment
        System.out.printf("%f++ = %f\n", a, a++);

        a = 8.9f;
        //prefix decrement
        System.out.printf("--%f = %f\n", a, --a);

        a = 8.9f;
        //postfix decrement
        System.out.printf("%f-- = %f\n", a, a--);

        //ASSIGNMENT OPERATORS
        System.out.println("\n***** Assignment operators *****");

        c = 7.6f;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);

        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        //RELATIONAL OPERATORS
        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));

        // bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc operators *****");
        //MISC OPERATORS

        System.out.println("\n***Condition Operator:");

        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\n***Type Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        int i = 123;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("float = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c);
        c = (float) l;
        System.out.printf("float = long: c = (float)%d --> c = %f\n", l, c);
        c = (float) i;
        System.out.printf("float = int: c = (float)%d --> c = %f\n", i, c);
        c = (float) d;
        System.out.printf("float = double: c = (float)%f --> c = %f\n", d, c);
        // c = (int)bool;
//System.out.printf("float = boolean: c = (float)%b --> Compile Error\n", bool);
    }

    // Logical types
    public static void testBoolean() {
        boolean a = true, b = false, c;
            System.out.println("\n***** Arithmetical Operators *****");
// c = a + b; // addition
// c = a - b; // subtraction
// c = a * b; // multiplication
// c = a / b; // division
// c = a % b; // modulus
// c = -a; // unary minus
// c = +a; // unary plus
// c = ++a; // prefix increment
// c = a++; // postfix increment
// c = --a; // prefix decrement
// c = a--; // postfix decrement
            System.out.println("\n***** Bitwise Operators *****");
            c = a & b; // bitwise AND
            System.out.printf("%b & %b = %b\n", a, b, c);
            c = a | b; // bitwise OR
            System.out.printf("%b | %b = %b\n", a, b, c);
            c = a ^ b; // bitwise XOR
            System.out.printf("%b ^ %b = %b\n", a, b, c);
// c = ~a; // bitwise unary compliment
// c = a << 1; // left shift
// c = a >> 1; //right shift
// c = a >>> 1; // zero fill right shift
            System.out.println("\n***** Assignment Operators *****");
            System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
            System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
            System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);
// c += a;
// c -= a;
// c *= a;
// c /= a;
// c %= a;
// c >>= 1;
// c <<= 1;
// c >>>= 1;
            System.out.println("\n***** Relational Operators *****");
// equal to
            System.out.printf("%b == %b --> %b\n", a, b, a == b);
// not equal to
            System.out.printf("%b != %b --> %b\n", a, b, a != b);
// c = a > b; // greater than
// c = a >= b; // greater than or equal to
// c = a < b; // less than
// c = a <= b; // less than or equal to
            System.out.println("\n***** Logical Operations *****");
            c = a && b; // logical AND
            System.out.printf("%b && %b = %b\n", a, b, c);
//            c = a || b; // logical OR
//            System.out.printf("%b || %b = %d\n", a, b, c);
//            c = a ^ b; // logical XOR
//            System.out.printf("%b ^ %b = %b\n", a, b, c);
    // logical NOT
            System.out.printf("!%b --> %b\n", a, !a);
            System.out.println("\n***** Misc Operators *****");
            System.out.println("\nCondition Operator:");
            System.out.printf(" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
            System.out.println("\nType Cast Operator:");

    // byte bt = 1;
    // short sh = -32000;
    // char ch = '\u0002';
    // long l = 100000000000000000L;
    // float f = 1.9f;
    // double d = 123456789.625;
            boolean bool = true;
    //c = (boolean) bt;
    //c = (boolean) sh;
    //c = (boolean) ch;
    //c = (boolean) l;
    //c = (boolean) f;
    //c = (boolean) d;
            c = bool;
        }
        
    public static void testStringStudent(String a) {
        String b = "hgkc", c = "";
        System.out.println("\n*****String Test Student*****\n");
        System.out.println("\n***** Arithmetical Operators *****");

        System.out.printf("%s + %s = %s\n", a, b, c = a + b);

        System.out.println("\n***** Assignment Operators *****");
        c = "xfxh";
        System.out.printf("%s += %s --> c = %s\n", c, a, c += a);
        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%s == %s --> %b\n", a, b, a == b);
        System.out.printf("%s != %s --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = String.valueOf(bt);
        System.out.printf("String = byte: c = %s --> c = %s\n", bt, c);
        c = String.valueOf(sh);
        System.out.printf("String = short: c = %d --> c = %s\n", sh, c);
        c = String.valueOf(ch);
        System.out.printf("String = char: c = '%c' --> c = %s\n", ch, c);
        c = String.valueOf(l);
        System.out.printf("String = long: c = (String)%s --> c = %s\n", l, c);
        c = String.valueOf(f);
        System.out.printf("String = float: c = (String)%f --> c = %s\n", f, c);
        c = String.valueOf(d);
        System.out.printf("String = double: c = (String)%f --> c = %s\n", d, c);
//      System.out.printf("String = boolean: c = (String)%b --> Compile Error\n", bool);
    }
}
