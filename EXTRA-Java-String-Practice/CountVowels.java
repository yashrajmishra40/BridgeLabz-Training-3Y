package ExtraString;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        for(int i = 0;i<str.length();i++){
            if("AEIOUaeiou".contains(String.valueOf(str.charAt(i)))){
                vowelCount+=1;
            }
            else{
                consonantCount+=1;
            }
        }
        System.out.println(vowelCount);
        System.out.println(consonantCount);
        sc.close();
        
    }
    
}
