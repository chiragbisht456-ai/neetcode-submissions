class Solution{
    public int [] productExceptSelf( int [] nums){

        int n = nums.length ;
        int [] list = new int[nums.length];
    // prefix

    int prefix =1 ;
    for ( int i =0 ; i< nums.length; i++){
        list[i]= prefix;
        prefix*=nums[i];

    }
    int suffix =1 ;
    for( int j = n-1 ; j >= 0 ; j--){
        list[j]*= suffix;
        suffix*= nums[j];
    }

    return list ;

    }
}