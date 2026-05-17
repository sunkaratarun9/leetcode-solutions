class Solution {
    List<Integer> makeBeautiful(int[] arr) {
        // code here
        List<Integer> answer = new ArrayList<>(); //answerlist
        for (int i : arr) {
            if (answer.size() == 0) {
                answer.add(i);
            } else if ((answer.get(answer.size()-1) >= 0 && i < 0) || (answer.get(answer.size()-1) < 0 && i >= 0)) {
                
                answer.remove(answer.size() - 1);  //Pop operation
                
            } else {
                answer.add(i);    //push operation
            }
        }
        
        return answer;
    }
}