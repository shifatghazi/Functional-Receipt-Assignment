//Shifat Ghazi

import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {
    
    //Creates Date object (code from the teacher)
	int termNum = 1; 
	Date date = new Date(); 

    //Allows input from the user
    InputStreamReader inStream = new InputStreamReader(System.in);
    BufferedReader bufRead = new BufferedReader(inStream);

    //Creating variables to be used in the program
    double price1 = 25.50;
    double price2 = 299.00;
    double price3 = 32.99;
    double price4 = 6.50;
    String item = "";
    String itemAmount = "";
    int amount1 = 0;
    int amount2 = 0;
    int amount3 = 0;
    int amount4 = 0;
    String yesNo = "";
    double total1 = 0;
    double total2 = 0; 
    double total3 = 0; 
    double total4 = 0;
    double fullTotal = 0;
    double cash = 0;
    double change = 0;
    int lastDigits = 7211;
    int approvalNum = (int)(100000*Math.random()+100000); 

    
    //Makes the text go three spaces down
    System.out.printf("\n\n\n");

    //Sign showing the prices for each item
    System.out.printf("%36s\n","WELCOME TO THE SHOP!");
    System.out.printf("-----------------------------------------------------\n");
    System.out.printf("1 x T-Shirt\u001B[1m%36s$%.2f\u001B[m\n"," ",price1);
    System.out.printf("1 x Watches\u001B[1m%35s$%.2f\u001B[m\n"," ",price2);
    System.out.printf("1 x Pants\u001B[1m%38s$%.2f\u001B[m\n"," ",price3);
    System.out.printf("1 x Socks\u001B[1m%39s$%.2f\u001B[m\n"," ",price4);
    System.out.printf("-----------------------------------------------------\n");
    
    //Asking the user what they want to buy and how much of it
    
        do{
            try{
                System.out.printf("%40s\n","What would you like to buy?");
                item = bufRead.readLine();

                if(item.equals("T-Shirt") || item.equals("T-SHIRT") || item.equals("t-shirt") || item.equals("tshirt") ||item.equals("TSHIRT")){
                    System.out.printf("%40s","How many would you like?\n");
                    itemAmount = bufRead.readLine();
                    amount1 += Integer.parseInt(itemAmount);
                    System.out.printf("\n"+amount1+" x T-Shirts added to cart.\n\n");
                    System.out.printf("%46s","Would you like anything else (Y/N)?\n");
                    yesNo = bufRead.readLine();
                if(yesNo.equals("Y") || yesNo.equals("y")){
                    continue;
                }else if(yesNo.equals("N") ||          yesNo.equals("n")){
                    break;
                }
                }else if(item.equals("Watches") || item.equals("WATCHES") || item.equals("watches")){
                    System.out.printf("%40s","How many would you like?\n");
                    itemAmount = bufRead.readLine();
                    amount2 += Integer.parseInt(itemAmount);
                    System.out.printf("\n"+amount2+" x Watches added to cart.\n\n");
                    System.out.printf("%46s","Would you like anything else (Y/N)?\n");
                    yesNo = bufRead.readLine();
                if(yesNo.equals("Y") || yesNo.equals("y")){
                    continue;
                }else if(yesNo.equals("N") ||          yesNo.equals("n")){
                    break;
                }
                }else if(item.equals("Pants") || item.equals("PANTS") || item.equals("pants")){
                    System.out.printf("%40s","How many would you like?\n");
                    itemAmount = bufRead.readLine();
                    amount3 += Integer.parseInt(itemAmount);
                    System.out.printf("\n"+amount3+" x Pants added to cart.\n\n");
                    System.out.printf("%46s","Would you like anything else (Y/N)?\n");
                    yesNo = bufRead.readLine();
                if(yesNo.equals("Y") || yesNo.equals("y")){
                    continue;
                }else if(yesNo.equals("N") || yesNo.equals("n")){
                    break;
                }
                }else if(item.equals("Socks") || item.equals("SOCKS") || item.equals("socks")){
                    System.out.printf("%40s","How many would you like?\n");
                    itemAmount = bufRead.readLine();
                    amount4 += Integer.parseInt(itemAmount);
                    System.out.printf("\n"+amount4+" x Socks added to cart.\n\n");
                    System.out.printf("%46s","Would you like anything else (Y/N)?\n");
                    yesNo = bufRead.readLine();
                if(yesNo.equals("Y") || yesNo.equals("y")){
                    continue;
                }else if(yesNo.equals("N") || yesNo.equals("n")){
                    break;
                }
                }else if(item.equals("Buy") || item.equals("BUY") || item.equals("buy")){
                    break;
                }else{
                    System.out.printf("Invalid response\n\n");
                }
            }
            catch(IOException err){
                System.out.printf("Error reading line\n\n");
            }
            catch(NumberFormatException err){
                System.out.printf("Error converting number\n\n");
            }
        }while(true);
    

    //Determines the total price for everything
    total1 = amount1*price1;
    total2 = amount2*price2;
    total3 = amount3*price3;
    total4 = amount4*price4;
    fullTotal = total1+total2+total3+total4;


    //Determines the amount of cash
    while(true){
        if((fullTotal/10)<1){
            cash = (Math.ceil(fullTotal/10.0))*10.0;
            break;
        }else if((fullTotal/100)<1){
            cash = (Math.ceil(fullTotal/100.0))*100.0;
            break;
        }else if((fullTotal/1000)<1){
            cash = (Math.ceil(fullTotal/1000.0))*1000.0;
            break;
        }else if((fullTotal/10000)<1){
            cash = (Math.ceil(fullTotal/10000.0))*10000.0;
            break;
        }else if((fullTotal/1000000)<1){
            cash = (Math.ceil(fullTotal/100000.0))*100000.0;
            break;
        }
    }
    
    //Determines the amount of change received after the transaction
    change = cash-fullTotal;

    //Turns the dollar amounts into strings
    String total1String = String.format("$%.2f",total1);
    String total2String = String.format("$%.2f",total2);
    String total3String = String.format("$%.2f",total3);
    String total4String = String.format("$%.2f",total4);
    String fullTotalString = String.format("$%.2f",fullTotal);
    String cashString = String.format("$%.2f",cash);
    String changeString = String.format("$%.2f",change);

    //Makes the text go two spaces down
    System.out.printf("\n\n");

    //Prints beginning of receipt
    System.out.printf("* * * * * * * * * ");
    System.out.printf("* * * * * * * * * ");
    System.out.printf("* * * * * * * * *%n");//The receipt is 53 spaces wide
    System.out.printf("%30s%n", "RECEIPT");
    System.out.printf("* * * * * * * * * ");
    System.out.printf("* * * * * * * * * ");
    System.out.printf("* * * * * * * * *%n");
    System.out.printf("Terminal#%d", termNum);
    System.out.printf("%8s", "");
    //Determines the date and time (code from the teacher)
    System.out.printf("%1$18td-%1$tm-%1$tY  %1$tH:%1$tM%1$Tp%n", date); 


    //Displays the items and amount bought
    System.out.printf("-----------------------------------------------------\n");

    if(amount1>0){
        if(amount1<10){
            System.out.printf(amount1+" x T-Shirt\u001B[1m%42s\u001B[m\n",total1String);
        }else if(amount1<100){
            System.out.printf(amount1+" x Watches\u001B[1m%41s\u001B[m\n",total1String);
        }
    }
    if(amount2>0){
        if(amount2<10){
            System.out.printf(amount2+" x Watches\u001B[1m%42s\u001B[m\n",total2String);
        }else if(amount2<100){
            System.out.printf(amount2+" x Watches\u001B[1m%41s\u001B[m\n",total2String);
        }
    }
    
    if(amount3>0){
        if(amount3<10){
            System.out.printf(amount3+" x Pants\u001B[1m%44s\u001B[m\n",total3String);
        }else if(amount3<100){
            System.out.printf(amount3+" x Pants\u001B[1m%43s\u001B[m\n",total3String);
        }
    }
    
    if(amount4>0){
        if(amount4<10){
            System.out.printf(amount4+" x Socks\u001B[1m%44s\u001B[m\n",total4String);
        }else if(amount4<100){
            System.out.printf(amount4+" x Socks\u001B[1m%43s\u001B[m\n",total4String);
        }
    }
    
    System.out.printf("-----------------------------------------------------\n");
    System.out.printf("-----------------------------------------------------\n");

    //Displays the rest of the receipt
    System.out.printf("\u001B[1mTOTAL AMOUNT%41s\u001B[m\n",fullTotalString);
    System.out.printf("CASH%49s\n",cashString);
    System.out.printf("CHANGE%47s\n\n",changeString);
    System.out.printf("Bank Card%25s**** **** **** %d\n"," ",lastDigits);
    System.out.printf("Approval#%44d\n",approvalNum);
    
    System.out.printf("-----------------------------------------------------\n\n");
    
    System.out.printf("* * * * * * * * * * * THANK YOU! * * * * * * * * * *\n\n");
  }
}

