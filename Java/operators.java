//Operators: Symbols that tell compiler to perform some operation.
//Arithmetic operators: 1. Binary operators(They perform operation between two operands):+, -, *, /, %
//                      2. Unary operators(They perform operation for single operand):++, --
public class operators {
    public static void main(String args[]){
        //pre-increment => first value update then value assign
        int a=10;
        int b=0;
        b=++a;
        System.out.println(a);
        System.out.println(b);
        //post-increment => first value assign then value update 
        b=a++;
        System.out.println(a);
        System.out.println(b);
        //pre-decrement => first value update then value assign
        b=--a;
        System.out.println(a);
        System.out.println(b);
        //post-decrement => first value assign then value update 
        b=a--;
        System.out.println(a);
        System.out.println(b);
    }
}

//Relational operators: ==, !=, >, <, >=, <=
//Logical operators: &&(AND), ||(OR), !(NOT)
//Assignment operators: =, +=, -=, *=, /=
//Bitwise operators: &(Binary AND) (if A=0101, B=0110 then A&B=0100), |(Binary OR) (A|B=0111), ^(Binary XOR)(A^B=0011)(since,01 and 10 will return 1 and 00 and 11 will return 0), ~(Binary One's Complement)(~A=1010, ~B=1001)(0->1 and 1->0), <<(Binary Left Shift)(syntax: number operator no of position to be shifted)(A<<1=1010 and B<<1=1100), >>(Binary Right Shift)(A>>1=0010 and B>>1=0011)
