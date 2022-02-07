import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {

    int[] upperInts=new int[1000];
    int[] lowerInts=new int[1000];
    int[] mixedLetInts=new int[1000];
    int[] mixedLetNumInts=new int[1000];
    int[] allCharsInts=new int[1000];
    
    //lowercase password
    File lowerTxt=new File("Lower.txt");
    PrintWriter outFile = new PrintWriter(lowerTxt);
    for(int i=0;i<1000;i++)
      {
        outFile.print((int)(Math.random()*26)+97);
        outFile.print(",");
      }
    outFile.close();
    //reading
    Scanner inputFile1=new Scanner(lowerTxt).useDelimiter(",");
    while(inputFile1.hasNext())
    {
      for(int i=0;i<1000;i++)
      {
        lowerInts[i]=inputFile1.nextInt();
      }
    }
    inputFile1.close();
    
    //uppercase letters
    File upperTxt=new File("Upper.txt");
    PrintWriter outFile2 = new PrintWriter(upperTxt);
    for(int i=0;i<1000;i++)
      {
        outFile2.print((int)(Math.random()*26)+65);
        outFile2.print(",");
      }
    outFile2.close();
    //reading
    Scanner inputFile2=new Scanner(upperTxt).useDelimiter(",");
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

    //to characters
    char[] upper=new char[1000];
    for(int temp:upperInts)
      {
        upper[temp]=(char)temp;
      }
    char[] lower=new char[1000];
    for(int temp:lowerInts)
      {
        lower[temp]=(char)temp;
      }
    char[] mixed=new char[1000];
    for(int temp:mixedLetInts)
      {
        mixed[temp]=(char)temp;
      }
    char[] mixedNum=new char[1000];
    for(int temp:mixedLetNumInts)
      {
        mixedNum[temp]=(char)temp;
      }
    char[] allChars=new char[1000];
    for(int temp:allCharsInts)
      {
        allChars[temp]=(char)temp;
      }


    System.out.println("Welcome to the password generator, would you like: \n\n1. All lowercase\n2. All uppercase\n3. Uppercase and lowercase\n4. Uppercase, lowercase, and numbers\n5. Uppercase, lowercase, numbers, and symbols\n0. Exit\n\nPlease enter 1, 2, 3, 4, 5, or 0 to leave.");
    Scanner it=new Scanner(System.in);
    int put=it.nextInt();
    while(put==1)
    {
      //upperpw
    File upperPass=new File("Upperpw.txt");
    PrintWriter outUpPw = new PrintWriter(upperPass);
    int count=0;
    for(int i:upperInts)
    {
      outUpPw.print((char)i);
      count++;
      if(count==8)
      {
        outUpPw.println();
        count=0;
      }
    }
    outUpPw.close();
    System.out.println("Would you like another?\nPress 1,2,3,4,5, or 0 to leave.");
    put=it.nextInt();
    } 


    while (put==2)
    {
      //lowerpw
    File lowerPass=new File("Lowerpw.txt");
    PrintWriter outLoPw = new PrintWriter(lowerPass);
    int count=0;
    for(int i:lowerInts)
    {
      outLoPw.print((char)i);
      count++;
      if(count==8)
      {
        outLoPw.println();
        count=0;
      }
    }
    outLoPw.close();
    System.out.println("Would you like another?\nPress 1,2,3,4,5, or 0 to leave.");
    put=it.nextInt();
    }  


    while(put==3)
    {
      //mixed letterpw
    File mixedPass=new File("Mixedpw.txt");
    PrintWriter outMiPw = new PrintWriter(mixedPass);
    int count=0;
    for(int i:mixedLetInts)
    {
      outMiPw.print((char)i);
      count++;
      if(count==8)
      {
        outMiPw.println();
        count=0;
      }
    }
    outMiPw.close();
    System.out.println("Would you like another?\nPress 1,2,3,4,5, or 0 to leave.");
    put=it.nextInt();
    } 
    
    while(put==4)
    {
      //mixed numpw
    File mixedNumPass=new File("MixedNumpw.txt");
    PrintWriter outMiNuPw = new PrintWriter(mixedNumPass);
    int count=0;
    for(int i:mixedLetNumInts)
    {
      outMiNuPw.print((char)i);
      count++;
      if(count==8)
      {
        outMiNuPw.println();
        count=0;
      }
    }
    outMiNuPw.close();
    System.out.println("Would you like another?\nPress 1,2,3,4,5, or 0 to leave.");
    put=it.nextInt();
    } 

    while(put==5)
    {
      //all charspw
    File allPass=new File("AllCharspw.txt");
    PrintWriter outAllPw = new PrintWriter(allPass);
    int count=0;
    for(int i:allCharsInts)
    {
      outAllPw.print((char)i);
      count++;
      if(count==8)
      {
        outAllPw.println();
        count=0;
      }
    }
    outAllPw.close();
    System.out.println("Would you like another?\nPress 1,2,3,4,5, or 0 to leave.");
    put=it.nextInt();
    } 
    if(put==0) 
    {
      System.out.println("\nGoodbye!");
    }


  }
}