package javaBasics;
import java.util.*;

public class javaBasics {
    public static void main(String args[]) {

        // 1.// printHelloworld();

        // 2. addition of two numbers using functions
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b= sc.nextInt();
        // int sum = calculateSum(a, b); //arguments or actual parameters
        // System.out.println("sum is "+sum);

        // 3. swap of two numbers

        // int a = 5;
        // int b = 10;

        // swap(a, b);

        // 4. product of two numbers
        // int a = 3;
        // int b =5 ;
        // int product =multiply(a, b);
        // System.out.println("a*b ="+product);
        // product = multiply(10 ,20);
        // System.out.println(" a*b=" +product);

        // 5. factorial of number , n
        // factorial(3);
        // System.out.println(factorial(3));

        // 6. bionomial coefficient
        // System.out.println(binCoeff(5,2 ));

        // 7. funtion overloading with parameter
        // System.out.println(sum(3, 4, 5));
        // System.out.println(sum(8,9 ));

        // 8. function overloading with datatype
        // System.out.println(sum(3, 5));
        // System.out.println(sum(3.2f, 4.8f));

        // 9. check number is prime or not using function

        // System.out.println(isPrime(12));

        // 10. primeInRange
        // primeInRange(1000); // 2 to 20 ;

        // 11. binary to decimal coversions

        // binToDec(1000);
        // decToBin(7);

        // 12. hollow_rectangle
        // hollow_rectangle(4, 5);

        // 13. inverted_rotated_half_pyramid
        // inverted_rotated_half_pyramid(4);

        // 14. inverted_rotated_half_pyramid_withNumbers
        // inverted_rotated_half_pyramid_withNumbers(5);

        // 15. floyds_triangle
        // floyds_triangle(5);

        // 16. zero_one_triangle
        // zero_one_triangle(5);

        // 17. butterfly_pattern
        // butterfly_pattern(1000);

        // 18.solid_Rhombus
        // solid_Rhombus(5);
        // 19.hollow_rhombus
        // hollow_rhombus(5);
        // 20. Diamond_pattern
        // Diamond_pattern(1000);

        // --------- printing statements-----------
        // System.out.print("Hello World\n");
        // System.out.print("Hello World\n");
        // System.out.print("Hello World\n ");

        // System.out.println("Hello World \n Hello \n Wolrd");

        // --------------print Trangle -------------
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // -----------------Variable----------

        // int a = 10;
        // int b = 5;

        // System.out.println(a);
        // System.out.println(b);

        // String name = "Tony Stark";
        // System.out.println(name);

        // a =50;
        // System.out.println(a);

        // a=b;

        // System.out.println(a);

        // ------------------Data type in java ---------------
        // 1.primitive - byte, short , char , boolean, int , long , float, double
        // 2. Non primitive - String , array , class , object , interface

        // byte b = 8 ;
        // System.out.println(b);
        // char ch = 'a';
        // System.out.println(ch);
        // boolean var = false ;
        // System.out.println(var);
        // double p = 10.5;
        // System.out.println(p);
        // int number = 25;
        // System.out.println(number);

        // short n = 240;
        // System.out.println(n);

        // --------------addition in java --------------

        // int a = 10;
        // int b = 5;

        // int sum = a+b;
        // System.out.println(sum);

        // ------------------input in java --------------------
        // mainly ised Input in java -- next --> string , nextLine --> full string ,
        // nextInt --> integer
        // Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);

        // String name = sc.nextLine();
        // System.out.println(name);

        // int number = sc.nextInt();
        // System.out.println(number);

        // float price = sc.nextFloat();
        // System.out.println(price);

        // sc.close();

        // sum of two numbers through user input
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the value of a ");
        // int a = sc.nextInt();
        // System.out.println("enter the value of b ");
        // int b = sc.nextInt();

        // int sum = a+b;
        // System.out.println("sum of a an b ");
        // System.out.println(sum);

        // ---------------product of a and b -----------------

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int product= a*b;
        // System.out.println(product);

        // ------------area of circle --------------

        // Scanner sc = new Scanner(System.in);
        // float rad = sc.nextFloat();
        // double area = 3.14f*rad*rad;
        // System.out.println(area);
        // sc.close();

        // -----------------TypeCating in java ----------------

        // int a = 25 ;
        // long b = a;

        // long a = 25;
        // int b = a;

        // System.out.println(b);

        // Scanner sc = new Scanner(System.in);
        // float number = sc.nextFloat();
        // System.out.println(number);

        // Scanner sc = new Scanner(System.in);
        // float a = 25.9999f;
        // int b = (int) a;
        // System.out.println(b);
        // sc.close();

        // float marks =99.999f;
        // int marks2 = (int) marks;
        // System.out.println(marks2);

        // ---------------------------type promption -----------------------

        // char a = 'a';
        // char b = 'b';
        // char c = a-b;
        // System.out.println((int)(b));
        // System.out.println((int)(a));
        // System.out.println(b-a);
        // System.out.println(a);

        // short a = 5;
        // byte b= 25;
        // char c= 'c';
        // byte bt =(byte) (a + b + c);
        // System.out.println(bt);

        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30;

        // double ans = a + b + c + d;
        // System.out.println(ans);

        // byte b = 5;
        // byte a =(byte) (b*2);
        // System.out.println(a);

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int avg = (a + b + c)/3;
        // System.out.println("average is " +avg);

        // Scanner sc = new Scanner(System.in);
        // int side = sc.nextInt();

        // int area = side*side;
        // System.out.println(area);

        // Scanner sc = new Scanner(System.in);
        // float pencil = sc.nextInt();
        // float pen = sc.nextInt();
        // float eraser = sc.nextInt();

        // float cost = (pencil + pen + eraser)*18/100 ;
        // System.out.println(cost);

        // int $ = 24;

        // byte b = 4;
        // char c = 'a';
        // short s = 512;
        // int i = 1000;
        // float f = 3.14f;
        // double d = 99.9954;

        // double result =(f*b) + (i%c) - (d*s);
        // System.out.println(result);

        // -------------operator in java ------------

        // 1. Arithmetic operator --- binary or unary

        // A+B = binary , A++ == unary

        // 1. Arithmetic operator

        // int a = 10;
        // int b = 5;
        // System.out.println(a+b);
        // System.out.println(a-b);
        // System.out.println(a*b);
        // System.out.println(a/b);
        // System.out.println(a%b);

        // 2. UnaryOperator --> increment and decrement
        // increment ---> pre- increment , post increment
        // Decrement ---> pre decrement , post decrement

        // int a = 10 ;
        // // int b = --a;
        // int b = a--;

        // System.out.println(a);
        // System.out.println(b);

        // 3.Relational operator

        // int a = 10;
        // int b = 10;
        // System.out.println(a==b);
        // System.out.println(a!=b);
        // System.out.println(a>b);
        // System.out.println(a<b);
        // System.out.println(a>=b);
        // System.out.println(a<=b);

        // 4. logical operator
        // System.out.println((3>4) && (5>0));
        // System.out.println((3>4) || (5>0));
        // System.out.println(!(3>4));

        // 5.Assignment operator

        // int a = 10;
        // a+=10;

        // int b =5 ;
        // b*=5;

        // System.out.println(a);
        // System.out.println(b);

        // -----------------if conditional statements-------------
        // Scanner sc = new Scanner(System.in);
        // int age = age.nextInt();

        // int age = 19;
        // if(age>=18)
        // {
        // System.out.println("adult : drive , vote ");

        // }

        // if (age>13 && age < 18){
        // System.out.println("teenager");
        // }
        // else {
        // System.out.println("not adult ");
        // }

        // ------------questions based on these above analysis-------

        // 1. Print the largest of 2 Numbers

        // int a = 6;
        // int b = 2;

        // if (a>=b)
        // {
        // System.out.println("A is largest of 2 ");
        // }
        // else {
        // System.out.println("B is largest of 2");
        // }

        // ---------print if a number is odd or even----------------

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your To");
        // int number = sc.nextInt();

        // if (number%2==0)
        // {
        // System.out.println("Even");
        // }else
        // {
        // System.out.println("odd");
        // }

        // -----------else if statements ---------------

        // int a = 6;

        // if (a >= 5)
        // {
        // System.out.println(" i like The way talk");
        // }
        // else if (a <= 8)
        // {
        // System.out.println(" i like The way walk");
        // }
        // else if (a <= 6 && a== 6)
        // {
        // System.out.println(" i like The way dance");
        // }

        // else {
        // System.out.println("get lost");
        // }

        // ----------Income tax calculators----------------------

        // Scanner sc = new Scanner(System.in) ;
        // int income = sc.nextInt();
        // int tax;
        // if (income < 500000) {
        // tax = 0;
        // } else if (income >= 500000 && income < 100000) {
        // tax = (int) (income * 0.2);
        // } else {
        // tax = (int) (income * 0.3);
        // }

        // System.out.println("Your tax is: " + tax);

        // --------------prtint the largest of 3 numbers-------------

        // int a = 1;
        // int b = 8;
        // int c = 78987;

        // if ((a>=b) && (a>=c)){
        // System.out.println(" A is largest");
        // }
        // else if (b>=c){
        // System.out.println(" B is largest");
        // }
        // else{
        // System.out.println("C is largest");
        // }

        // ----------------Ternary opeartor-----------

        // int Number = (int )4646435.41;

        // //ternary
        // String type = ((Number%2)==0) ? "even" : "odd";

        // System.out.println(type);

        // ---------------check student will pass or fail------------------
        // int marks = 67;

        // String rc = marks>=33? "pass" : " fail";

        // System.out.println(rc);

        // ------------switch statements --------------------

        // char ch='a';
        // switch(ch){
        // case 'd' : System.out.println("samosa");
        // case 'a' : System.out.println("burger");
        // break;
        // case 'c' : System.out.println("mango shake ");
        // break;
        // default : System.out.println("we wake up ");
        // }

        // --------------calculator using switch case--------

        // Scanner sc = new Scanner( System.in);
        // System.out.println("enter a = ");
        // int a = sc.nextInt();
        // System.out.println("enter b = ");
        // int b = sc.nextInt();
        // System.out.println("enter your operator");
        // char opeartor = sc.next().charAt(0);

        // switch(opeartor)
        // {
        // case '+' : System.out.println(a+b);
        // break;
        // case '-' : System.out.println(a-b);
        // break;
        // case '*' : System.out.println(a*b);
        // break;
        // case '/' : System.out.println(a/b);
        // break;
        // case '%' : System.out.println(a%b);
        // break;
        // default : System.out.println("enter correct operator");

        // }

        // --------------- check Number Is Positive and negative -----------

        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();

        // if (number>0){
        // System.out.println("The Entered Number Is Positive Num");
        // }
        // else
        // {
        // System.out.println("The enter number is negative");
        // }

        // ---------------loops chapter -------------------

        // 1. while loops

        // int counter = 0;
        // while (counter<10)
        // {
        // System.out.println("Hello world");
        // counter++;
        // }

        // System.out.println("printer Hw 10x");

        // 1 to 10 using whilwe loops
        // int counter =1;
        // while(counter<=10){
        // System.out.println(counter);
        // counter++;

        // }

        // 1 to n using whilwe loops

        // Scanner sc = new Scanner(System.in);
        // int range = sc.nextInt();
        // int counter= 1 ;
        // while(counter<=range){
        // System.out.println(counter + "");
        // counter++;
        // }
        // System.out.println();

        // print sim of first n natural numbers

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;

        // int i = 1;
        // while(i <= n){
        // sum += i;
        // i++;

        // }

        // System.out.println("sum is :" + sum);

        // -----------for loop----------------

        // for( int i = 1; i<= 10; i++ )
        // {
        // System.out.println("Hello World");
        // }

        // --------squre pattern for loop ------------

        // for (int line = 1; line <= 4; line++)
        // {
        // System.out.println("****");
        // }

        // --------squre pattern while loop ------------
        // int line = 1;
        // while(line<=4){
        // System.out.println("****");
        // line++;
        // }

        // ---------------Reverse of number-------------
        // int n = 10899;

        // while(n>0){
        // int lasDigit = n%10;
        // System.out.print(lasDigit);
        // n = n / 10 ;
        // }

        // ----------Reverse the given integer ------------

        // int n = 10899;
        // int rev = 0;

        // while(n>0)
        // {
        // int lasDigit = n%10;
        // rev = (rev*10) + lasDigit;
        // n = n/10;
        // }

        // System.out.println(rev);

        // --------------Do while loops-----------------

        // int counter = 1;
        // do{
        // System.out.println("Hellow World");
        // counter++;

        // } while(counter<=10);

        // ----------------------break statements-----------

        // for (int i =1; i<=5 ; i++){
        // if(i==3){
        // break;

        // }
        // System.out.println(i);
        // }

        // System.out.println("i am out of the loop");

        // -------------------------keep entering nmbers till user enters a multple of
        // 10-------------------

        // Scanner sc = new Scanner(System.in);
        // do{
        // System.out.println("enter your number ");
        // int n = sc.nextInt();
        // if (n%10== 0){
        // break;
        // }
        // System.out.println(n);
        // } while(true);

        // --------continue statements---------------

        // for(int i = 1; i<=5; i++){
        // if (i==3 ){
        // continue;
        // }

        // System.out.println(i);
        // }

        // --------------------Display all numbers entered by user except multiples of
        // 10---------

        // Scanner sc = new Scanner(System.in );

        // do{
        // System.out.println("enter your number :");
        // int n = sc.nextInt();

        // if (n% 10 ==0){
        // continue;
        // }

        // System.out.printlnf("number was " +n);
        // } while (true);

        // ------------------check if a number is prime or not
        // --------------------------------

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // if(n==2)
        // {
        // System.out.println("number is prime");
        // }
        // else{

        // boolean isPrime = true;
        // for (int i = 2; i<=Math.sqrt(n); i++)
        // {
        // if (n%i == 0) // n is multiple of i
        // {
        // isPrime = false;
        // }
        // }

        // if (isPrime== true){
        // System.out.println("n is prime");

        // }
        // else {
        // System.out.println("n is not prime ");
        // }
        // }

        // ------------------------pattern with nested loop----------------
        // for (int line = 1; line <= 4; line++) {
        // for (int star = 1; star <= line; star++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // -------------------print inverted star pattern-----------------

        // int n = 4;
        // for (int line = 1; line <= n; line++) {
        // for (int star = 1; star <= n - line + 1; star++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // ------------half pyramid--------------------
        // int n = 4;

        // for (int line = 1; line <= n; ++line) {
        // for (int number = 1; number <= line; ++number) {
        // System.out.print(line + " ");
        // }
        // System.out.println();
        // }

        // ---------------print character pattern----------------------------

        // int n = 4;
        // char ch = 'A';
        // int line;

        // // outer loop
        // for (line = 1; line <= n; line++) {
        // // inner loop
        // for (int chars = 1; chars <= line; chars++) {
        // System.out.print(ch);
        // ch++;
        // }
        // System.out.println();
        // }

        // --------------------------functions & Method in java--------------------

    }
    // function no-1
    // public static void printHelloworld(){
    // System.out.println("Hello world");
    // System.out.println("Hello world");
    // System.out.println("Hello world");
    // System.out.println("Hello world");

