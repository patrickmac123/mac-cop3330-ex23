package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 23 Solution
 *  Copyright 2021 Patrick Mac
 */

public class App
{

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String input;
        System.out.println("This program helps Troubleshoot Car Issues");
        System.out.println("type y for yes and n for no");
        System.out.print("Is the car silent when you turn the key? ");
        input = scan.nextLine();
        if(input.equals("y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            input = scan.nextLine();
            if(input.equals("y"))
            {
                System.out.print("Clean terminals and try starting again.");
            }
            else if(input.equals("n"))
            {
                System.out.print("Replace cables and try again.");
            }
        }
        else if(input.equals("n"))
        {
            System.out.print("Does the car make a slicking noise? ");
            input = scan.nextLine();
            if(input.equals("y"))
            {
                System.out.print("Replace the battery.");
            }
            else if(input.equals("n"))
            {
            System.out.print("Does the car crank up but fail to start? ");
            input = scan.nextLine();
                if(input.equals("y"))
                {
                System.out.print("Check spark plug connections.");
                }
                else if(input.equals("n"))
                {
                    System.out.print("Does the engine start and then die? ");
                    input = scan.nextLine();
                    if(input.equals("y"))
                    {
                        System.out.print("Does you car have fuel injection? ");
                        input = scan.nextLine();
                        if(input.equals("y"))
                        {
                            System.out.print("Get it in for service.");
                        }
                        else if(input.equals("n"))
                        {
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else if(input.equals("n"))
                    {
                        System.out.print("This should not be possible.");
                    }
                }
            }
        }

        }
    }
