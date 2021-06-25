class ExampleControls {
    public static void main(String args[]) {
        if (10 < 11) System.out.println("10 is less than 11");

        // operators
        // < <= > >= == !=

        int a, b, c;

        a = 2;
        b = 3;

        if(a < b) System.out.println("a is less than b");

        c = a - b; //c contains -1

        System.out.println("c contains -1");
        if(c < 0) System.out.println("c is negative");

        int count;

        for(count = 0; count < 5; count++)
            System.out.println("This is count: " + count);

        // blocks of code

        double i, j, d;

        i = 5;
        j = 10;

        // note that the 'end of line' is the ; ie statements can safely
        // go over multiple lines
        if(i !=0) {
            System.out.println("i does not equal zero " +
                            "so it's safe to divide");
            d = j / i;
            System.out.println("j/i is " + d);
        }

        System.out.println();

        //gallons to litres conversion
        double gallons, litres;
        int counter;

        counter = 0;
        for(gallons = 1; gallons <= 100; gallons++) {
            litres = gallons * 3.7854; // convert to litres
            System.out.println(gallons + " gallons is " +
                    litres + " litres");
            counter++;
            //every 10th line print a blank line
            if (counter == 10) {
                System.out.println();
                counter = 0; // reset the counter
            }
        }
    }
}
