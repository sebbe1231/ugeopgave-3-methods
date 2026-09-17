public class Opgave5 {
    /* Hvis du kører programmet får du en række fejl.
     * Fix programmet så det kan køre
     * outputtet bliver:
     * "7 is the smallest!"
     *
     *  OBS! Skriv hvad du har gjort som kommentar ud for hver linje du fixer
     */


    void main() {

        int a = 7, b = 42;

        int smaller = minimum(a,b);

        System.out.println("Number " + smaller + " is the smallest"); // changed it to simply print the number

    }

    int minimum(int a, int b) { // changed return type from void to int

        int smaller = 0; // Declared and initialized smaller as an int before if statement

        if (a < b) { // Can be changed with a Math.min() call, but i diceded to keep it as close to the original as possible
            smaller = a;
        }
        else { //Changed it to just be an else statement with no argument
            smaller = b;
        }

        return smaller; // removed "int"

    }
}
