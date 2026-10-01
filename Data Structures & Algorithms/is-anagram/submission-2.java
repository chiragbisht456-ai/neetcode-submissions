class Solution{
    public boolean isAnagram( String s , String t ){
        if ( s.length()!= t.length()){
            return false ;
        } 

        char[] sss = s.toCharArray();
        char[] ttt = t.toCharArray();
         

    Arrays.sort( sss);
    Arrays.sort( ttt) ;
    


 return Arrays.equals( sss, ttt);
 // so boolean will return  a true value


   

    }
}
