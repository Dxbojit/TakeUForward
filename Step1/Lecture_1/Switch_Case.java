// Given the integer day denoting the day number, print on the screen which day of the week it is. Week starts from Monday and for values greater than 7 or less than 1, print Invalid.

// Ensure only the 1st letter of the answer is capitalised.

// For printing use:-

//     for C++ : cout << variable_name;
//     for Java : System.out.print();
//     for Python : print()
//     for Javascript : console.log()

// Examples:

// Input: day = 3

// Output: Wednesday

// Input: day = 8

// Output: Invalid


public class Switch_Case{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:System.out.println("Invalid");
        }
    }
}
