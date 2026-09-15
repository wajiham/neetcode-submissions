class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        //checking if 2 words have the same length or not 
        if(s.length != t.length){
            return false
        }
        // creating 2 empty maps
       val charS= mutableMapOf<Char, Int>()
       val charT= mutableMapOf<Char, Int>()

       for(i in s.indices){
        charS[s[i]]=charS.getOrDefault(s[i], 0) + 1
        charT[t[i]]=charT.getOrDefault(t[i], 0) + 1

       }
       return charS==charT

    
    }
}

   
        

    

