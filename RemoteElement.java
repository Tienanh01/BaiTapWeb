/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remoteelement;

/**
 *
 * @author ProTech
 */
public class RemoteElement {
 public static int removeElement(int[] nums, int val) {
//     tự viết 
//        int length = nums.length;
//        int count = 0;
//        for (int i = 0; i < length; ) {            
//            if (nums[i] == val) {
//                count++;
//                for (int j = i; j < length- 1; j++) {
//                    nums[j] = nums[j+1];
//                }
//            }
//         i++;
//     }
//        length = length-count;
//            
//     return length;

//code mạng

//    int left  = 0, right =0;
//    while(right < nums.length){
//        if(nums[right] != val){
//            nums[left++] = nums[right];        
//            System.out.println("if left : "+left);
//            System.out.println("right if : "+right);
//            System.out.println("");
//        }
//        System.out.println("right : "+right);
//        System.out.println("left : "+left);
//        right++;
//    }
//return left;


// tối ưu
        if(nums.length == 0) return 0;
        int j =0;
         for (int i = 0; i < nums.length; i++) {
             if(nums[i] != val){
                 nums[j] = nums[i];
                        j++;
             }
         }
         return j;

 }
// public int remove(int val, int length){
//     
// }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = {2,3,4,5,2,5};
       
        System.out.println( removeElement(arr, 3));
        for (int i : arr) {
            System.out.println(i);
        }
        
    }
    
}
