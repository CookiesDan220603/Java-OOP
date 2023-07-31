public class ex5 {
    public static String removePhay (String str)
    {
        str = str.substring(0, str.length() - 1);
        return str;
    }
    public static void Dem(String str[], int n)
    {
        String bangLuu[] = new String[100];
        int k[] = new int[100];
        int f =0;
        String temp = new String();
        for (int i =0;i<n;i++)
        {
            temp = str[i];
            if (!temp.equals(""))
            {
                bangLuu[f] = temp;
                temp = temp.toLowerCase();
                k[f] = 1;
                str[i] ="";
                for (int j=i;j<n;j++)
                {
                    if (temp.equals(str[j].toLowerCase()))
                    {
                        
                        str[j] ="";
                        k[f] ++;
                    }
                }
                f++;
            }
        }
        for (int i =0;i<f;i++)
        {
            System.out.println(bangLuu[i] + " " + k[i]);
        }
    }

    public static void main(String[] args) {
        int n = 0;
        String str ="";
        for (String sentence : "You are living on a Plane. What you style Flatland is the vast level surface of what I may call a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it.".split("[.]")) {
            str += sentence +" ";
            // System.out.println("_" + str + "_");
        }
        String str2[] = new String[100];
        for (String sentence : str.split("[ ]"))
        {
            str2[n] = sentence;
            // System.out.println("_" + str2[n] +"_");
            n++;
        }
        for (int i =0;i<n;i++)
        {
            if (str2[i] != null && str2[i].length() > 0 && str2[i].charAt(str2[i].length() - 1) == ',')
            {
                str2[i] = removePhay(str2[i]);
            }
        }
        // for (int i =0;i<n;i++)
        // {
        //     System.out.println(str2[i]);
        // }
        Dem(str2, n);
    }
    
    
}
