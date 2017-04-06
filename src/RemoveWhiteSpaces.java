
class RemoveWhiteSpaces
{
    public static void main(String[] args)
    {
        String str = "  Maveric       Systems          Limited  ";
String strWithoutSpace = str.replaceAll("\\s", ""); 
        System.out.println(strWithoutSpace);      
    }
}