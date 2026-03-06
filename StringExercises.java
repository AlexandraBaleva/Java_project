import java.util.Scanner;

public class StringExercises {
    public static void main(String[] args) {
           
    // exercise1();
    // exercise2();
    // exercise3();
    // exercise4();
    // exercise5();
    // exercise6();
    // exercise7();
    // exercise8();
    // exercise9();
    exercise10();
    
    }
    private static void exercise10() {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();

    int wordCount = str.split("\\s+").length;

    System.out.println(wordCount);
    scanner.close();
    }

    
    private static void exercise9() {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    String reversed = "";

    for (int i = str.length() - 1; i >= 0 ; i--) {
    reversed += str.charAt(i);
    }
    
    System.out.println(str.equalsIgnoreCase(reversed));
    scanner.close();

    }
    private static void exercise8() {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    String result = "";

    for (int i = str.length() - 1; i >= 0 ; i--) {
    result += str.charAt(i);
    }
    
    System.out.println(result);
    scanner.close();

    
    }
    private static void exercise7() {
    Scanner scanner = new Scanner(System.in);
    char charToSearch = 'a';
    String str = scanner.nextLine();
    int count = 0;

    for (int i = 0; i < str.length(); i++) {

    if (str.charAt(i) == charToSearch) {
    count += 1;

    }
    }
    System.out.println(count);
   
    scanner.close();

    }
    private static void exercise6() {
        
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    String result = str.charAt(0) + "" + str.charAt(str.length()-1);
    System.out.println(result);
        
    scanner.close();
    }
public static void exercise5() {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    str = str.strip();
    str.replaceAll(" ", "");
    System.out.println(str);
    scanner.close();
}
    public static void exercise4() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.replace('e', '3') .replace('o', '0').replace('i', '1');
        
       
        System.out.println(str);
        
        scanner.close();
    }
public static void exercise3() {

    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    try{
    int num = Integer.parseInt(str);
    } catch (NumberFormatException e) {
     System.out.println("Wrong input! Number expected.");
    }
    scanner.close();
    
}
    private static void exercise2() {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println(str1.toLowerCase().contains(str2.toLowerCase()));
        scanner.close();
    }

    private static void exercise1() {
        Scanner scanner = new Scanner (System.in);
        String str = scanner.nextLine();
        System.out.println("Duljina: " + str.length());
        System.out.println("S golemi bukvi: " + str.toUpperCase());
        System.out.println("S malki bukvi: " + str.toLowerCase());
        scanner.close();
    }

    
}
