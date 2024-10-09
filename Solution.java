class Solution {
    public int minAddToMakeValid(String s) {
        int openParan=0;
        int closeParan=0;
        for(char ch:s.toCharArray()){
            if(ch=='(')
            openParan++;
            else if(ch==')' && openParan>0)
            openParan--;
            else
            closeParan++;
        }
        return closeParan+openParan;
    }
}
