package Strings;

public class CharacterPresent {


        public void charpresent(String str)
        {


            int count =0;
            // char arr[] = str.toCharArray();

            for (int i=0;i<str.length();i++)
                if('o'==str.charAt(i))
                    count++;

            if(count>0)
            {
                System.out.println("Character is present");
            }
            else
            {
                System.out.println("Character is not present");
            }

        }

        public static void main(String[] args) {


            CharacterPresent obj= new CharacterPresent();
            obj.charpresent("hello");
        }

    }

