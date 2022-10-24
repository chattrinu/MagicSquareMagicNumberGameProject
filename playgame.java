public class playgame {
     // 2D array declaration
     int row,col;
     int input_num;
     int[][] num= {{0,7,0,0},{0,0,0,3},{0,0,0,0},{11,0,0,0}};  
   
   //  display original 4*4 table 
   public int Originaltable() {
     for (row=0; row <4; row++){
        for (col=0; col<4; col++) {
            System.out.print(num[row][col]+ "   ");
            
        }
        System.out.println();
     }
    return col;
   }
    
    // check the condition of numbers which are entered 
    public void CheckNum (int input_num) {
        
          if (input_num < 1 || input_num > 16){
               throw new IllegalArgumentException("the value is not between 1 and 16");
          }
          if (input_num==7 || input_num == 11 || input_num==3 ) {
              throw new IllegalArgumentException("the value is duplicate");
          }
          System.out.println("valid number");
      }
      
    }
  
            

     
   
    
    
    



 

