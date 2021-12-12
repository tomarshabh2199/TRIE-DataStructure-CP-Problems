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
     
4.Count Distinct Substrings

     Problem Statement-
     Given a string 'S', you are supposed to return the number of distinct substrings(including empty substring) of the given string.
     You should implement the program using a trie.
     
     Note :
     A string ‘B’ is a substring of a string ‘A’ if ‘B’ that can be obtained by deletion of, several characters(possibly none) from the start of ‘A’ and                            several characters(possibly none) from the end of ‘A’. 
     Two strings ‘X’ and ‘Y’ are considered different if there is at least one index ‘i’  such that the character of ‘X’ at index ‘i’ is different from the character of ‘Y’        at index ‘i’(X[i]!=Y[i]).
     
 5.Maximum XOR
   
      Problem Statement-
      You are given two arrays of non-negative integers say ‘arr1’ and ‘arr2’. Your task is to find the maximum value of ( ‘A’ xor ‘B’ ) where ‘A’ and ‘B’ are any element from ‘arr1’ and ‘arr2’ respectively and ‘xor’ represents the bitwise xor operation.
      
      
 6.Max Xor Queries.
    
    Problem Statement-
    You are given an array/list ‘ARR’ consisting of ‘N’ non-negative integers. You are also given a list ‘QUERIES’ consisting of ‘M’ queries, where the ‘i-th’ query is a list/array of two non-negative integers ‘Xi’, ‘Ai’, i.e ‘QUERIES[i]’ = [‘Xi’, ‘Ai’].
    The answer to the ith query, i.e ‘QUERIES[i]’ is the maximum bitwise xor value of ‘Xi’ with any integer less than or equal to ‘Ai’ in ‘ARR’.
    You should return an array/list consisting of ‘N’ integers where the ‘i-th’ integer is the answer of ‘QUERIES[i]’.
    
     Note:
     1. If all integers are greater than ‘Ai’ in array/list ‘ARR’  then the answer to this ith query will be -1.



