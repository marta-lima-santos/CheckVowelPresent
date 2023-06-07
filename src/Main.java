public class Main {
    public static void main(String[] args) {
       //First create a string with boolean
        String vow = "Marta".toLowerCase();
        boolean HasVowel = false;

        //Declaring if has the character equal to the vowels
        for(int i = 0; i < vow.length(); i++){
            char charc = vow.charAt(i); //Remove every character from the string

            if(charc == 'a' || charc == 'e' || charc == 'i' || charc == 'o' || charc == 'u'){
                HasVowel = true;
                break;
            }
        }
        if(HasVowel){
            System.out.println("the vowel is present: " + vow.toString());
        }
        else{
            System.out.println("Has no vowel: " + vow.toString());
        }

    }
}