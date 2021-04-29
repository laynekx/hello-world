/*Find the real dip given the apparent dip, and find the apparent dip given the true dip. Given
adip = apparent dip, B = angle between strike direction and apparent dip, tdip = true dip.
Equations: 
>Apparent dip: adipans = arctan (sin B * tan (tdip))
>True dip: tdipans = arctan (tan(adip)*sin(B)).*/

import java.util.Scanner;

class Dip2{
//Step 1.1: Ask Q1
public static void main(String[] args){
    final Scanner scan = new Scanner(System.in);
    System.out.println("Q1. What is the angle between the strike direction and the apparent dip, 'B'?");
//Step 1.2: Check for erroneous answers for Q1
    try {
        int B = scan.nextInt();
        double B1 = Math.toRadians(B);
//Step 1.3: Ask Q2
        System.out.println("Q2. Would you like to solve for apparent dip (type 'adip') or true dip (type: 'tdip')?");
//Step 1.4: create object access_check_values to access data/methods from class check_values_and_calculations
        check_values access_check_values = new check_values();
        String q2_answer = access_check_values.get_q2_answer();
        access_check_values.evaluate_q2_answer(q2_answer, B1);
        scan.close();
      }
      catch(Exception e) {
        System.out.println("Error! Please try again.");
      }
}
}   

class check_values extends calculations{
final Scanner scan1 = new Scanner(System.in);

public String get_q2_answer(){
//Step 2.1: Find out if user wants to solve for adip or tdip
    String adip_or_tdip = scan1.nextLine();
        return adip_or_tdip;
}

//Step 2.2: Segregate answer according to true dip or apparent dip, while checking for erroneous answers
public void evaluate_q2_answer(String some_dip, double still_B1){
    if (some_dip.equals("tdip")){
        System.out.println("Q3.1 To solve for true dip, 'tdip', what is the apparent dip, 'adip'?");
//Step 2.3.1: Scan adip, check scanned adip for errors, and run method findtdip
    try {int adip_input = scan1.nextInt();
        findtdip(adip_input, still_B1);}
    catch(Exception e){
        System.out.println("Error! Please try again.");
    }
    }
    else if (some_dip.equals("adip")){
        System.out.println("Q3.2 To solve for apparent dip, 'adip', what is the true dip, 'tdip'?");
//Step 2.3.2: Scan tdip, check scanned tdip for errors, and run method findadip
        try {int tdip_input = scan1.nextInt();
        findadip(tdip_input, still_B1);}
        catch(Exception e){
            System.out.println("Error! Please try again.");
        }
            }
    else{
        System.out.println("Error! Please try again.");
    }
}
}
class calculations{
private double adip_final, adip_temporary, tdip_temporary, tdip_final;
//Step 3.1: calculations and system answer for tdip, given adip
protected void findtdip(int adip_user, double B1_again){
    double adip2 = Math.toRadians(adip_user);
    tdip_temporary = Math.atan(Math.tan (adip2)*Math.sin(B1_again));
    tdip_final = Math.toDegrees(tdip_temporary);
    double B2 = Math.toDegrees(B1_again);
    System.out.println("Given B = " + B2 + " and " + "adip = " + adip_user + ", the tdip = " + tdip_final);
            }

//Step 3.2: calculations and system answer for adip, given tdip
protected void findadip(int tdip_user, double B1_again){
    double tdip2 = Math.toRadians(tdip_user);
    adip_temporary = Math.atan(Math.sin(B1_again)*Math.tan(tdip2));
    adip_final = Math.toDegrees(adip_temporary);
    double B2 = Math.toDegrees(B1_again);
    System.out.println("Given B = " + B2 + " and " + "tdip = " + tdip_user + ", the adip = " + adip_final);
    }
}