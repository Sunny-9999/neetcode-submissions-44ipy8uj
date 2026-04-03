class Solution {
    public boolean isPalindrome(String s) {
        int len=s.length();
        

        List<Character> charrList=new ArrayList<>();

        for(int i=0;i<len;i++){
            if((s.charAt(i)>='A' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9'))
            charrList.add(Character.toLowerCase(s.charAt(i)));
        }

        int i=0,j=charrList.size()-1;

        while(i<=j){
           
            if(charrList.get(i)!=charrList.get(j))  {
               
                 return false;
            }
            i++;
            j--;

        }

       

        return true;


    }
}
