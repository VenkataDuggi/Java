package Imp_programs;

public class ConvertStringtoiInteger {




    public static void convert(String s)
    {
        int num =0;
        int n = s.length();
        for(int i = 0; i < n; i++)

            // Subtract 48 from the current digit
            num = num * 10 + ((int)s.charAt(i) - 48);

        // Print the answer
        System.out.print(num);


    }

    public static void main(String[] args) {

        String s = "1231";
        convert(s);
    }
}
