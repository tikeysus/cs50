class StringTwo 
{
    public static void main(String args[])
    {
        System.out.println("These are various 
        solutions to problems involving Strings in 
        Coding bat");
    }

    public String doubleChar(String str) 
    {
        StringBuilder newString = new StringBuilder("");
    
        for (int i = 0; i < str.length(); i ++)
        {
            newString.append(str.charAt(i));
            newString.append(str.charAt(i)); 
        }
        return newString.toString(); 
    }

    public int countHi(String str) 
    {
    int count = 0;
    int i = 0;
        for (; i < str.length() - 1; i ++)
        {
        if ((str.substring(i, i + 2)).equals("hi"))
            {
            count ++;
            }
    }
        return (count);
    }

    public boolean catDog(String str) 
    {
    int dog = 0;
    int cat = 0;
    int i = 0;
    for (; i < str.length() - 2; i ++)
    {
    if (str.substring(i, i + 3).equals("cat"))
        {
        cat ++;
        }
    else if (str.substring(i, i + 3).equals("dog"))
        {
        dog ++;
        }
    }
    return cat == dog; 
    }

    public int countCode(String str) 
    {
    int count = 0;
    int i = 0; 
    for (; i < str.length() - 3; i ++)
    {
    if ((str.substring(i, i + 2) + str.charAt(i + 3)).equals("coe"))
        {
        count ++;
        }
    }
    return count; 
    }

    public boolean endOther(String a, String b) 
    {
    int alen = a.length();
    int blen = b.length();
    String alo = a.toLowerCase();
    String blo = b.toLowerCase();
    if (alen < blen)
    {
        String bsub = blo.substring(blen - alen, blen);
        return (alo.equals(bsub));
    }
    else
    {
        String asub = alo.substring(alen - blen, alen);
        return (blo.equals(asub));
    }
    }
    //A bit ugly with the amount of variables, but it helped
    //simplify the code. 

    public boolean xyzThere(String str) 
    {
    int i = 0;
    for (; i < str.length() - 2; i ++)
    {
    if (str.substring(i, i + 3).equals("xyz"))
        {
        if (i == 0 && str.substring(0, 3).equals("xyz"))
        {
            return true;
        }
    else if (str.substring(i, i + 3).equals("xyz") && str.charAt(i - 1) != '.')
        {
        return true; 
        }
        }
    }
    return false; 
    }
    //If you thought the last one was ugly, wait till you see this. 

    public boolean bobThere(String str)
    {
    int i = 0;
    for (;i < str.length() - 2; i ++) 
    {
        if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
        {
            return true;
        }
    }
    return false; 
    }

    public String mixString(String a, String b)
    { 
    String str = "";
    int i = 0;
    if (a.length() > b.length())
    {
        for (; i < b.length(); i ++)
        {
        str += (a.charAt(i));
        str += (b.charAt(i));
        }
        str += a.substring(i, a.length());
    }
    else
    {
        for (; i < a.length(); i ++)
        {
        str += (a.charAt(i));
        str += (b.charAt(i));
        }
    str += (b.substring(i, b.length()));
    }
    return str;
    }

    public String repeatFront(String str, int n) 
    {
    String empty = "";
    int i = n;
    for (; i > 0; i --)
    {
        empty += str.substring(0, i);
    }
    return empty; 
    }

    public String repeatSeparator(String word, String sep, int count)
    {
    String empty = "";
    int i = 0;
    for (; i < count; i ++)
    {
        empty += word + sep;
    }
    return empty.substring(0, empty.length() - sep.length());
    }

    public String repeatEnd(String str, int n) 
    {
    String empty = "";
    int i = 0;
    for (; i < n; i ++)
    {
        empty += str.substring(str.length() - n, str.length());
    }
    return empty;
    }




}
