import java.io.*;
import java.util.*;

struct Node{
    Node *links[26];
    bool flag=false;

    boolean containsKey(char ch){
        return (links[ch-'a']!=NULL);
    }
    
    Node* get(char ch){
        return links[ch-'a'];
    }

    void put(char ch, Node* node){
        links[ch-'a']=node;
    }

    void setEnd(){
        flag=true;
    }

    boolean isEnd(){
        return flag;
    }

};

class Trie{
    private : Node *root;
   public:
     /** Initialized your data structure here */

     Trie(){
         root=new Node();
     }

     /** Insert a word into the trie */
     void insert(string word){
         Node *node=root;
         for(int i=0;i<word.size();i++){
             if(!node->containsKey(word[i])){
                 node-> put(word[i], new Node());
             }

             node=node->get(word[i]);
         }
         node->setEnd();
     }
     
    boolean checkIfAllPrefixExists(string word){
         Node *node=root;
         boolean flag=true;
         for(int i=0;i<word.size() && flag; i++){
             if(node->containsKey(word[i])){
                 node=node->get(word[i]);
                 flag=flag & node->isEnd();
             }
             else{
                 return false;
             }
         }
         return flag;
     }
};

string completeString(int n, vector<string> &a){
    Trie* obj=new Trie();
    for(auto word:a)
      obj->insert(word);
      string longest="";
      for(auto word:a){
          if(obj->checkIfAllPrefixExists(word)){
              if(word.size()>longest.size())
                longest=word;
          }
          else if(word.size()==longest.size() && word < longest){
              longest=word;
          }
      }
}
      if(longest=="") 
         return "None";
    return longest;
}
