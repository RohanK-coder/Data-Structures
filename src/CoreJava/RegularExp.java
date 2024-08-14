package CoreJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("good",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("rohan is a good kid");

        if(matcher.find()){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }

    }
}

/*
1. First Pattern.compile(string) is used to pass a string that needs to be searched.
2. pattern.matcher(str) : this is the sentence that is to be check with the pattern specified.

|	Find a match for any one of the patterns separated by | as in: cat|dog|fish
.	Find just one instance of any character
^	Finds a match as the beginning of a string as in: ^Hello
$	Finds a match at the end of the string as in: World$
\d	Find a digit
\s	Find a whitespace character
\b	Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
\xxxx	Find the Unicode character specified by the hexadecimal number xxxx

Quantifiers define quantities:

Quantifier	Description
n+	Matches any string that contains at least one n
n*	Matches any string that contains zero or more occurrences of n
n?	Matches any string that contains zero or one occurrences of n
n{x}	Matches any string that contains a sequence of X n's
n{x,y}	Matches any string that contains a sequence of X to Y n's
n{x,}	Matches any string that contains a sequence of at least X n's
 */
