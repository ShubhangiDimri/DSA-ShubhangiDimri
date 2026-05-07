
/*+-A company has launched a new text editor that allows users to enter English letters, 
numbers and whitespaces only. If a user attempts to enter any other type of character, it is 
counted as an error. 
Write an algorithm to help the developer detect the number of errors in a string of text 
given by a user. */

class Q1{
    public static void main(String[] args) {
        String str= "a2 22s@";
        int count=0;
        for(char ch :str.toCharArray()){
            // if( !(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0'&& ch<='9' || ch==' ')){
            //     count++;
            // }

            if(!Character.isLetterOrDigit(ch) && ch!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}

