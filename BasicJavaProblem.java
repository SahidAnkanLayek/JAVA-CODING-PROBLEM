import java.util.Scanner;



public class BasicJavaProblem {
  public static void main(String[] args) {
   // Scanner sc = new Scanner(System.in);
   // System.out.println("enter a number:");
   // int number = sc.nextInt();


    // System.out.println("enter the power of the given number:");
    // int power=sc.nextInt();

    // System.out.println("ENTER THE STARTING VALUE:");
    // int starting_value=sc.nextInt();
    // System.out.println("ENTER THE ENDING VALUE");
    // int ending_value=sc.nextInt();

    // //ReverseNumber(number);

    // FibonacciSeriseuptogivenNumber(number);
    // NtermFibonacciSerise (number);

    // PalindromCheck(number);
    // System.out.println();

    // FactorialofNumber(number);
   // System.out.println();

    // boolean result=primecheck(number);
    // if (result==true)
   //   {
    //    System.out.println("this is a prime number");
    //  }
    // else
    // {
    // System.out.println("this is not a prime number");
    // }
    // System.out.println();

    // PrimecheckwithRange(starting_value,ending_value);
    // System.out.println();
    // PrimeNumberCountwithRange(starting_value,ending_value);
    // System.out.println();
   // System.out.println("the sum of natural number"+NaturalNumberornot(number));

    // NaturalNumberwithRange(starting_value,ending_value);
    // System.out.println();
    // LengthChecking(number);
    // System.out.println();
    // ArmstrongNumberOrNot(number);
    // System.out.println();
    //System.out.println(SumOfDigit(number));

    // PowerOfNumber(number,power);
    

      //              Bubble Short

    // String [] str={"ankan","boni","sahid","layek","arju","bims","dewandighi"};
    //     String[] shortedElement=bubbleShort(str);

    //     for(String element: shortedElement){
    //             System.out.println("The Shorted String is "+element);
    //     }


// largest ==== smallest element find in array
    // int [] i={10,40,50,70,5};

    // int largest_element =findLargest(i);
    // System.out.println( " The largest element of the given array is "+ largest_element);

    // int smallest_element=findSmallest(i);
    // System.out.println( " The smallest element of the given array is "+ smallest_element);



//Revesre String 
     // String str1="Sahid";
     // String reverse=reverseString(str1);
    // System.out.println("the originlal string is:"+str1);
    // System.out.println("the reverse string is:"+reverse);


// Decimal to binary convertor
      // String actualBinarynumber=decimaltoBinary(10);
      // System.out.println("the binary of 100 is : "+actualBinarynumber);




// For Rotation 

// int[] arr ={10,20,30,40,50};
//         int rotationCount;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("how many times you want to rotated the array?");
//         rotationCount=sc.nextInt();
        
//         System.out.println("BEFORE THE ROTATION:======>");
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]+" ");
//         }
    
//         Rotation(arr,rotationCount);
//     System.out.println("AFTER ROTATION:=============>");
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]+" ");
//         }

// for binary search 

// int []arr={100,200,750,890,2003,5060,50002};
//       int result=binarysearch(arr,2003);
//       if(result==-1){
//         System.out.println("the element is not foundin the given array");
//       }
//       else{
//         System.out.println("the element is found at "+ binarysearch(arr,2003) + " index");
//       }
//     }

//        checking leap year

//System.out.println("check a year is leap year or not");
        // // System.out.println("enter the year");
        // int year=sc.nextInt();
        // System.out.println(isLeapyear(int year));


//            for reversed an array
// int []array={10,50,60,140,56,98,125,20};
// int [] reverseArray=revArray(array);
// 	for(int element:reverseArray)
// 	{
// 		System.out.println("The Reversed array is :"+ reverseArray);
// 	}

//       right rotation 




//     remove duplicate from an array

// int[]arr={2,2,3,3,4,6,6};//must be the sorted array here.
// for(int i=0;i<arr.length;i++){ 
//     System.out.println(arr[i]+"\t");
// }
// int[] result=removeDuplicate(arr);
// System.out.println();
// for(int i=0;i<result.length;i++){  
//     System.out.println(result[i]+"\t");
// }







  }

//            {  END  OF MAIN FUNCTION }


