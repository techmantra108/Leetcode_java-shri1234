class Solution {
    public int largestAltitude(int[] gain) {
        int altitude=0;
        int maxaltitude=0;

     
        for(int i=0;i<gain.length;i++){
           altitude=gain[i]+altitude;
            if(altitude>maxaltitude){
            maxaltitude=altitude;}
            }
              return  maxaltitude;
        }
      
        
    }