    // function no-2
    // public static int calculateSum(int num1, int num2){ // parameters or formal
    // parameter
    // int sum= num1+num2;
    // return sum;
    // }

    // function no 3
    // public static void swap(int a , int b){
    // // swap
    // int temp = a;
    // a= b;
    // b= temp;

    // System.out.println(a= +a) ;
    // System.out.println(b= +b) ;
    // }

    // function no - > 4
    // public static int multiply(int a , int b){
    // int product = a*b;
    // return product;
    // }

    // function ->5
    // fdf

    // funtion -> 6
    // public static int binCoeff(int n , int r){
    // int fact_n = factorial(n);
    // int fact_r = factorial(r);
    // int fact_nmr = factorial(n-r);

    // int binCoeff = fact_n / (fact_r*fact_nmr);
    // return binCoeff;
    // }

    // funtion no -> 7

    // public static int sum(int a , int b ){
    // return a+b;
    // }
    // public static int sum(int a , int b , int c){
    // return a+b+c;
    // }

    // function->8
    // public static float sum(float a , float b){
    // return a+b;
    // }

    // funtion no- 8
    // public static boolean isPrime(int n ){

    // corner case
    // if (n==2){
    // return true;
    // }

    // boolean isPrime = true;
    // for(int i = 2; i<=n-1; i++){
    // if(n%i==0){
    // isPrime = false;
    // break;

