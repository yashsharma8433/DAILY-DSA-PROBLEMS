// problem link - https://www.codingninjas.com/studio/problems/number-of-digits_9173?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse&leftPanelTabValue=PROBLEM

public class Solution {
    public static int countDigits(int n){
        int counter = 0; //This counter start from 0
        while(n>0){ //if n greater then go inside loop ex n=22 then go if n=0 then will not go
            int lastdigit =  n%10; //lastdigit take like 233 then 3 is last digit store in it 
            counter = counter + 1; //count no. of digits and increment 
            n = n/10;  //now 233 then 233 divide 10 23.3 then show 23 only then again repeat same process
        }
        return counter ; //when finish return how many digit are there
    }
}
