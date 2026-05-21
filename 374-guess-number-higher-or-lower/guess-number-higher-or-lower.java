/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

// public class Solution extends GuessGame {
//     public int guessNumber(int n) {
//         int i = 88;
//         while(i != 0){
//             i = guess(n);
//             n = n + i;
//         }
//         return n;
//     }
// }

   public class Solution extends GuessGame{
        public int guessNumber(int n){
            int mid = 0; int left = 1; int right = n;
            while(left <= right){
                mid = left + (right - left) / 2;;
                int i = guess(mid);
                if(i == 1){
                    left = mid + 1;
                }else if(i == -1){
                    right = mid - 1;
                }else if(i == 0){
                    return mid;
                }
            }
            return mid;
        }
   }