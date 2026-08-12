// Last updated: 8/12/2026, 11:13:00 AM
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if(start>destination){
            int temp=start;
            start=destination;
            destination=temp;
        }
        int clockwise=0;
        int sum=0;
        for(int i=0;i<distance.length;i++){
            sum+=distance[i];
            if(i>=start && i<destination){
                clockwise+=distance[i];
            }
        }
        int counter=sum-clockwise;
        return Math.min(clockwise,counter);
    }
}