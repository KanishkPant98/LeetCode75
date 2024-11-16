LeetCode Series Link: https://leetcode.com/studyplan/leetcode-75/

#Topic- Strings/Arrays

1768) Merge Strings Alternately
Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r

Solution:-
var mergeAlternately = function(word1, word2) {
    const test1 = word1.split("");
    const test2 = word2.split("");
    let test3 = [];
    for (let i = 0; i < test1.length; i++) {
      test3.push(test1[i])
      if(i != test1.length -1){
          test3.push(test2[i])
      }else{
          test3 = [...test3,...test2.slice(i)]
      }
    }
   return test3?.join('');
};
-----------------------------------------

