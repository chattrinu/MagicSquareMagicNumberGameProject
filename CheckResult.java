public class CheckResult {
    
          int result_num=34;
          int[][] answer = {{2,7,12,13},{16,9,6,3},{5,4,1,10},{11,14,1,8}};
          int row,col;
      
      public int CheckResultNum(){
            return result_num; 
            
      }
      public int Answer() {
          for (row=0;row<4;row++){
            for (col=0;col<4;col++){
                System.out.print(answer[row][col]+"    ");
            }
            System.out.println();
          }
          return col;
        }
        
    }