    // }
    // }
    // return isPrime;
    // }

    // function -9
    // public static boolean isPrime(int n){
    // for(int i = 2; i<=Math.sqrt(n); i++ ){
    // if(n%i==0){
    // return false;
    // }
    // }
    // return true;
    // }

    // function -10{use isPrime to run this }
    // public static void primeInRange(int n ){
    // for (int i =2; i<=n; i++){
    // if (isPrime(i)){
    // System.out.println(i+"");
    // }
    // }
    // System.out.println();
    // }

    // // funtion no - 11
    // public static void binToDec(int binNum){
    // int myNum= binNum;
    // int pow = 0;
    // int decNum= 0;
    // while (binNum>0){
    // int lasDigit = binNum % 10;
    // decNum = decNum +(lasDigit*(int) Math.pow(2, pow));
    // pow++;
    // binNum = binNum/10;

    // }

    // System.out.println("decimal of "+myNum + " = " +decNum);
    // }

    // funtion-12
    // public static void decToBin(int n ){
    // int myNum = n;
    // int pow= 0;
    // int binNum = 0;

    // while(n>0){
    // int rem = n%2;
    // binNum = binNum + (rem*(int ) Math.pow(10,pow));
    // pow++;
    // n=n/2;
    // }
    // System.out.println("binary form of " +myNum + "=" +binNum);
    // }

