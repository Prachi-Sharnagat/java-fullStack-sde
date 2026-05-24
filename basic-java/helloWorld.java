class helloWorld {
    
    public static void main(String a[]){
        float marks = 9.3f; 
        double mar1 = 5.8;
        int num = 3;
        // byte by = 129; //  rnage is -128 to 127
        short sh = 554;
        int b = 0b101;
        System.out.println(b);
        long l = 3929l;
        int i = 10_00_00_000;
        System.out.println(i);
        char c = 'a';
        c++; 
        System.out.println(c);


        boolean val = true;
        int num1 = 10;
        int num2 = 90;
        System.out.println(num1+num2);
        System.out.println(marks);
        double val1 = 12e10;
        System.out.println(val1);
        System.out.println(9+10);
        System.out.println("hello world");


// casting and coversiion : 
float f = 9.6f;
int con = (int)f;
System.out.println(con);
// modulus  operation : 
byte b1 = 127;
int a2 = b1;
System.out.println((a2));
int a1 =  257;
byte b2 = (byte)a1; // typecasting : a1%(totalRange byte = 256) gives 257%256
System.out.println(b2); //  ans : 1 

float f2 = 5.6f;
// int t = f2; //gives error 
int t =(int) f2;
System.out.println(t);

byte a3 = 20;
byte a4 = 10;
int result = a3*a4;
System.out.println(result);
 












    }

}
