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
}
