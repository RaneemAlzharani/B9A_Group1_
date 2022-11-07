
package Project_lab251;

import java.util.ArrayList;
import java.util.Scanner;

public class Project_lab251 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // array list for 3 type of supplies in the system
        ArrayList<Supplies>table = new ArrayList<Supplies>();
        table.add(new Supplies("Round table for 6",100,1,0));
        table.add(new Supplies("Round table for 4",100,1,0));
        ArrayList<Supplies>chair = new ArrayList<Supplies>();
        chair.add(new Supplies("White Chair",40,1,0));
        chair.add(new Supplies("Red Chair",40,1,0));
        chair.add(new Supplies("Wooden Chair",40,1,0));
        ArrayList<Supplies>speaker = new ArrayList<Supplies>();
        speaker.add(new Supplies("Big Speaker",120,1,0));
        speaker.add(new Supplies("Small Speaker",120,1,0));
       boolean restart = true;
       int ch=0;
       // this loop to start the program
       while(restart){
           System.out.print("4-Functional Requirement\n 1. Rent product \n 2. Update supplies"
                   + "\n 3.             \n 4.        \n Enter number (Enter 0 to exit): ");
              ch=scanner.nextInt();
              if(ch==1){
                  
              }else if(ch==2){
                  updateSupplies(table,chair,speaker);
              }else if(ch==3){
                  
              }else if(ch==4){
                  
              }else{
                  restart=false;
              }
           
       }
       
       
       
    }
       private static void updateSupplies(ArrayList<Supplies> table, ArrayList<Supplies> chair, ArrayList<Supplies> speaker){
       System.out.print("Enter colection that you want to update 1.Tables  2.Chairs  3.Speakers \nEnter number: ");
       Scanner scanner = new Scanner(System.in);
        int collection= scanner.nextInt();
        System.out.print("Choose what do you want to update: \n Change info. \n "
                                + " 1. Rename an item \n  2. Change price"
                                + "\n------------------------------------------------\n"+
                                "  3. Add new item \n  4. Delete item  "
                                +  "\n------------------------------------------------"+"\nEnter number: ");
        int choose= scanner.nextInt();
        int item=0;
            switch (collection) {
                
                case 1:
                    {
                        
                         if(choose==1||choose==2||choose==4){ 
                         for(int i=0;i<table.size();i++){
                            System.out.println(i+1+"."+table.get(i).toString());  
                         }
                         System.out.print("Enter item number :");
                         item= scanner.nextInt();
                         item=item-1;
                         }
                         if(choose==1){
                            System.out.print("Enter new name:");
                            String name=scanner.next();
                            table.get(item).setName(name);
                         }else if(choose==2){
                            System.out.print("Enter new price:");
                            int newPrice=scanner.nextInt();
                            table.get(item).setPrice(newPrice);
                         }else if(choose==3){
                            System.out.print("Enter a name for new item:");
                            String name=scanner.next();
                            System.out.print("Enter a price for new item:");
                            int Price=scanner.nextInt();
                            table.add(new Supplies(name,Price,0,0));
                         }else{
                            table.remove(item);
                            System.out.println("Item deleted successfully. ");
                         }
                        
                          break;
                    }
                case 2:
                    {
                        if(choose==1||choose==2||choose==4){ 
                        for(int i=0;i<chair.size();i++){
                            System.out.println(i+1+"."+chair.get(i).toString());  
                        }
                        System.out.print("Enter item number:");
                        item= scanner.nextInt();
                        item=item-1;
                        }
                        if(choose==1){
                            System.out.print("Enter new name:");
                            String name=scanner.next();
                            chair.get(item).setName(name);
                        }else if(choose==2){
                            System.out.print("Enter new price:");
                            int newPrice=scanner.nextInt();
                            chair.get(item).setPrice(newPrice);
                        }else if(choose==3){
                            System.out.print("Enter a name for new item:");
                            String name=scanner.next();
                            System.out.print("Enter a price for new item:");
                            int Price=scanner.nextInt();
                            chair.add(new Supplies(name,Price,0,0));
                        }else{
                            chair.remove(item);
                            System.out.println("Item deleted successfully. ");
                        }
                      break;
                    }
                case 3:
                    {
                         if(choose==1||choose==2||choose==4){ 
                        for(int i=0;i<speaker.size();i++){
                            System.out.println(i+1+"."+table.get(i).toString());  
                        }
                        System.out.print("Enter item number:");
                        item= scanner.nextInt();
                        item=item-1;
                         }
                         if(choose==1){
                            System.out.print("Enter new name:");
                            String name=scanner.next();
                            speaker.get(item).setName(name);
                         }else if(choose==2){
                             System.out.print("Enter new price:");
                            int newPrice=scanner.nextInt();
                            speaker.get(item).setPrice(newPrice);
                         }else if(choose==3){
                            System.out.print("Enter a name for new item:");
                            String name=scanner.next();
                            System.out.print("Enter a price for new item:");
                            int Price=scanner.nextInt();
                            speaker.add(new Supplies(name,Price,0,0));
                         }else{
                            speaker.remove(item);
                            System.out.println("Item deleted successfully. ");
                         }
                      break;
                    } 
    
      
   
   }
    

 
   }
}

