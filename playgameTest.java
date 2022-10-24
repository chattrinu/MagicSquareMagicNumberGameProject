import java.util.Scanner;

public class playgameTest {

    public static void main(String[] args) {
        
        // Create the object "magic"  to instantiate input_numbers
        playgame magic = new playgame();
       
        
       // Create the object to instantiate result
        CheckResult checkmagic = new CheckResult();

      

        //create the object each new numbers which is entered.
        playgame newnum00= new playgame(); 
        playgame newnum02= new playgame();
        playgame newnum03= new playgame();
        playgame newnum10= new playgame();
        playgame newnum11= new playgame();
        playgame newnum12= new playgame();
        playgame newnum20= new playgame();
        playgame newnum21= new playgame();
        playgame newnum22= new playgame();
        playgame newnum23= new playgame();
        playgame newnum31= new playgame();
        playgame newnum32= new playgame();
        playgame newnum33= new playgame();
        
       // print original table number
        System.out.println("Your table of Magic number.");  
        System.out.println("The initial table composes of 16 grids.There are 3 reserved numbers which are 7 in row 1 column 2, 3 in row 2 column 4 and 11 in row 4 column 1 as shown below");
        magic.Originaltable();
        
        // Start playing the  game
        System.out.println();
        Scanner input =new Scanner(System.in);
        System.out.println("1.Please enter the unduplicated numbers from 1 to 16 to each gird." );
        System.out.println("2.The numbers must be added to equal the magic 34 in any dimension; row, column, diagonal.");
        System.out.println("3.If you put the number which is similar to the reserved numbers(3,7,11), you will automatically be exited the game");
        System.out.println("4.For this game, We assume that you put the different numbers between 1 and 16 ");
        
        // Received each numbers from user.
        System.out.println();
        //prompt to  enter the number
        System.out.println("Please enter number Row 1 Column 1");
        int row1col1 = input.nextInt() ;   
        newnum00.CheckNum(row1col1);  // assign the number entered to method " Checknum" in order to verify the condition. 
        System.out.println(row1col1);

        
        System.out.println("Please enter number Row 1 Column 3"); // enter number row 1 column 3
        int row1col3 = input.nextInt(); // assign the number entered to method " Checknum" in order to verify the condition. 
        newnum02.CheckNum(row1col3);
        

        System.out.println("Please enter number Row 1 Column 4");
        int row1col4 = input.nextInt();
        newnum03.CheckNum(row1col4);
        

        System.out.println("Please enter number Row 2 Column 1");
        int row2col1= input.nextInt();
        newnum10.CheckNum(row2col1);
        

        System.out.println("Please enter number Row 2 Column 2");
        int row2col2 = input.nextInt();
        newnum11.CheckNum(row2col2);
        
        System.out.println("Please enter number Row 2 Column 3");
        int row2col3 = input.nextInt();
        newnum12.CheckNum(row2col3);
        

        System.out.println("Please enter number Row 3 Column 1");
        int row3col1 = input.nextInt() ;
        newnum20.CheckNum(row3col1);
        
        
        System.out.println("Please enter number Row 3 Column 2");
        int row3col2 = input.nextInt();
        newnum21.CheckNum(row3col2);
        

        System.out.println("Please enter number Row 3 Column 3");
        int row3col3 = input.nextInt() ;
        newnum22.CheckNum(row3col3);
        

        System.out.println("Please enter number Row 3 Column 4");
        int row3col4 = input.nextInt();
        newnum23.CheckNum(row3col4);
        

        System.out.println("Please enter number Row4  Column 2");
        int row4col2 = input.nextInt() ;
        newnum31.CheckNum(row4col2);
        

        System.out.println("Please enter number Row4 Column 3");
        int row4col3 = input.nextInt();
        newnum32.CheckNum(row4col3);
        

        System.out.println("Please enter number Row4 Column 4");
        int row4col4 = input.nextInt() ;
        newnum33.CheckNum(row4col4);

        // Display the numbers entered in Array 4*4
        // calculate all numbers to meet the condition that is magic number "34"
        int row1,row2,row3,row4,col1,col2,col3,col4,diagonal_right,diagonal_left; // variable for results
        row1 = row1col1+7+row1col3+row1col4;
        row2 = row2col1+ row2col2+row2col3 + 3;
        row3 = row3col1 + row3col2+row3col3+row3col4;
        row4=  11+row4col2+row4col3+row4col4;
        col1 = row1col1 + row2col1+ row3col1 + 11;
        col2 = 7+row2col2 + row3col2+row4col2;
        col3 = row1col3 + row2col3+ row3col3 + row4col3;
        col4= row1col4+3+row3col4+row4col4;
        diagonal_right = row1col1+row2col2+row3col3+row4col4;
        diagonal_left= row1col4+row2col3+row3col2+11;
        int[][] newNumber = {{row1col1,7,row1col3,row1col4},
                             {row2col1,row2col2,row2col3,3},
                             {row3col1,row3col2,row3col3,row3col4},
                             {11,row4col2,row4col3,row4col4}};  
         
        // display all entered numbers in Array 4*4
         System.out.println("your complete magic square is..");
         for (int row=0; row <4; row++){
             for (int col=0; col<4; col++) {
                  System.out.print(newNumber[row][col]+ "   ");
                 
                 }
                  System.out.println();
                } 
       
           
        // Display all results 
          System.out.println();
          System.out.println("     The Result    ");
          System.out.println();
          System.out.printf("row1%20d%n",row1);
          System.out.printf("row2%20d%n",row2);
          System.out.printf("row3%20d%n",row3);
          System.out.printf("row4%20d%n",row4);
          System.out.printf("column1%17d%n",col1);
          System.out.printf("column2%17d%n",col2);
          System.out.printf("column3%17d%n",col3);
          System.out.printf("column4%17d%n",col4);
          System.out.printf("right diagonal%10d%n",diagonal_right);
          System.out.printf("left diagonal%11d%n",diagonal_left);

        // Check the result whether all result is "magic number".
        System.out.println();
        System.out.println();
        Integer[] result =new Integer[] {row1,row2,row3,row4,col1,col2,col3,col4,diagonal_right,diagonal_left};
            for (int x: result){
                if (x == checkmagic.CheckResultNum()){
                      System.out.println("you got a magic number!");
                } else {
                    System.out.println("it is not a  magic number!!");
                }
            }
           // Show an answer 
            System.out.println();
            System.out.println();
             if (row1!=34||row2!=34||row3!=34||row4!=34||col1!=34||col2!=34||col3!=34||col4!=34||diagonal_right!=34||diagonal_left!=34){
                     
                     System.out.println("You lose!");
                     System.out.println("Do you want an answer Y or N?");
                     Scanner inputAns= new Scanner(System.in);
                             String a = inputAns.nextLine();
                     if (a.equals("Y")){
                             System.out.println("The Answer");
                             checkmagic.Answer();
                             System.exit(0);
                        } else if (a.equals("N")) {
                             System.exit(0);
                        }
                    } else {
                 System.out.println("You win");
                 System.out.println("The Answer");
                 checkmagic.Answer();
                 }
            }  

            

}

    
