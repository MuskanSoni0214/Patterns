
import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row");
        int n=sc.nextInt();
//        rightAngleTriangle(n);
//        rectangle(n);
//        reverseRAT(n);
//        numRAT(n);
//        horizontalPyramid(n);
//        diamond(n);
//        hollowDiamond(n);
//        palindrome(n);
//        numPalindrome(n);
//        patternComplicated(n);
        patternComplicated2(n);
    }

    static void patternComplicated2(int n)
    {
        int originalN=n;
        n=2*n;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                int atEveryIndex =originalN-(Math.min(Math.min(i,j),Math.min(n-i,n-j)));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

    static void patternComplicated(int n)
    {
      n=2*n;
      for(int i=0;i<=n;i++)
      {
          for(int j=0;j<=n;j++)
          {
              int atEveryIndex = Math.min(Math.min(i,j),Math.min(n-i,n-j));
              System.out.print(atEveryIndex+" ");
          }
          System.out.println();
      }
    }
    static void rightAngleTriangle(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    static void hollowDiamond(int n)
//    {
//        for(int i=0;i<2*n;i++)
//        {
//            int col=i>n?2*n-i:i;
//            int spaces = n-col;
//            for(int s=0;s<spaces;s++)
//                System.out.print(" ");
//            for(int j=0;j<col;j++)
//            {
//                if(j==0 || j==col-1)
//                    System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

    static void numPalindrome(int n)
    {
        for(int i=1;i<=2*n;i++)
        {
            int c=i>n?2*n-i:i;
            for(int s=1;s<=n-c;s++)
                System.out.print(" ");
            for(int j=c;j>=1;j--)
                System.out.print(j);
            for(int j=2;j<=c;j++)
                System.out.print(j);
            System.out.println();
        }
    }
    static void palindrome(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int s=1;s<=n-i;s++)
                System.out.print(" ");
            for(int j=i;j>=1;j--)
                System.out.print(j);
            for(int j=2;j<=i;j++)
                System.out.print(j);
            System.out.println();
        }
    }
    static void diamond(int n)
    {
        for(int i=0;i<2*n;i++)
        {
            int col=i>n?2*n-i:i;
            int noOfSpaces=n-col;
            for(int s=0;s<noOfSpaces;s++)
                System.out.print(" ");
            for(int j=0;j<col;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void horizontalPyramid(int n)
    {
        for(int i=0;i<2*n;i++)
        {
            int col =i>n? 2*n-i:i;
            for(int j=0;j<col;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void numRAT(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void reverseRAT(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void rectangle(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
