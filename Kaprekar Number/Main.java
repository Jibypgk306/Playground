import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner ss=new Scanner(System.in);
        int k,n,r,s,sum1,sum2,c,temp,l,sum,a;

 a=1;

 k=ss.nextInt();

 n = 0;

 sum1 = 0;

 sum2 = 0;

 temp = k;

 s = k*k;

 do{

++n;

temp=temp/ 10;

 }while(temp>0);
 for(c = 0; c < n; c++){

  r = s % 10;

  s = s/10;    

sum1 = sum1 + r*a;

a=a*10;

 }

 a=1;

 while(s>0){

  r = s %10;

  s = s/10;

sum2 = sum2 +r*a;

a=a*10;

 }

 sum  = sum1 + sum2;

 if(sum == k){

  System.out.println("Kaprekar Number");  

 }

 else{

 System.out.println("Not a Kaprekar Number");

 }  

}


}