// //logic to calculate reverse of a given number :--

 public  static void reverseNumber(int number){
    int sum=0;
    while(number!=0){
      int rem=number%10;
      sum=sum*10+rem;
      number=number/10;
    }
    System.out.println("THE REVERSE OF THE GIVEN NUMBER IS :"+sum);
  }

  // //logic to calculate whether a given number is palindrom or not :--

   public static void palindromCheck(int number){
      int sum=0;
      int org=number;
      while(number!=0){
      int rem=number%10;
       sum=sum*10+rem;
      number=number/10;
      
      }
      if(sum == org){
        System.out.println("THE given number is palindrom number");
      }
      else{
        System.out.println("the number is not a palindrom number");
     }
    }

    //logic to calculate factorial of a given number :--

  public static void factorialofNumber(int number){
    int fac=1;
    for(int i=1;i<=number;i++){
        fac*=i;
    }
    System.out.println("THE FACTORIAL OF THE GIVEN NUMBER IS :"+fac);

  }
  



//logic to calculate whether a given number is prime or not :--


  public static boolean primecheck(int number) {

    boolean b = true;
    for (int i = 2; i<number; i++) {

      if (number % i == 0) {
        return false;
      }

    }
    return b;
  }

//logic to calculate whether a given number is prime in a given range:--


  public static void PrimecheckwithRange(int starting_value,int ending_value){
    for(int i=starting_value;i<=ending_value;i++){
        if(primecheck(i)==true){
            System.out.println(i+ "\t");
        }

    }
  }
//logic to count how many number is prime in a given range:--

  public static void PrimeNumberCountwithRange(int starting_value,int ending_value){
      int count=0;
      for( int i=starting_value;i<=ending_value;i++){
            if(primecheck(i)==true)
              count++;
      }
      System.out.println("TOTAL NUMBER OF THE PRIME NUMBER IS:"+count);
  }

//logic to calculate sum of natural number:--

  public static int sumOfNaturalNumber(int number) {
    int sum = 0;
    for (int i = 1; i <= number; i++) {
      sum = sum + i;
    }
    return sum;
  }


  
 // logic to calculate how many natural number is present in a given range:-
  public  static void NaturalNumberwithRange(int starting_value,int ending_value){
   int sum=ending_value*(ending_value+1)/2 - starting_value*(starting_value+1)/2 + starting_value;
   System.out.println("the sum of the given n natural number is"+sum);
   }

//logic to calculate whether a given number is Armstrong or not :--
  public static void armstrongNumberOrNot(int number){
    int sum=0;
    int orginal=number;
    while(number!=0){
      sum=sum+(number%10) * (number%10) * (number%10);
      number=number/10;
    }
    if(sum==orginal){
      System.out.println("Armstrong Number");
    }
    else{
      System.out.println("Not Armstrong Number");
    }

  }

  ///logic to calculate sum of digit of a  number:--
  public static int SumOfDigit(int number) {
    int sum = 0;
    while (number != 0) {
      int rem = number % 10;
      if(rem%2!=0){
        sum = sum + rem;
      }
      number = number / 10;
    }
    return sum;
  }


//logic to find out the Nth term fibonacci serise :--
  public static void NtermFibonacciSerise(int number){
    int a=0,b=1,result=0,count=0;
    while(count<=number){
        a=b;
        b=result;
        result=a+b;
        count++;
    }
  System.out.println(result);

  }


//logic to print Fibonacci Serise upto a given Number :-- 
public static void fibonacciSeriseuptogivenNumber (int number){
      int a=0,b=1,result=0;
      while(result<=number){
        System.out.println(result+ " ");
        a=b;
        b=result;
        result=a+b;

      }
  }


//logic to calculate power of a given number :--
 public static void PowerOfNumber(int number,int power){
      int result=1;
      for(int i=1;i<=power;i++){
         result=result*number;
      }
      System.out.println("THE POWER OF THE GIVEN NUMBER IS :"+" "+result);
   }
   

//logic to calculate frequency of a string :--
 public static int frequencyofString(String s,char c){
    int count=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==c)
        count++;
    }
    return count;

  }

     //logic to find largest element of an array???
      public static int findLargest(int...arr){
        int large=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
            
        }
     
      return large;
    }
    //logic to find smallest element of an array????
    public static int findSmallest(int...x){
        int small=x[0];
        for(int i=0;i<x.length;i++){
            if(x[i]<small){
                small=x[0];
            }
        }
        return small;
       
    }

