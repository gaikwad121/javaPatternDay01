package com.Java;

public class PatternCode {
public static void main(String[] args) {
//	SquarePattern(4);
	starPattern(4);
	CharPattern(4);
	pattern(3);
	TringlePattern(4);
}
/*Square pattern 

Easy with numbers n=4

1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4*/
/*
static void SquarePattern(int n) {
	for(int i=1;i<=n;i++) {
	for(int j=1;j<=n;j++) {
	System.out.print(j+" ");
	}
	System.out.println();
	}
	
}
/* Square pattern
****
****
****
****
 */
static void starPattern(int n) {
	for(int i=1;i<=n;i++) {
	for(int j=1;j<=n;j++) {
	System.out.print("*");
	}
	System.out.println();
	}}
/*
 * A B C D
 * A B C D
 * A B C D
 * A B C D
 * 
 */
static void CharPattern(int n) {
	
	for(int i=0;i<n;i++) {
	char ch='A';
	for(int j=0;j<n;j++) {
	System.out.print(ch);
	ch++;
	}
	System.out.println();
	}
}
/*
1 2 3
4 5 6
7 8 9
 */
static void pattern(int n) {
	int count=1;
for(int i=0;i<n;i++) {
for(int j=0;j<n;j++) {
	System.out.print(count+" ");
	count++;
}
System.out.println();
}
}
/*
 
*
**
***
****
 */
static void TringlePattern(int n) {
for(int i=0;i<n;i++) {
for(int j=0;j<=i;j++) {
System.out.print("*");
}
System.out.println();
}
}
}



























