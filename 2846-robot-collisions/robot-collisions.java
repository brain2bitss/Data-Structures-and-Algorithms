import java.util.*;

class Solution {
    //CODED BY ADHI 
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        
        // EDGE CASE: All robots moving in same direction
        boolean allSameDirection = true;
        char firstDir = directions.charAt(0);
        for (int i = 1; i < n; i++) {
            if (directions.charAt(i) != firstDir) {
                allSameDirection = false;
                break;
            }
        }
        
        if (allSameDirection) {
            List<Integer> result = new ArrayList<>();
            for (int health : healths) {
                result.add(health);
            }
            return result;
        }
        
        // Create list of robots with their original indices
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        
        // Sort robots by position
        Arrays.sort(indices, (a, b) -> Integer.compare(positions[a], positions[b]));
        
        // Stack to store robots that are moving right
        Stack<Integer> stack = new Stack<>();
        int[] currentHealths = healths.clone();
        
        // Process robots in order of their positions
        for (int idx : indices) {
            if (directions.charAt(idx) == 'R') {
                // Moving right, push to stack
                stack.push(idx);
            } else {
                // Moving left, check for collisions with robots moving right
                while (!stack.isEmpty()) {
                    int rightIdx = stack.peek();
                    
                    if (currentHealths[rightIdx] > currentHealths[idx]) {
                        // Right robot survives, left robot dies
                        currentHealths[rightIdx]--;
                        currentHealths[idx] = -1;
                        break;
                    } else if (currentHealths[rightIdx] < currentHealths[idx]) {
                        // Left robot survives, right robot dies
                        currentHealths[rightIdx] = -1;
                        stack.pop();
                        currentHealths[idx]--;
                    } else {
                        // Both die
                        currentHealths[rightIdx] = -1;
                        currentHealths[idx] = -1;
                        stack.pop();
                        break;
                    }
                }
            }
        }
        
        // Collect surviving robots in original order
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (currentHealths[i] > 0) {
                result.add(currentHealths[i]);
            }
        }
        
        return result;
    }
}