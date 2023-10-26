// Write a java program to sort 10 Strings

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String[] arr = {"Banana", "Apple", "Grapes", "Coconut", "Pineapple", "JackFruit", "Mango", "WaterMelon"};

        // Arrays.sort(arr);

        // for(String element : arr){
        //     System.out.println(element);
        // }

        int num = 98;
        String ans = digitToWordConveter(num);
        
        if(ans == null) System.out.println("Given number is not between 1 to 99");
        else{
            System.out.println(ans);
        }


    }
    //digit to word conveter ;
    public static String digitToWordConveter(int num){
        
        String [] oneDigitWord={"one","two","three","four","five","six","seven","eight","nine"};
        String [] twoDigitWord={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String [] tensWord={"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
        if(num>=1&&num<=9){
            return oneDigitWord[num-1];
        }
        else if(num>=10&&num<=19){
            return twoDigitWord[num-10];

        }
        //num = 99                            
        else if(num>=20&&num<=99){

            int dosok = num/10; //9
            int ekok = num%10;  //9

            String res = "";
            //res += tensWord[dosok-2] + " " + oneDigitWord[ekok-1];
            if(ekok == 0){
                res += tensWord[dosok-2];
            }
            else{
                res += tensWord[dosok-2] + " " + oneDigitWord[ekok-1]; //Ninety Nine
            }
            return res;

        }

        return null;
        

    }
}
