import java.util.*;
public class MovieTestDrive {
    public static void main(String args[])
    {
  Scanner s=new Scanner(System.in);
  Movie [] M=new Movie[3];
  M[0]=new Movie();
  M[1]=new Movie();
  M[2]=new Movie("filem","action",50);
  for(int i=0;i<3;i++)
  {
      M[i].pringInfo();
      M[i].playIt();
  }
  String t,g;
  int r;
  for(int i=0;i<3;i++)
  {
      System.out.print("enter the title of element["+i+"]:");
      t=s.nextLine();
      M[i].setTitle(t);
      System.out.print("enter the genre of element["+i+"]:");
      g=s.nextLine();
      M[i].setgenre(g);
      System.out.print("enter the rating of element["+i+"]:");
      r=s.nextInt();
      M[i].setrating(r);
      s.nextLine();
      M[i].pringInfo();
  }
    }
}
