# TRIE-DataStructure-CP-Problems

1.Implement Trie

     Implement Trie Data Structure to support these operations:
     insert(word) - To insert a string "word" in Trie
     search(word) - To check if string "word" is present in Trie or not.
     startsWith(word) - To check if there is any string in the Trie that starts with the given prefix string "word".
     
     
2.Implement Trie ll

     Ninja has to implement a data structure ”TRIE” from scratch. Ninja has to complete some functions.
     1) Trie(): Ninja has to initialize the object of this “TRIE” data structure.

     2) insert(“WORD”): Ninja has to insert the string “WORD”  into this “TRIE” data structure.

     3) countWordsEqualTo(“WORD”): Ninja has to return how many times this “WORD” is present in this “TRIE”.

     4) countWordsStartingWith(“PREFIX”): Ninjas have to return how many words are there in this “TRIE” that have the string “PREFIX” as a prefix.

     5) erase(“WORD”): Ninja has to delete this string “WORD” from the “TRIE”.
     
         Note:
         1. If erase(“WORD”) function is called then it is guaranteed that the “WORD” is present in the “TRIE”.

         2. If you are going to use variables with dynamic memory allocation then you need to release the memory associated with them at the end of your solution.
         
 3.Complete String
 
     Ninja developed a love for arrays and strings so this time his teacher gave him an array of strings, ‘A’ of size ‘N’. Each element of this array is a string.                  The teacher taught Ninja about prefixes in the past, so he wants to test his knowledge.A string is called a complete string if every prefix of this string is.                also present in the array ‘A’. Ninja is challenged to find the longest complete string in the array ‘A’.
     If there are multiple strings with the same length, return the lexicographically smallest one and if no string exists, return "None".
                    
     Note :
     String ‘P’ is lexicographically smaller than string ‘Q’, if : 
     1. There exists some index ‘i’ such that for all ‘j’ < ‘i’ , ‘P[j] = Q[j]’ and ‘P[i] < Q[i]’. E.g. “ninja” < “noder”.
     2. If ‘P’ is a prefix of string ‘Q’, e.g. “code” < “coder”.



