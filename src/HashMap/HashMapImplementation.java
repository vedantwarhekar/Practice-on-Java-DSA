package HashMap;

import java.util.LinkedList;

public class HashMapImplementation {

    static class MyHashMap<K,V>{
     public static final int DEFAULT_CAPACITY = 4;
     public static final float DEFAULT_LOAD_FACTOR = 0.75f;
     public class Node{
         K key;
         V value;
         Node(K key, V value)
         {
             this.key = key;
             this.value = value;
         }
     }

     // number of element in map
     private int n;
     private LinkedList<Node>[] buckets;

     public MyHashMap(){
         initBuckets(DEFAULT_CAPACITY);
     }

     private void initBuckets(int N){ // N - capacity/size of bucket array

         buckets = new LinkedList[N];
         for(int i = 0; i < buckets.length; i++)
         {
             buckets[i] = new LinkedList<>();
         }
     }

     // traverse the li and looks for a node with key, if founds return it's key otherwise return -1
     private int searchInBucket(LinkedList<Node> li, K key)
     {
         for(int i = 0 ; i < li.size(); i++)
         {
             if(li.get(i).key == key)
             {
                 return i;
             }
         }
         return -1;
     }

     // create hash for each element
     private int HashFunc(K key){
         int hc = key.hashCode();
         return (Math.abs(hc)) % buckets.length;
     }

     //function to rehash and increase capacity and also it remove collision
     private void reHash(){
         LinkedList<Node>[] oldBuckets = buckets;
         initBuckets(oldBuckets.length*2);
         n=0;
         // copy element from old bucket to new bucket
         for(var bucket: oldBuckets)
         {
             for(var node : bucket){
                 put(node.key,node.value);
             }
         }
     }

     // return number of element
     public int size(){
         return n;
     }

     public int capacity(){
         return buckets.length;
     }

     public float load(){
         return (n*1.0f)/buckets.length;
     }

     // insert or update
     public void put(K key, V value){
        int bi = HashFunc(key);
        LinkedList<Node> currBucket = buckets[bi];
        int ei = searchInBucket(currBucket,key);
        if(ei == -1)
        {
           // key doesn't exist, we have to insert a new node
           Node node = new Node(key,value);
           currBucket.add(node);
           n++;
        }else {
            // update because key exist
            Node currNode = currBucket.get(ei);
            currNode.value = value;
        }

        if(n >= buckets.length * DEFAULT_LOAD_FACTOR){
            reHash();
        }
     }

     public V get(K key)
     {
        int bi = HashFunc(key);
        LinkedList<Node> currBucket = buckets[bi];
        int ei = searchInBucket(currBucket,key);
        if(ei != -1){
            Node currNode = currBucket.get(ei);
            return currNode.value;
        }
        return null;
     }

     public V remove(K key)
     {
        int bi = HashFunc(key);
        LinkedList<Node> currBucket = buckets[bi];
        int ei = searchInBucket(currBucket,key);
        if(ei != -1){
            Node currNode = currBucket.get(ei);
            V val = currNode.value;
            currBucket.remove(ei);
            n--;
            return val;
        }
        return null;
     }

    }
    public static void main(String[] args) {
     MyHashMap<String,Integer> mp = new MyHashMap<>();
        System.out.println("Testing put");
        mp.put("a",1);
        mp.put("b",6);
        mp.put("c",8);
        System.out.println("Capacity:- "+mp.capacity());
        System.out.println("Load:- "+mp.load());

        System.out.println("Testing size");
        System.out.println(mp.size());

        System.out.println("Testing put for editing");
        mp.put("c",88);
        System.out.println(mp.size());

        System.out.println("Testing get");
        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("c"));
        System.out.println(mp.get("age"));

        System.out.println("Testing remove");
        System.out.println(mp.remove("c"));
        System.out.println(mp.remove("c"));
        System.out.println("Testing size:- "+mp.size());

        System.out.println("Testing rehash function");
        mp.put("c",1);
        mp.put("d",6);
        mp.put("e",8);
        System.out.println("Testing size:- "+mp.size());
        System.out.println("Capacity:- "+mp.capacity());
        System.out.println("Load:- "+mp.load());
    }
}
