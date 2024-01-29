public class CodingBatWarmupOne
{
    public boolean sleepIn(boolean weekday, boolean vacation) 
    {
        return (!weekday || vacation);
    }
    
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) 
    {
        return (aSmile && bSmile || !aSmile && !bSmile);    
    }
    
    public int sumDouble(int a, int b) 
    {
    if (a == b)
        {
        return 2 * (a + b);
        }
    return a + b;
    }
    
    public int diff21(int n) 
    {
    if (n > 21)
    {
        return 2 * Math.abs(n - 21);
    }
    return Math.abs(n - 21);
    }
    
    public boolean parrotTrouble(boolean talking, int hour)
    {
        return (talking && hour < 7 || talking && hour > 20); 
    }

    public boolean makes10(int a, int b) 
    {
        return ((a == 10 || b == 10) || (a + b == 10));
    }

    public boolean nearHundred(int n) 
    {
        return (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10);
    }

    public boolean posNeg(int a, int b, boolean negative) 
    {
    if (negative)
    {
        return (a < 0 && b < 0);
    }
    return ((a < 0 && b > 0) || (a > 0 && b < 0));
    }

    public String notString(String str) 
    {
    if (str.length() >= 3 && str.substring(0, 3).equals("not"))
    {
        return (str);
    }
    return "not " + str;
    }

    public String missingChar(String str, int n) 
    {
        return str.substring(0, n) + str.substring(n + 1); 
    }

    public String frontBack(String str) 
    {
    if (str.length() == 0 || str.length() == 1)
        {
            return (str);
        }
    return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }

    public String front3(String str) 
    {
    if (str.length() < 3)
    {
        return (str + str + str);
    }
    return (str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3));
    }
    // Should look into a better way for repeating strings.
    // Maybe with looping or the .repeat() method. 

    public String backAround(String str) 
    {
        return (str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1));
    }

    public boolean or35(int n)
    {
        return (n % 3 == 0 || n % 5 == 0);
    }

    public String front22(String str)
    {
        if (str.length() <= 2)
    {
            return (str + str + str);
    }
        return (str.substring(0,2) + str + str.substring(0,2));
    }

    public boolean startHi(String str)
    {
        if (str.length() < 2)
    {
            return false;
    }
        return (str.substring(0,2).equals("hi"));
    }

    //We use .equals() method because that compares the contents within
    //the string instead of just checking whether or not the two 
    //strings refer to the same object in memory using the 
    //comparison '=='. 

    public boolean icyHot(int temp1, int temp2) 
    {
        return ((temp1 < 0 && temp2 > 100)
                || (temp1 > 100 && temp2 < 0));
    }

    public boolean in1020(int a, int b) 
    {
        return (a >= 10 && a <= 20 || b >= 10 && b <= 20); 
    }

    public boolean hasTeen(int a, int b, int c) 
    {
        return (a >= 13 && a <= 19 || b >= 13 && b <=19 || 
                c >= 13 && c <= 19);  
    }


}
