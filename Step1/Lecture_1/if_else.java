// Given marks of a student, print on the screen:

//     Grade A if marks >= 90
//     Grade B if marks >= 70
//     Grade C if marks >= 50
//     Grade D if marks >= 35
//     Fail, otherwise.


// For printing use:-

//     for C++ : cout << variable_name;
//     for Java : System.out.print();
//     for Python : print()
//     for Javascript : console.log()


// Examples:

// Input: marks = 95

// Output: Grade A

// Explanation: marks are greater than or equal to 90.

// Input: marks = 14

// Output: Fail

// Explanation: marks are less than 35.

public class if_else {
    
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner (System.in);
        int marks = sc.nextInt();
        System.out.print(marks>100?"Invalid Marks":
                        marks>=90?"Grade A":
                        marks>=70?"Grade B":
                        marks>=50?"Grade C":
                        marks>=35?"Grade D":
                        "Fail");
    }

}
