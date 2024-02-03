class ArrayTwo
{
    public static void main(String args[])
    {
        System.out.println("Array2 Problems in Coding Bat");
    }

    public int countEvens(int[] nums) 
    {
    int i = 0;
    int count = 0;
    for (; i < nums.length; i ++)
    {
        if (nums[i] % 2 == 0)
        {
        count ++;
        }
    }
    return count;
    }

}