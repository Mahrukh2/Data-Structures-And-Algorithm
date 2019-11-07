public class LinearSearch1
{    
public static int linearSearch(String [] arr, String str)
{    
        for(int k=0;k<arr.length;k++)
        {    
            if(arr[k] == str)
            {    
                return k;    
            }    
        }    
        return -1;    
    }    
public static int linearSearch(char[] arr1,char ch)
{
     for(int k=0;k<arr1.length;k++)
        {    
            if(arr1[k] == ch)
            {    
                return k;    
            }    
        }    
        return -1;  
}
   

    public static void main(String args[])
    {    
          
          String[] s= {"Maha","Sara","Sana","Fiza","Bina","Unza"};    
        String str = "Unza";    
        System.out.println(str +" is found at index: "+ linearSearch(s, str));
        char[] c= {'A','B','C','D','E','F','G'};    
        char ch = 'D';    
        System.out.println(ch +" is found at index: "+ linearSearch(c, ch));
    }
}

   