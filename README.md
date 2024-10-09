# Minimum-Add-to-Make-Parentheses-Valid
**Two counters are used:** openParan to track unbalanced open parentheses '(', and closeParan to track unbalanced closing parentheses ')'.
**The method loops through each character in the input string s:**
If the character is '(', it increases the openParan count.
If the character is ')' and there are unmatched open parentheses (openParan > 0), it decreases openParan (indicating a valid match).
If there are no unmatched open parentheses, it increases the closeParan count, as this closing parenthesis is unmatched.
After the loop, the sum of openParan and closeParan gives the total number of parentheses that need to be added to make the string valid.
