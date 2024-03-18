package Strings;

public class DuplicateAlphabetsinString {


        public static void main(String[] args) {


            String str= "Hi How are you";

            for (int i = 0; i < str.length();i++)
            {
                for(int j=i+1;j<str.length();j++)
                {
                    if(str.charAt(i)==str.charAt(j)&&str.charAt(i)!=' ')
                    {
                        System.out.println("Duplicate Alphabets are "+str.charAt(j));
                    }
                }
            }
        }
    }

