class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>seen = new HashSet<>();
        //Hashset is like a bag that cannot contain duplicate elements
        //In this case, our hashset is called seen

        //Looping through to do the comparison using the standard version
        for(int i = 0;i < nums.length; i++){
            int num = nums[i];
            if(seen.contains(num)){//if you have seen the number before...
               return true;
            } else {
                seen.add(num);//if not then just add to cart
            } 
        }
        return false;
      
    }
}