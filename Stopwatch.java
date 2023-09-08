import java.util.*;
class Time{
    private long n;
    private long y;
    private double k;
    public  void setStart(long n){
    this.n = System.currentTimeMillis();
}
 public void setStop(long y){
    this.y = System.currentTimeMillis();

}
public void getStart(){
    System.out.println(n);
}
public void getStop(){
    System.out.println(y);
}
public void getElapsedTime(){
    this.k = (double)(y - n)/1000;
    System.out.println("Your Time is:" +k+'s');
}
}
public class Stopwatch {
 
 public static void main(String[] args) {
Scanner s = new Scanner(System.in);
Time t = new Time();       
System.out.println("Enter a any number for start a stop-watch:");
        int a = s.nextInt();
         t.setStart(a);
         t.getStart();
System.out.println("Enter a any number for stop a stop-watch:");
        int e = s.nextInt();  
         t.setStop(e);
         t.getStop();
         t.getElapsedTime();
}
}
