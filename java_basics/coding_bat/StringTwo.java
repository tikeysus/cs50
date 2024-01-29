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


}