    // ------------------------------------ Advance pattern
    // problem---------------------------

    // 1. Hollow Rectangle Pattern
//     public static void hollow_rectangle(int totRows, int totCols) {
//     // outer loop
//     for (int i = 1; i <= totRows; i++) {
//     for (int j = 1; j <= totCols; j++) {
//     if (i == 1 || i == totRows || j == 1 || j == totCols) {
//     System.out.print("*");
//     } else {
//     System.out.print(" ");
//     }
//     }
//     System.out.println();
// }
// }


    // 2. inverted rotated pyramid
    // public static void inverted_rotated_half_pyramid(int n){
    // // outer
    // for (int i = 1; i<=n; i ++){
    // for(int j=1; j<=n-1; j++){
    // System.out.print("");
    // }

    // // stars
    // for (int j = 1; j<=i; j++){
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // 3.inverted_rotated_half_pyramid_withNumbers
    // public static void inverted_rotated_half_pyramid_withNumbers(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i + 1; j++) {
    // System.out.print(j + " ");
    // }
    // System.out.println();
    // }
    // }

    // 4. floyd's Triangle
    // public static void floyds_triangle (int n ){
    // // outer loop
    // int counter = 1;
    // for (int i = 1; i<=n ; i++){
    // // inner loop - how many times will counter be printed
    // for (int j =1 ; j<=i ; j++)
    // {
    // System.out.print(counter + " ");
    // counter++;
    // }

