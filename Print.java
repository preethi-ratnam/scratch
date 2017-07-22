/*
* Program to print numbers as rows and cols
*/
public class Print{
  public static void main(String[] args){
    int rows=10, cols=5;
    for(int i=0; i<rows; i++){
      //System.out.print((i-1) + ((i%cols == 0) ? "\n" : " ")); 
      for (int j=0; j<cols; j++){
        System.out.print(i*cols+j + (j == cols-1 ? "\n" : " ")); 
      }
    }
  }
}
