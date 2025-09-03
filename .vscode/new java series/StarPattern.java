public class StarPattern {
    public static void main(String[] args) {

        // Upper part of the pattern
        int n = 5;
        System.out.println("Upper part of the pattern:");
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the pattern
        System.out.println("Lower part of the pattern:");
        for(int i = 1; i<=4; i++)
        {
            for(int j=4; j>=i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Middle part of the pattern
        System.out.println("Middle part of the pattern:");
        for(int i = 1; i<=n; i++)
        {
            for(int j = 4; j>=i; j--)
            {
                System.out.print("  ");
            }
            for(int k = 1; k<=i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


        // Lower part of the pattern
        System.out.println("Lower part of the pattern:");
        for(int i = 1; i<=4; i++)
        {
            for(int j = 2; j<=i; j++)
            {
                System.out.print("  ");
            }
            for(int k = 4; k>=i; k--)
            {
                System.out.print("* ");
            }
             System.out.println();
        }

        // Right angled triangle pattern
        n = 5;
        System.out.println("Right angled triangle pattern:");
        for(int i = 1; i<=n; i++)
        {
            for(int j = 4; j>=i; j--)
            {
                System.out.print("  ");
            }
            for(int k = 1; k<=i; k++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }

        // Pyramid pattern
        System.out.println("Pyramid pattern:");
        for(int i = 1; i<=n; i++)
        {
            for(int j = 4; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++)
            {
                System.out.print("*");
            }
            for(int l = 2; l<=i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // Inverted Pyramid pattern second method
        System.out.println("Inverted Pyramid pattern second method:");
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k<=n-i+1; k++)
            {
                System.out.print("*");
            }
            for(int l = 2; l<=n-i+1; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // Right angled triangle pattern
        for(int i = 1; i<=n; i++)
        {
            for(int j = 4; j>=i; j--)
            {
                System.out.print(" ");
            }
            for( int k = 1; k<=(i*2-1); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
