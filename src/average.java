import java.util.Scanner;
/*
*Author:kyle hicks
* date:9/12/2017
* purpose: to average out ten numbers
* email:knh2729@email.vccs.edu
 */

public class average {
    public static void main (String[]args) {
        int s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, average;
        Scanner keyboard = new Scanner(System.in);//declare new scanner
        keyboard.useDelimiter(",");//define delimiter
        System.out.println("what are the numbers?");
        s1 = keyboard.nextInt();//ask for numbers
        s2 = keyboard.nextInt();
        s3 = keyboard.nextInt();
        s4 = keyboard.nextInt();
        s5 = keyboard.nextInt();
        s6 = keyboard.nextInt();
        s7 = keyboard.nextInt();
        s8 = keyboard.nextInt();
        s9 = keyboard.nextInt();
        s10 = keyboard.nextInt();
        average = (s1+s2+s3+s4+s5+s6+s7+s8+s9+s10)/10;//average them out

        System.out.print("the average of \"" + s1 + "\"");
        System.out.print(",\"" + s2 + "\"");
        System.out.print(",\"" + s3 + "\"");
        System.out.print(",\"" + s4 + "\"");
        System.out.print(",\"" + s5 + "\"");
        System.out.print(",\"" + s6 + "\"");
        System.out.print(",\"" + s7 + "\"");
        System.out.print(",\"" + s8 + "\"");
        System.out.print(",\"" + s9 + "\"");
        System.out.print(",\"" + s10 + "\"");
        System.out.print(",\"" + s10 + " is " + average);
        keyboard.close();

    }
}
