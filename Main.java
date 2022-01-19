import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {

    int[] upperInts=new int[1000];
    int[] lowerInts=new int[1000];
    int[] mixedLetInts=new int[1000];
    int[] mixedLetNumInts=new int[1000];
    int[] allCharsInts=new int[1000];

    //Create five different character arrays. Use the names given below. Populate each char array using the appropriate integer array and create characters based on those values. You must use a loop to do this. Note: char upperA=(char)65;
    char[] upperWhat=new char[25];
    for()

    //lowercase password
    File lower=new File("Lower.txt");
    PrintWriter outFile = new PrintWriter(lower);
    for(int i=0;i<1000;i++)
      {
        outFile.print((int)(Math.random()*26)+97);
        outFile.print(",");
      }
    outFile.close();
    //reading
    Scanner inputFile1=new Scanner(lower).useDelimiter(",");
    while(inputFile1.hasNext())
    {
      for(int i=0;i<1000;i++)
      {
        lowerInts[i]=inputFile1.nextInt();
      }
    }
    inputFile1.close();

    //uppercase letters
    File upper=new File("Upper.txt");
    PrintWriter outFile2 = new PrintWriter(upper);
    for(int i=0;i<1000;i++)
      {
        outFile2.print((int)(Math.random()*26)+65);
        outFile2.print(",");
      }
    outFile2.close();
    //reading
    Scanner inputFile2=new Scanner(upper).useDelimiter(",");
    while(inputFile2.hasNext())
    {
      for(int i=0;i<1000;i++)
      {
        upperInts[i]=inputFile2.nextInt();
      }
    }
    inputFile2.close();

    //upper and lower case letters
    int mix1;
    File mixed_letters=new File("Mixed_letters.txt");
    PrintWriter outFile3 = new PrintWriter(mixed_letters);
    for(int i=0;i<1000;i++)
      {
        mix1=(int)(Math.random()*2)+1;
        if(mix1==1)
        {
          outFile3.print((int)(Math.random()*26)+65);
        } else {
          outFile3.print((int)(Math.random()*26)+97);
        }
        outFile3.print(",");
      }
    outFile3.close();
    //reading
    Scanner inputFile3=new Scanner(mixed_letters).useDelimiter(",");
    while(inputFile3.hasNext())
    {
      for(int i=0;i<1000;i++)
      {
        mixedLetInts[i]=inputFile3.nextInt();
      }
    }
    inputFile3.close();

    //upper, lower, plus numbers
    int mix2;
    File mixed_letters_numbers=new File("Mixed_letters_numbers.txt");
    PrintWriter outFile4 = new PrintWriter(mixed_letters_numbers);
    for(int i=0;i<1000;i++)
      {
        mix2=(int)(Math.random()*3)+1;
        if(mix2==1)
        {
          outFile4.print((int)(Math.random()*26)+65);
        } else if(mix2==2)
        {
          outFile4.print((int)(Math.random()*26)+97);
        } else {
          outFile4.print((int)(Math.random()*10)+48);
        }
        outFile4.print(",");
      }
    outFile4.close();
    //reading
    Scanner inputFile4=new Scanner(mixed_letters_numbers).useDelimiter(",");
    while(inputFile4.hasNext())
    {
      for(int i=0;i<1000;i++)
      {
        mixedLetNumInts[i]=inputFile4.nextInt();
      }
    }
    inputFile4.close();

    //upper, lower, plus chars whose integer values range from 33-47, 58-64, 91-96, and 123-126
    File mixed_chars=new File("Mixed_chars.txt");
    PrintWriter outFile5 = new PrintWriter(mixed_chars);
    for(int i=0;i<1000;i++)
      {
        outFile5.print((int)(Math.random()*94)+33);
        outFile5.print(",");
      }
    outFile5.close();
    //reading
    Scanner inputFile5=new Scanner(mixed_chars).useDelimiter(",");
    while(inputFile5.hasNext())
    {
      for(int i=0;i<1000;i++)
      {
        allCharsInts[i]=inputFile5.nextInt();
      }
    }
    inputFile5.close();

  }
}