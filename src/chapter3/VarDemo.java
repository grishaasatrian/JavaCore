package chapter3;

public class VarDemo {
    public static <var> void main(String[] args) {

        // Use type inference to determine the type of the
        // variable named avg. In this case, double is inferred.
        double avg = 10.0;
        {
            System.out.println("Value of avg: " + avg);

            // In the following context, var is not a predefined identifier.
            // It is simply user-defined variable name.
            int var = 1;
            {
                System.out.println("Value of avg: " + var);
            }
            // Interestingly, in the following sequence, var is used
            // as both the type of the declaration and as a variable name
            // in the initializer.
            int k = -var;
            {
                System.out.println("Value of k: " + k);
            }

        }
    }
}