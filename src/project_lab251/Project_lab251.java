/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_lab251;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 96655
 */
public class Project_lab251 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Supplies>table = new ArrayList<>();
        table.add(new Supplies("Round table for 6",100.0,1,0));
        table.add(new Supplies("Round table for 4",100.0,1,0));
        
        ArrayList<Supplies>chair = new ArrayList<>();
        chair.add(new Supplies("White Chair",40.0,1,0));
        chair.add(new Supplies("Red Chair",40.0,1,0));
        chair.add(new Supplies("Wooden Chair",40.0,1,0));
        
        ArrayList<Supplies>speaker = new ArrayList<>();
        speaker.add(new Supplies("Big Speaker",120.0,1,0));
        speaker.add(new Supplies("Small Speaker",120.0,1,0));
        
        boolean restart = true;
       while(restart){
           System.out.print("\n4-Functional Requirement\n 1. Rent product \n 2. Update supplies"
                   + "\n 3. Modify renting information\n 4. Rating \n Enter number (Enter 0 to exit): ");
              
            int ch=scanner.nextInt();
              if(ch==1){
                  rentProudct(table,chair,speaker);
              }else if(ch==2){
                  updateSupplies(table,chair,speaker);
              }else if(ch==3){
                  updateSupplies(table,chair,speaker);
              }else if(ch==4){
                  serviceRating();
                  
              }else{
                  restart=false;
              }
           
       }
        
       
    }
    public static void rentProudct(ArrayList<Supplies> table, ArrayList<Supplies> chair, ArrayList<Supplies> speaker){
    	Scanner scanner = new Scanner(System.in);
        int answer = -1;
        do{
        System.out.println("choose what do you want to rent \n1.Tables  \n2.Chairs  \n3.Speakers  \n4.Update  \n0. Exit.");
        try{
        	answer = scanner.nextInt();
        } catch(Exception e){
        	System.out.println("error entery");
        }
        int item_choose = -1, item_quantity = 0, item_days = 0;
        double item_price = 0.0;
        
        switch (answer) {
            case 1:
            {

                System.out.println("Available tables :");
                for(int i=0;i<table.size();i++){
                    System.out.println(i+1+"."+table.get(i).toString());
                }
                try{
                	item_choose = scanner.nextInt();
                } catch(Exception e){
                	System.out.println("error no. ");
                }
                item_choose--;
                double tablePrice = table.get(item_choose).price;
                System.out.println("How many table do you want?");
                try{
                	item_quantity = scanner.nextInt();
                } catch(Exception e){
                	System.out.println("error no. ");
                }
                table.get(item_choose).setQuantity(item_quantity);
                System.out.println("How many days do you need it?");
                try{
                	item_days = scanner.nextInt();
                } catch(Exception e){
                	System.out.println("error no. ");
                }
                double amount = (tablePrice * item_quantity) * item_days;
                table.get(item_choose).setPrice(amount);
                System.out.println("Your total amount is"+ amount);
                break;
            }
            case 2:
            {

                System.out.println("Available chairs :");
                for(int i=0;i<chair.size();i++){
                    System.out.println(i+1+"."+chair.get(i).toString());
                }
                try{
                	item_choose = scanner.nextInt();
                } catch(Exception e){
                	System.out.println("error no. ");
                }
                item_choose--;
                double chairPrice = chair.get(item_choose).price;
                System.out.println("How many chairs do you want?");
                try{
                	item_quantity = scanner.nextInt();
                } catch(Exception e){
                	System.out.println("error no. ");
                }
                chair.get(item_choose).setQuantity(item_quantity);
                System.out.println("How many days do you need it?");
                try{
                	item_days = scanner.nextInt();
                } catch(Exception e){
                	System.out.println("error no. ");
                }
                double amount = (chairPrice * item_quantity) * item_days;
                chair.get(item_choose).setPrice(amount);
                System.out.println("Your total amount is"+ amount);
                break;
            }
            case 3:
            {

                System.out.println("Available speakers :");
                System.out.println("Available tables :");
                for(int i=0;i<speaker.size();i++){
                    System.out.println(i+1+"."+speaker.get(i).toString());
                }
                try{
                	item_choose = scanner.nextInt();
                } catch(Exception e){
                	System.out.println("error no. ");
                }
                item_choose--;
                double speakerPrice = speaker.get(item_choose).price;
                System.out.println("How many speakers do you want?");
                try{
                	item_quantity = scanner.nextInt();
                } catch(Exception e){
                	System.out.println("error no. ");
                }
                speaker.get(item_choose).setQuantity(item_quantity);
                System.out.println("How many days do you need it?");
                try{
                	item_days = scanner.nextInt();
                } catch(Exception e){
                	System.out.println("error no. ");
                }
                double amount = (speakerPrice * item_quantity) * item_days;
                speaker.get(item_choose).setPrice(amount);
                System.out.println("Your total amount is"+ amount);
                break;
            }
            case 4:
            	updateSupplies(table, chair, speaker);
            	break;
            	
            case 0:
            	break;
            	
            default:
            	System.out.println("error choice.");
        }
        } while(answer != 0);
        
	}



    private static void updateSupplies(ArrayList<Supplies> table, ArrayList<Supplies> chair, ArrayList<Supplies> speaker){
        while (true) {
            System.out.print("Enter collection that you want to update: \n1.Tables  \n2.Chairs  \n3.Speakers  \n4.Exit \nEnter number: ");
            Scanner scanner = new Scanner(System.in);
            int collection;
            try{
            	collection = scanner.nextInt();
            } catch(Exception e){
            	System.out.println("error no.");
            	break;
            }
            if (collection >= 1 && collection <= 3) {
                updateSupplies(table, chair, speaker, collection);
            }else if (collection == 4){
                break;
            }else {
                System.out.println("The number you entered not in the range.");
            }
        }
    }


    private static void updateSupplies(ArrayList<Supplies> table, ArrayList<Supplies> chair, ArrayList<Supplies> speaker, int collection){
        int choose=-1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Choose what do you want to update: \n Change info. \n "
                    + " 1. Rename an item \n  2. Change price \n  3. Change quantity \n  4. change days"
                    + "\n------------------------------------------------\n"+
                    "  5. Add new item \n  6. Delete item  \n 7. Exit  \n  0. Back  \n"
                    +  "\n------------------------------------------------"+"\nEnter number: ");
            
            try{
            	choose = scanner.nextInt();
            } catch(Exception e){
            	System.out.println("error no. ");
            	break;
            }
            int item = 0;
            String item_name = "";
            int item_days = 0, item_quantity = 0;
            double item_price = 0.0;
            
            switch (collection) {
                case 1:
                {
                    for(int i=0;i<table.size();i++){
                        System.out.println(i+1+"."+table.get(i).toString());
                    }
                    System.out.print("Enter item number :");
                    try{
                    	item = scanner.nextInt();
                    } catch(Exception e){
		                System.out.println("error no. ");
				    	break;
				    }
                    scanner.nextLine();
                    item=item-1;
                    
                    if(choose==1){
                        System.out.print("Enter new name:");
                        item_name=scanner.nextLine();
                        table.get(item).setName(item_name);
                        
                    }else if(choose==2){
                        System.out.print("Enter new price:");
                        try{
                        	item_price = scanner.nextDouble();
                        } catch(Exception e){
                        	System.out.println("error no. ");
							break;
						}
                        table.get(item).setPrice(item_price);
                        
                    }else if(choose==3){
                        System.out.print("Enter new quantity:");
                        try{
                        	item_quantity = scanner.nextInt();
                        } catch(Exception e){
                        	System.out.println("error no. ");
							break;
						}
                        table.get(item).setQuantity(item_quantity);
                       
                    }else if(choose==4){
                        System.out.print("Enter new days:");
                        int newDays=scanner.nextInt();
                        table.get(item).setDays(newDays);
                       
                    }else if(choose==5){
                        System.out.print("Enter a name for new item:");
                        item_name=scanner.nextLine();
                        System.out.print("Enter a price for new item:");
                        try{
                        	item_price = scanner.nextDouble();
                        } catch(Exception e){
                        	System.out.println("error no. ");
						}
                        table.add(new Supplies(item_name, item_price, 0, 0));
                        
                    }else if(choose==6){
                        table.remove(item);
                        System.out.println("Item deleted successfully. ");
                        
                    }else if(choose==0){
                        break;
                        
                    }else {
                        System.out.println("The number you entered not in the range.");
                    }
                    break;
                }
                case 2:
                {
                    for(int i=0;i<chair.size();i++){
                        System.out.println(i+1+"."+chair.get(i).toString());
                    }
                    System.out.print("Enter item number :");
                    try{
                    	item = scanner.nextInt();
                    } catch(Exception e){
		                System.out.println("error no. ");
				    	break;
				    }
                    scanner.nextLine();
                    item=item-1;
                    
                    if(choose==1){
                        System.out.print("Enter new name:");
                        item_name=scanner.nextLine();
                        chair.get(item).setName(item_name);
                        
                    }else if(choose==2){
                        System.out.print("Enter new price:");
                        try{
                        	item_price = scanner.nextDouble();
                        } catch(Exception e){
                        	System.out.println("error no. ");
							break;
						}
                        chair.get(item).setPrice(item_price);
                        
                    }else if(choose==3){
                        System.out.print("Enter new quantity:");
                        try{
                        	item_quantity = scanner.nextInt();
                        } catch(Exception e){
                        	System.out.println("error no. ");
							break;
						}
                        chair.get(item).setQuantity(item_quantity);
                       
                    }else if(choose==4){
                        System.out.print("Enter new days:");
                        int newDays=scanner.nextInt();
                        chair.get(item).setDays(newDays);
                       
                    }else if(choose==5){
                        System.out.print("Enter a name for new item:");
                        item_name=scanner.nextLine();
                        System.out.print("Enter a price for new item:");
                        try{
                        	item_price = scanner.nextDouble();
                        } catch(Exception e){
                        	System.out.println("error no. ");
						}
                        chair.add(new Supplies(item_name, item_price, 0, 0));
                        
                    }else if(choose==6){
                        chair.remove(item);
                        System.out.println("Item deleted successfully. ");
                        
                    }else if(choose==0){
                        break;
                        
                    }else {
                        System.out.println("The number you entered not in the range.");
                    }
                    break;
                }
                case 3:
                {
                    for(int i=0;i<speaker.size();i++){
                        System.out.println(i+1+"."+speaker.get(i).toString());
                    }
                    System.out.print("Enter item number :");
                    try{
                    	item = scanner.nextInt();
                    } catch(Exception e){
		                System.out.println("error no. ");
				    	break;
				    }
                    scanner.nextLine();
                    item=item-1;
                    
                    if(choose==1){
                        System.out.print("Enter new name:");
                        item_name=scanner.nextLine();
                        speaker.get(item).setName(item_name);
                        
                    }else if(choose==2){
                        System.out.print("Enter new price:");
                        try{
                        	item_price = scanner.nextDouble();
                        } catch(Exception e){
                        	System.out.println("error no. ");
							break;
						}
                        speaker.get(item).setPrice(item_price);
                        
                    }else if(choose==3){
                        System.out.print("Enter new quantity:");
                        try{
                        	item_quantity = scanner.nextInt();
                        } catch(Exception e){
                        	System.out.println("error no. ");
							break;
						}
                        speaker.get(item).setQuantity(item_quantity);
                       
                    }else if(choose==4){
                        System.out.print("Enter new days:");
                        int newDays=scanner.nextInt();
                        speaker.get(item).setDays(newDays);
                       
                    }else if(choose==5){
                        System.out.print("Enter a name for new item:");
                        item_name=scanner.nextLine();
                        System.out.print("Enter a price for new item:");
                        try{
                        	item_price = scanner.nextDouble();
                        } catch(Exception e){
                        	System.out.println("error no. ");
						}
                        speaker.add(new Supplies(item_name, item_price, 0, 0));
                        
                    }else if(choose==6){
                        speaker.remove(item);
                        System.out.println("Item deleted successfully. ");
                        
                    }else if(choose==0){
                        break;
                        
                    }else {
                        System.out.println("The number you entered not in the range.");
                    }
                    break;
                }
            }
        } while (choose != 7);
                
    }
    
    public static void serviceRating(){
       System.out.println("Thank you for visiting our store.\nPlease rate your experience on a scale from 1(unhappy) to 10(happy): ");
       Scanner scanner = new Scanner(System.in);
       int rating= scanner.nextInt();
       
       if(rating == 10){
           System.out.println("thank you for rating.");
       }
       else if(rating <10 || rating > 0){
           scanner.nextLine();
           System.out.println("How can we make your experience even better?");
           String improve = scanner.nextLine();
           System.out.println("thank you for rating.");
       }
   }
    
}