    // System.out.println();
    // }
    // }

    // 5. zero_one_triangle
    // public static void zero_one_triangle(int n){
    // for (int i =1; i<=n ; i++){
    // for(int j =1; j<=i; j++){
    // if ((i+j)%2==0){
    // System.out.print("1");
    // }else{
    // System.out.print("0");
    // }
    // }

    // System.out.println();
    // }
    // }

    // // 5. butterfly_pattern
    // public static void butterfly_pattern(int n) {
    // // 1st half
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }

    // // spaces - 2*(n-i)
    // for (int j = 1; j <= 2 * (n - i); j++) {
    // System.out.print(" ");
    // }

    // // stars - i
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }

    // System.out.println(); // move to the next line
    // }

    // // 2nd half
    // for (int i = n; i >= 1; i--) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }

    // // spaces - 2*(n-i)
    // for (int j = 1; j <= 2 * (n - i); j++) {
    // System.out.print(" ");
    // }

    // // stars - i
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }

    // System.out.println(); // move to the next line
    // }
    // }

    // solid RHombus

    // public static void solid_Rhombus(int n) {
    // for (int i = 1; i <= n; i++) {
    // // spaces
    // for (int j = 1; j <= (n - i); j++) {
    // System.out.print(" ");
    // }

    // // stars
    // for (int j = 1; j <= n; j++) {
    // System.out.print("*");
    // }

    // System.out.println();
    // }
    // }

    // // hollow_rhombus
    public static void hollow_rhombus(int n) {
    for (int i = 1; i <= n; i++) {
    // spaces
    for (int j = 1; j <= (n - i); j++) {
    System.out.print(" ");
    }

    // // hollow rhombus
    // for (int j = 1; j <= n; j++) {
    // if (i == 1 || i == n || j == 1 || j == n) {
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }

    // System.out.println();
    // }
    // }

    // public static void Diamond_pattern(int n) {
    // // 1st half
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= (n - i); j++) {
    // System.out.print(" ");
    // }

    // // stars
    // for (int j = 1; j <= (2 * i) - 1; j++) {
    // System.out.print("*");
    // }

    // System.out.println();
    // }

    // // 2nd half
    // for (int i = n - 1; i >= 1; i--) {
    // for (int j = 1; j <= (n - i); j++) {
    // System.out.print(" ");
    // }

    // // stars
    // for (int j = 1; j <= (2 * i) - 1; j++) {
    // System.out.print("*");
    // }

    // System.out.println();
    // }
    // }
    }}}

// boilerplate code