//Shorted a given string in ascending order using Bubble short:--
public static String[] bubbleShort(String [] str){
                int n =str.length;
                for(int i=0;i<n-1;i++){
                    for(int j=0;j<n-i-1;j++){
                        if(str[j].compareTo(str[j+1])>0){
                            String temp=str[j];
                            str[j]=str[j+1];
                            str[j+1]=temp;
                            
                        }
                    }
                }
                
                return str;
            }

//Reverse a String 
            public static String reverseString(String str){
              if(str==null||str.isEmpty()){
                  return null;
              }
              StringBuilder sb=new StringBuilder();
              for(int i=str.length()-1;i>=0;i--){
                  sb.append(str.charAt(i));
              }
              return sb.toString();
      
          }


//Decimal to binary convertor :--

          public static String reverseBinary(String str) {
            String reversed = "";
            int length = str.length();
            for (int i = length - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }
            return reversed;
        }
        
            public static String decimaltoBinary(int decimal){
                String binary=" ";
                while(decimal!=0){
                    int rem=decimal % 2;
                    binary=binary+rem;
                    decimal=decimal/2;
                }
                return reverseBinary(binary);
        
            }


// Left_rotation of an array 


          //   public static void rotationOneTime(int[]arr){//one time rotation 
          //     int temp=arr[0];//store the MSB into an temporary variable
          //     for(int i=1;i<arr.length;i++){//after MSB means second index of array that is i=1;
          //         arr[i-1]=arr[i];// shift all the element by 1 positon in left direction
          //     }
          //        arr[arr.length-1]=temp;//collected MSB stored into the last index of array
      
          // }
      
          public static void Rotation(int[]arr,int rotationCount){//rotationCount denotes the
              //how many time the array should rotated.
              for(int i=0;i<rotationCount;i++){
                  // rotationCount= rotationCount%arr.length;//first observation
                  // if(rotationCount<0){//second observation 
                  //     rotationCount= rotationCount+arr.length;
                  // }
                  rotationOneTime(arr);//calling this function upto rotationCount time
              }
          }


// Binary search 

          public static int binarysearch(int []arr,int searchingElement){
            int first=0;
            int last=arr.length-1;
            int mid=(first+last)/2;
            while(first<=last){
              if(arr[mid]==searchingElement){
                return mid;
              }
              else if(searchingElement<arr[mid]){
                last=mid-1;
              }
              else{
                 first=mid+1;
              }
              mid=(first+last)/2;
      
            }
           
            return -1;
          }
      
// checking a tear is leap year or not 

public static boolean isLeapyear(int year){

      return ((year %4==0 && year %100!=0)||year %400==0)?true:false;
}



//Reverse an array:--


public static int[] revArray(int[] arr){

  int firstIndex=arr[0];
  int lastIndex=arr.length-1;
  while(firstIndex<lastIndex){
    int temp=arr[firstIndex];
    arr[firstIndex]=arr[lastIndex];
    temp=arr[lastIndex];
    firstIndex++;
    lastIndex--;
  }
return arr;
}


//            Right rotation of an array

public static void rotationOneTime(int[] arr){
  int temp=arr[arr.length-1];
   for(int i=arr.length-2;i>=0;i--){
       arr[i+1]=arr[i];
   }
    arr[0]=temp;

}

public static void rotation(int[] arr,int countRotation){
   countRotation=(countRotation%arr.length);
   if(countRotation<0){
       countRotation=(countRotation+arr.length);
   }
   for(int i=0;i<countRotation;i++){
       rotationOneTime(arr);
   }
}
public static void rotated1(int[] arr,int count){
   for(int i=0;i<count;i++){
       int temp=arr[arr.length-1];
       for(int j=arr.length-2;j>=0;j--){
           arr[j+1]=arr[j];
       }
        arr[0]=temp;

   }
}


//Remove duplicate from an Array


public static int[] removeDuplicate(int[]arr){
  int uniqueCount=1;//pointed to the second location of the array
  for(int i=1;i<arr.length;i++){//rd is pointing to first index so i start from 1-->length
      if(arr[i]!=arr[uniqueCount-1]){
          arr[uniqueCount]=arr[i];
          uniqueCount++;
      }
  }
  
  int[] result=new int[uniqueCount];
  for(int i=0;i<uniqueCount;i++){
      result[i]=arr[i];
  } 
  return result;
}











}
 