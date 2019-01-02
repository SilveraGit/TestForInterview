public class MainStringTest {

    public static void main(String[] args) {

    //printStringInColumn("Hello");

    //printWordsInColumn("Hello Course QA-1 Haifa", " ");
        // printStrReverse("Hello");
        System.out.println(isReversed("Hello", "olleH"));
    }

    public static boolean isReversed(String str, String rev){
        if(str == null || rev == null || str == "" || rev =="" || str.length() != rev.length()) return false;
        int i,j;
        for(i = 0, j = rev.length()-1; i < str.length(); i++, j--){
            if (str.charAt(i)!= rev.charAt(j)) return false;
        }
        return true;
    }
    public static void printStrReverse(String str){
        for (int i = str.length()-1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }

    }
    public static void printWordsInColumn(String str, String delim){
        String[] ar = str.split(delim);

        for (String s : ar){
            System.out.println(s);
        }

    }

    public static void printStringInColumn(String str)
    {
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }

}

