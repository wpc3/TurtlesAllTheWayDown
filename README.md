# TurtlesAllTheWayDown
recursion for zipcoders

It's turtles all the way down. Recursion is a key idea in computer software, 
and is generally despised in production software. Nonetheless, you need to know it when you see it,
and potentially talk your way around it in interviews.

It is very, very cool though.

First, read much of the contents of this page: [Recursion in Java](https://introcs.cs.princeton.edu/java/23recursion/)
Skip over the `Gray code` stuff, but read down to where the Exercises (6 and up) start.

Then:

Build out a factorial class and some tests.

Build out a GCD class and some tests.

Compare GCD and GCD2 to each other using timing statements. 

*Remember how to do timing in Java?*

Use the Instant Class

The Instant class represents an instant on the timeline. Basically, it is a numeric timestamp since the standard Java 
epoch of 1970-01-01T00:00:00Z.

In order to get the current timestamp, we can use the Instant.now() static method. This method allows passing in an 
optional Clock parameter. If omitted, it uses the system clock in the default time zone.

We can store start and finish times in two variables, as in previous examples. 
Next, we can calculate time elapsed between both instants.

We can additionally use the Duration class and it's between() method to obtain the duration between 
two Instant objects. Finally, we need to convert Duration to milliseconds:

```java
Instant start = Instant.now();
// CODE to be timed goes HERE        
Instant finish = Instant.now();
long timeElapsed = Duration.between(start, finish).toMillis();
```

### For an extra Ten Million points...

If you're up to it, Do a Longest Common subsequence algorithm. Implement the one in the princeton text.

 *Longest common subsequence problem.* 
 
 Given two strings x and y, we wish to compute their (LCS). 
 If we delete some characters from x and some characters from y, and the resulting two strings are 
 equal, we call the resulting string a common subsequence. The LCS problem is to find a common subsequence 
 of two strings that is as long as possible. For example, the LCS of GGCACCACG and ACGGCGGATACG 
 is GGCAACG, a string of length 7.
 
 `- - G G C - - A - C C A C G
  A C G G C G G A T - - A C G`
  
  *Longest common subsequence recurrence.*
  
  Now we describe a recursive formulation that enables us to find the LCS of two given strings s and t. 
  Let m and n be the lengths of s and t, respectively. We use the notation s[i..m) to denote the suffix of s starting 
  at index i, and t[j..n) to denote the suffix of t starting at index j.
  - If s and t begin with the same character, then the LCS of s and t contains that first character. 
  Thus, our problem to reduces to finding the LCS of the suffixes s[1..m) and t[1..n).
  - If s and t begin with different characters, both characters cannot be part of a common subsequence, 
  so can safely discard one or the other. In either case, the problem reduces to finding the LCS of two 
  strings—either s[0..m) and t[1..n) or s[1..m) and t[0..n).
  
  In general, if we let opt[i][j] denote the length of the LCS of the suffixes s[i..m) and t[j..n), then the 
  following recurrence holds:
  
  
```
  opt[i][j] = 0                              if i = m or j = n
            = opt[i+1][j+1] + 1              if s[i] = t[j]
            = max(opt[i][j+1], opt[i+1][j])  otherwise
 ```
 
 Test with 
 
 S1 = GGCACCACG 
 S2 = ACGGCGGATACG
 
 should be GGCAACG
 
 and 
 
 S1 = GCCCTAGCG
 S2 = GCGCAATG
