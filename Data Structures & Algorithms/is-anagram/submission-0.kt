class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        //checking if 2 words have the same length or not 
        if(s.length != t.length){
            return false
        }
        // Mapping the characters (how many times each char appears)
       val word1= mutableMapOf<Char, Int>()
       val word2= mutableMapOf<Char, Int>()

       for(i in s.indices){
        word1[s[i]]=word1.getOrDefault(s[i], 0) + 1
        word2[t[i]]=word2.getOrDefault(t[i], 0) + 1

       }
       return word1==word2

    
    }
}

   
        

    

