#include<bits/stdc++.h>
using namespace std;

struct Node{
    //takes this because we need nly 0 and 1
    Node *links[2];

    bool containsKey(int bit){
        return (links[bit]!=NULL)
    }

    Node* get(int bit){
        return links[bit];
    }

    void put(int bit, Node* node){
        links[bit]=node;
    }
}; 

class Trie{
    private : Node* root;
  public:
         Trie(){
             root=new Node();
         }

    public: 
         void insert(int num){
             Node* node=root;
             for(int i=31;i>=0;i--){
                 int bit1=(num>>i)&1;
                 if(!node->containsKey(bit1)){
                     node->put(bit1, new Node());
                 }
                 node=node->get(bit1);
             }
         }

         public : 
           int findMax(int num){
               Node* node=root;
               int maxNum=0;
               for(int i=31;i>=0;i--){
                   int bit1=(num>>i)&1;
                   if(node->containsKey(bit1)){
                       maxNum=maxNum|(1<<i);
                       node=node->get(!bit1);
                   }
                   else{
                       node=node->get(bit1);
               }
           }
           return maxNum;
    }
};

int maxXOR(int n, int m, vector<int> & arr1, vector<int> &arr2) {{
    Trie trie;
    for(int i=0;i<n;i++){
        trie.insert(arr1[i]);
    }

    int maxi=0;
    for(int i=0;i<m;i++){
        maxi=max(maxi,trie.findMax(arr2[i])));
    }
    return maxi;
}
