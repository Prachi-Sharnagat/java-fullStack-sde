public class operation {
    public static void main(String a[]) {
        int num1 = 7;
        int num2 = 5;
        int result = num1 + num2;
        // System.out.println(result);

        // num1++; // post increment
        int res = num1++;
        System.out.println(res); // output 7 first fetch the value of num then inncreament its value to 8
        System.out.println(num1);
        ++num1; // pre increment
        System.out.println(num1);

        // relational operations
        // int x = 9;
        // int y = 10;
        double x = 8.8;
        double y = 9.8;
        System.out.println(!(x > y));
        // conditional statement :
        int a1 = 9;
        int b1 = 10;
        int c1 = 12;
        // if(a1>b1){
        // System.out.println(a1);
        // }
        // else{
        // System.out.println(b1);
        // }

        if (a1 > b1) {
            if (a1 > c1) {
                System.out.println(a1);
            } else {
                System.out.println(c1);
            }

        } else {
            if (b1 > c1) {
                System.out.print(b1);
            } else {
                System.out.println(c1);
            }
        }

        if (a1 > b1 && a1 > c1) {
            System.out.println(a1);
        } else if (b1 > c1) {
            System.out.print(b1);
        } else {
            System.out.println(c1);
        }

        // ternary operator :
        int result2 = 0;
        int n = 10;
        result = n % 2 == 0 ? 10 : 20;
        System.out.println(result);
        int num = 4;
        // swittch case statement
        switch (num) {
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thur");
                break;
            case 5:
                System.out.println("fri");
                break;
            default:
                System.out.println("enter valid number ");
        }

        // loop statement :
        num = 3;
        while (num > 0) {
            // System.out.println("3 times");
            System.out.println(num + " times");
            num--;
        }
        System.out.println(num + " times");

        do {
            System.out.println("at least" + num + "times");
            num++;
        } while (num <= 4);

        // for loop :
        for (int i = 1; i <= 7; i++) {
            System.out.println("Day " + i);
            for (int j = 0; j <= 9; j++) {
                if ((j + 9) > 12) {
                    System.out.println(" " + (j+9-12)+"-"+ (j+10-12));
                }
                else{
                    System.out.println(" " + (j + 9)+"-"+ (j+10));
                }
                
            }

        }

    }

}
