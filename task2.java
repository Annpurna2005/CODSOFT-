import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks according to subjects out of 100 :");
    int a,b,c,d,e, f;
    System.out.print("English : ");
    a=sc.nextInt();
    System.out.print("Maths : ");
    b=sc.nextInt();
    System.out.print("Science : ");
    c=sc.nextInt();
    System.out.print("Social studies : ");
    d=sc.nextInt();
    System.out.print("Hindi : ");
    e=sc.nextInt();
    System.out.print(" Other : ");
    f=sc.nextInt();
    int sum;
    double percentage;
    sum=a+b+c+d+e+f;
    percentage=sum/6.0;
    if(a>=33&&b>=33&&c>=33&&d>=33&&e>=33 && f>=33){
        System.out.println();
        System.out.println("Pass in every subject !! ");
        System.out.println();
    System.out.println(" Total marks :  "+ sum);
    System.out.println("percentage= "+percentage +" %");}
    else {
if (a<33)System.out.println("fail in english");
 if (b<33) System.out.println("fail in maths");
if (c<33) System.out.println("fail in science");
 if (d<33) System.out.println("fail in social science");
 if(e<33)System.out.println("fail in hindi");
 if(f<33)System.out.println("fail in other");
}
if (percentage >= 90) {
    System.out.println("Grade: A");
} else if (percentage >= 75) {
    System.out.println("Grade: B");
} else if (percentage >= 60) {
    System.out.println("Grade: C");
} else if (percentage >= 33) {
    System.out.println("Grade: D");
} else {
    System.out.println("Grade: F");
}

    }
}