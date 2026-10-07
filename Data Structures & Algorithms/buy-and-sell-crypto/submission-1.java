class Solution {
    public int maxProfit(int[] prices) {

int max =0 ;
int left= 0 ;
          for ( int right =1; right< prices.length;right++){

            if ( prices[right]>prices[left]){
                int profit = prices[right]- prices[left];
                max = Math.max( max , profit);
            }
            else {
                left = right;
    }
          }   

return max;

    }
}
     