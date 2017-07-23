public class Stars{
  public static void main(String args[]){
    int nu = 1;
     for(int i=0;i<nu;i++)
     { 
       for(int k=nu;k>i;k--)
       {
         System.out.print("-");
       }  
      for(int j=0;j<=i;j++)
       {
       System.out.print("*" + ((j == i) ? "\n" : " "));
      }
     }
    for(int l=1;l<nu;l++)
    {
      for(int m=0;m<=l;m++)
      {
        System.out.print("-");
      }
      for(int n=l;n<nu;n++)
      {
        System.out.print("*" +((n==nu-1) ? "\n" : " "));
      }
    }
  }
}
