package org.practice.oops;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // initialize variables and object
        String input = "";
        Scanner scanner = new Scanner(System.in);
        UserApi userApi = new UserApi();

        // get input from user and initiate object
        System.out.println("Please enter your email: ");
        input = scanner.nextLine();
        User user = new User();
        user.setEmail(input);

        // and call api and print responsep
        Map<String, String> response = userApi.loginUser(user);
        System.out.println("response =>");
        System.out.println(response);


    }
}
