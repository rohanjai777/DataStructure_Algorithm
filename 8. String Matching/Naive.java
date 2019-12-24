class Naive{
    public void match(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        for(int i=0;i<m-n;i++){
            int j=0;
            for(j=0;j<n;j++){
                if(s1.charAt(i+j)!=s2.charAt(j)){
                    break;
                }
            }
            if(m-1 == j){
                System.out.println("String matched at index "+i);
            }
        }
    }
}
