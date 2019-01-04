public class day5new extends day5 {

    @Override
    public String reverseString(String s){
        if(s==null||s=="") return "";
        String[] strs = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = strs.length-1; i >0 ; i--) {

            stringBuilder.append(i).append(" ");
        }

        return stringBuilder.toString().substring(0, stringBuilder.length()-1);
    }
}
