package CoreJava;


import java.util.regex.*;
public class RegularExp {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("as");
        boolean b = m.matches();

        //another way
        boolean d = Pattern.compile("rohan").matcher("rohan").matches();
        System.out.println(b);
        System.out.println(d);
        System.out.println(Pattern.matches("[abc]?","a"));
    }


}

/*
java.util.regex package provides following classes and interfaces for regular expressions.
1 MatchResult interface
2 Matcher class
3 Pattern class
4 PatternSyntaxException class

* Matcher class implements the MatchResult interface for match operations

No.	Character Class	Description
1	[abc]	a, b, or c (simple class)
2	[^abc]	Any character except a, b, or c (negation)
3	[a-zA-Z]	a through z or A through Z, inclusive (range)
4	[a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
5	[a-z&&[def]]	d, e, or f (intersection)
6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
7	[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)
 */
