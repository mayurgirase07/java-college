public class StringsMathdemo {
    public static void main(String[] args){
        String str1="great";
        String str2= "person  ";
        String str3=str1.concat("" +str2);
        System.out.println("Concatenation:-"+str3);
        System.out.println("Lenght of str1 :-"+str1.length());
        System.out.println("character at index 1 of str:-"+ str1.charAt(1));
        System.out.println("Substring of str(0-3):-" +str1.substring(1,3));
        System.out.println("Equals? str1 and str(0-3):-"+str1.equals(str2));
        System.out.println("Uppercase od str1:-"+str1.toUpperCase());

        double a= 3.0;
        double b=2.55;

        System.out.println("Square root of a :-"+Math.sqrt(a));
        System.out.println(" a raised to b :"+Math.pow(a,b));
        System.out.println("Max of a and b  :-"+Math.max(a,b));
        System.out.println(" Min of a and b : "+Math.min(a,b));
        System.out.println("Random number(0-1) :"+Math.random());
        System.out.println("Random number (10-20):"+( Math.random() * (20-10)));
        System.out.println("Random number (1-1000):"+( Math.random()* (1000-1)));
        System.out.println("Rounding of b :="+Math.round(b));
        System.out.println(" Ceil of b  :"+Math.ceil(b));
        System.out.println("Floor of b :"+Math.floor(b));
        


        



        


    }
}
