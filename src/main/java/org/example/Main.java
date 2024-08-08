package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
        public static void main(String[] args) {
                String pattern = "^[A-Z][a-zA-Z]{2,}$";
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter first name");
                String fName = sc.next();
                Pattern compiledPattern = Pattern.compile(pattern);
                Matcher matcher = compiledPattern.matcher(fName);
                if (matcher.matches()) {
                        System.out.println("Valid");
                } else {
                        System.out.println("Invalid");
                }

                System.out.println("Enter last name");
                String lName = sc.next();
                Matcher matcher2 = compiledPattern.matcher(lName);
                if (matcher2.matches()) {
                        System.out.println("Valid");
                } else {
                        System.out.println("Invalid");
                }


                System.out.print("Enter email address: ");
                String email = sc.nextLine();
                String pattern2 = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+)*@[a-zA-Z0-9](?:[-a-zA-Z0-9]{0,61}[a-zA-Z0-9])(?:\\.[a-zA-Z]{2,})?$";
                Pattern compiledPattern2 = Pattern.compile(pattern2);
                Matcher matcher3 = compiledPattern2.matcher(email);
                if (matcher3.matches()) {
                        System.out.println("Valid email address.");
                } else {
                        System.out.println("Invalid email address. Please follow the format: abc.xyz@bl.co.in (optional parts: xyz & in)");
                }

                System.out.println("Enter mobile number with country code, space followed by 10 digit number");
                sc.nextLine();
                String phoneNumber = sc.nextLine();
                String mobileRegex = "^\\d{2}\\d{10}$";
                Pattern CompiledMobile = Pattern.compile(mobileRegex);
                Matcher matcherPhone = CompiledMobile.matcher(phoneNumber);
                if (matcherPhone.matches())
                        System.out.println("VALID");
                else
                        System.out.println("INVALID");


                System.out.println("Enter password minimum 8 characters");
                sc.nextLine();
                String password=sc.nextLine();
                String passwordRegex = "^(?=.*[A-Z])(?=.*\\d)(?=^[^!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/`~]*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/`~][^!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/`~]*$).{8,}$";
                Pattern compiledPassword=Pattern.compile(passwordRegex);
                Matcher matchPassword=compiledPassword.matcher(password);
                if(matchPassword.matches())
                        System.out.println("VALID Password");
                else
                        System.out.println("INVALID password");
        }

}
