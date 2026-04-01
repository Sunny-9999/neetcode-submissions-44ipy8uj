class Solution {



    public String encode(List<String> strs) {

        StringBuffer sb=new StringBuffer();

        for(String str:strs){
            int length=str.length();
            sb.append(length+"#"+str);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {

        List<String> result=new ArrayList<>();

        for(int i=0;i<str.length();i++){
                int length=0;
            while(i<str.length() && str.charAt(i)!='#'){
                length=length*10+(str.charAt(i)-'0');
                i++;
            }
           // System.out.println("length "+length);

            result.add(str.substring(i+1, i+length+1));
            i=i+length;

        }

        return result;
    }
}
