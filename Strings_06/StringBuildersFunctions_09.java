package Strings_06;

public class StringBuildersFunctions_09 {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // StringBuilder sb = new StringBuilder("Gayatri");
        // StringBuilder c = new StringBuilder("Vidya");
        // String b = "Shravani";
        // System.out.println(sb.charAt(1));
        // System.out.println(sb.indexOf("t"));
        // System.out.println(sb.compareTo(c));
        // System.out.println(sb.append(b));
        // System.out.println(sb.reverse());


        // // taking keyboard input for StringBuilder

        // StringBuilder s = new StringBuilder(sc.nextLine());

        // // we can make changes in the string using StringBuilder

        // StringBuilder str = new StringBuilder("gayatri");
        // str.setCharAt(0, 'G');
        // System.out.println(str + " ");

        // // to detelte character using deleteCharAt() and delete()
        // StringBuilder s = new StringBuilder("ABCDEFGHIJK");
        // s.deleteCharAt(3); // here D will be deleted 
        // System.out.println(s);

        // s.delete(0, 3); // it will delete ABC
        // System.out.println(s);

            // to insert character using insert()
        StringBuilder s = new StringBuilder("ABCDEFGHIJK");
        s.insert(3, 'Z'); // ABCZDEFGHIJK
        System.out.println(s);






    }
}
