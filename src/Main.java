import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("\nMenu:");
            System.out.println("1. ENTER THE Q1 ");
            System.out.println("2. EXIT THE Q2 ");
            System.out.println("3. EXIT THE Q3 ");
            System.out.println("4. EXIT THE Q4 ");
            System.out.println("5. EXIT THE Q5 ");
            System.out.println("6. EXIT THE Q6 ");
            System.out.println("7. EXIT THE Q7 ");
            System.out.println("8. EXIT THE Q8 ");
            System.out.println("0. EXIT  ");
            int choice1 = input.nextInt();
            input.nextLine();  // Consume newline
            switch (choice1) {
                case 1: {
                    String s = input.nextLine();
                    String revStr = new StringBuilder(s).reverse().toString();
                    if (s.equalsIgnoreCase(revStr)) {
                        System.out.println("its a palindrome String..!");
                    } else {
                        System.out.println("not a palindrome..!");
                    }
                }
                break;
                case 2: {
                    System.out.println("Enter an Email address..!");
                    String email = input.nextLine();
                    Pattern pattern = Pattern.compile("^[a-zA-Z0-9.]+@gmail\\.com$");
                    Matcher matcher = pattern.matcher(email);
                    boolean b = matcher.matches();
                    System.out.println("Is the Email valid->" + b);

                }
                break;
                case 3: {


                    LocalDate date = LocalDate.now();
                    System.out.println("Date of format yyyy-mm-dd..!");
                    System.out.println("The local date is ->" + date);
                    System.out.println("-----------------------------");
                    System.out.println("Date of format dd-mm-yyyy..!");
                    DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    String formatedDate = date.format(formate);
                    System.out.println("the local date now is ->" + formatedDate);
                }
                break;
                case 4: {
                    LocalDate date = LocalDate.now();
                    System.out.println("Date of format yyyy-mm-dd..!");
                    System.out.println("The local date is ->" + date);
                    System.out.println("-----------------------------");
                    LocalDate daysPlusDate = date.plusDays(30);
                    System.out.println("Date of format dd-mm-yyyy..!");
                    DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    String formatedDate = daysPlusDate.format(formate);
                    System.out.println("the local date now is ->" + formatedDate);

                }
                break;
                case 5: {
                    System.out.println("Enter a number:");
                    String inputString = input.nextLine(); // Input a number
                    int number = Integer.parseInt(inputString); // Convert string to int

                    // Roman numeral symbols and their corresponding values
                    String[] romanSymbols = {"M", "CM", "D", "C", "XC", "L", "X", "IX", "V", "I"};
                    int[] romanValues = {1000, 900, 500, 100, 90, 50, 10, 9, 5, 1};

                    StringBuilder romanNumeral = new StringBuilder();

                    // Convert the integer to a Roman numeral
                    for (int i = 0; i < romanValues.length; i++) {
                        int quotient = number / romanValues[i];
                        if (quotient == 0) continue;

                        if (quotient == 4 && i > 0) {
                            romanNumeral.append(romanSymbols[i]).append(romanSymbols[i - 1]);
                        } else {
                            romanNumeral.append(romanSymbols[i].repeat(quotient));
                        }

                        number = number % romanValues[i];
                    }

                    System.out.println("Roman numeral = " + romanNumeral);


                }
                break;
                case 6: {
                    System.out.println("Enter your special charater..!");
                    String userString = input.nextLine();
                    if (userString.equals("()") || userString.equals("{}") || userString.equals("[]") || userString.equals("(){}") || userString.equals("{}[]") || userString.equals("(){}[]")) {
                        System.out.println("true..!");
                    } else {
                        System.out.println("false");
                    }


                }
                break;
                case 7: {

                    System.out.println("Enter the number of strings:");
                    int n = input.nextInt();
                    input.nextLine(); // Consume newline
                    String[] userString = new String[n];
                    System.out.println("------------------------------");
                    System.out.println("Enter the strings:");
                    for (int i = 0; i < n; i++) {
                        userString[i] = input.nextLine();
                    }
                    System.out.println("------------------------------");
                    for (int i = 0; i < userString.length; i++) {
                        if (userString[i].isEmpty()) {
                            System.out.println("string is empty..!");
                            break;
                        } else {
                            System.out.println(userString[i]);
                        }
                    }
                    System.out.println("---------------------------");

                    String prefix = userString[0];

                    for (int i = 1; i < userString.length; i++) {
                        while (userString[i].indexOf(prefix) != 0) {
                            prefix = prefix.substring(0, prefix.length() - 1);
                            if (prefix.isEmpty()) {
                                System.out.println("prefix is empty");

                            } else {
                                System.out.print(prefix + ",");
                            }
                        }
                    }

                }
                break;
                case 8: {
                    System.out.println("Entered a string");
                    String str = input.nextLine();
                    String newStr = "";
                    System.out.println("entered String ->" + str);
                    if (str.isEmpty()) {
                        System.out.println("the string is empty..!");
                    }
                    char[] arr = str.toCharArray();
                    for (int i = 0; i < arr.length; i++) {
                        int j;
                        for (j = 0; j < arr.length; j++) {
                            if (arr[j] == arr[i]) {
                                break;
                            }
                        }
                        if (i == j) {
                            newStr += arr[i];
                        }
                    }
                    System.out.println("New String after removal of duplication->" + newStr);
                    char[] arr1 = newStr.toCharArray();
                    Arrays.sort(arr1);
                    newStr = String.valueOf(arr1);
                    System.out.println("new string after sorting -> "+newStr);

                }
                break;


                case 0:
                    System.out.println("EXITING APP...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");


            }


        }
    }
}