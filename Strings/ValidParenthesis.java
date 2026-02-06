class Solution {
    public boolean isValid(String s) {

        char stack[]=new char[s.length()];
        int top=-1;

        for(int i=0; i<s.length();i++){

            char current=s.charAt(i);
             if(current=='(' || current=='[' || current=='{'){
                stack[++top]=current;
             }
             else{
                if(top==-1) return false;

                char lastOpen=stack[top--];
                if(s.charAt(i)==')' && lastOpen!='(') return false;
                if(s.charAt(i)==']' && lastOpen!='[') return false;
                if(s.charAt(i)=='}' && lastOpen!='{') return false;
             }
        }
     return top==-1;   
    }
}