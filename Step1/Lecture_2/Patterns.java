// Types:

// 1.  
//                 *****
//                 *****
//                 *****
//                 *****
//                 *****

//2.               *
//                 **
//                 ***  
//                 ****
//                 *****

//3.               1
//                 12       
//                 123
//                 1234 
//                 12345

public class Patterns {

    public static void type1(java.util.Scanner sc)
    {
       System.out.println("Enter number of rows and columns:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void type2(java.util.Scanner sc)
    {
        System.out.println("Enter number of rows:");
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            System.out.print("*");
            System.out.println();
        }
    }

    public static void type3(java.util.Scanner sc)
    {
       System.out.println("Enter number of rows:");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print(j);
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the type of pattern within range 1-22 ");
        int type = sc.nextInt();
        switch(type)
        {
            case 1:
                type1(sc);
                break;
            case 2:
                 type2(sc);
                 break;
             case 3:
                 type3(sc);
                 break;
            // case 4:
            //     type4(sc);
            //     break;
            // case 5:
            //     type5(sc);
            //     break;
            // case 6:
            //     type6(sc);
            //     break;          
            // case 7:
            //     type7(sc);
            //     break;
            // case 8:
            //     type8(sc);
            //     break;
            // case 9:
            //     type9(sc);
            //     break;
            // case 10:
            //     type10(sc);
            //     break;
            // case 11:
            //     type11(sc);
            //     break;
            // case 12:
            //     type12(sc);
            //     break;
            // case 13:
            //     type13(sc);
            //     break;
            // case 14:
            //     type14(sc);
            //     break;
            // case 15:
            //     type15(sc);
            //     break;
            // case 16:
            //     type16(sc);
            //     break;
            // case 17:
            //     type17(sc);
            //     break;
            // case 18:
            //     type18(sc);
            //     break;  
            // case 19:
            //     type19(sc);
            //     break;  
            // case 20:
            //     type20(sc);
            //     break;
            // case 21:
            //     type21(sc);
            //     break;
            // case 22:
            //     type22(sc);
            //     break;
            default:
                System.out.println("Invalid pattern type. Please enter a number between 1 and 22.");
        }
    }
}
