package dsa;

import java.util.Scanner;

class Hashtable{
    // Define private variables for the hashtable
    private int size;
    private int capacity;
    private double loadfactor = 0.75;
    private int[] keys;
    private String[] values;
    
    // Constructor with default capacity of 100
    public Hashtable() {
        this(100);
    }
    
    // Constructor with specified capacity
    public Hashtable(int Cap) {
        this.capacity=Cap;
        keys= new int[Cap];
        values = new String[Cap];
        size=0;
    }
    
    // Method to calculate the hash of a key
    public int Hash(int key) {
        return Integer.hashCode(Math.abs(key)) % capacity;
    }
    
    // Method to get the size of the hashtable
    public int size() {
        return size;
    }
    
    // Method to resize the hashtable when the load factor exceeds 0.75
    public void resize() {
        // Double the capacity of the hashtable
        int newcap = capacity*2;
        // Create new arrays for the keys and values
        int[] newkeys = new int[newcap];
        String[] newvalues = new String[newcap];
        
        // Copy the old values to the new arrays
        for(int i =0 ;i <capacity ;i++) {
            if(keys[i]!=0) {
                int index = Hash(keys[i]);
                while(newkeys[index]!=0) {
                    index=index+1 % newcap;
                }
                newkeys[index]=keys[i];
                newvalues[index]=values[i];
            }
        }
        
        // Update the capacity and arrays of the hashtable
        capacity=newcap;
        keys=newkeys;
        values=newvalues;
    }

    // Method to check if a key exists in the hashtable
    public boolean containskey(int key) {
        // Calculate the hash of the key
        key = Hash(key);
        // Loop through the keys to find the key
        for(int i=0;i<size;i++) {
            if(keys[i]==key){
                return true;
            }
        }
        // Key was not found, return false
        return false;
    }

    // Method to insert a key-value pair into the hashtable
    public void put(int key,String value) {
        // If the load factor exceeds 0.75, resize the hashtable
        if(size>=loadfactor*capacity) {
            resize();
        }
        
        // Calculate the hash of the key
        int index= Hash(key);
        
        //  return ((h + i) % entries.length + entries.length) % entries.length; // Linear Probing
        //  return (h + i*i)%entries.length;  // Quadratic Probing

        
        // Loop through the keys to find the correct index for the key
        for(int i =1 ;keys[index]!=0 && keys[index]!=key;i++ ) 
        {
        //linear
        	index=index+1% capacity;
            
        //quadirtic
        //    index=index+1*i % capacity;
        }
        
        // If the key is not already in the hashtable, increase the size
        if(keys[index]==0) {
            size++;
        }
        
        // Add the key-value pair to the hashtable
        keys[index]=key;
        values[index]=value;
    }

    // Method to print out all the keys and values in the hashtable
    public void dump() {
        System.out.println("HashTable dump:");
        for (int i = 0; i < capacity; i++) {
            if (keys[i] != 0) {
                System.out.println("Index " + i + ": Key=" + keys[i] + ", Value=" + values[i]);
            }
        }
    }
    public String get(int key) {
        int index= Hash(key); //calculate the hash value for the given key
        while(keys[index]!=0) { //while the key at the calculated index is not 0
            if(keys[index]==key) { //if the key at the calculated index is equal to the given key
                return values[index]; //return the value at the calculated index
            }
            index=index+1 % capacity; //otherwise, move to the next index by incrementing index and taking the modulus of the capacity
        }
        return "-1"; //if the key is not found, return -1
    }

    public void remove(int key) {
        int index = Hash(key); //calculate the hash value for the given key
        while(keys[index]!=0) { //while the key at the calculated index is not 0
            if(keys[index]==key) { //if the key at the calculated index is equal to the given key
                keys[index]=0; //set the key at the calculated index to 0
                values[index] = ""; //set the value at the calculated index to an empty string
                size--; //decrement the size of the hash table
                return; //exit the method
            }
            index=index+1 % capacity; //otherwise, move to the next index by incrementing index and taking the modulus of the capacity
        }
    }}
public class HashTableTut{
	
    public static void main(String[] args) {
        Hashtable ht = new Hashtable(20); //create a new hash table with a capacity of 20
        ht.put(19, "Hashim"); //add key-value pairs to the hash table
        ht.put(109, "Aashish");
        ht.put(9, "Ayush(collision)");
        ht.put(3, "Daniyal");
        ht.put(81, "Faraz");
        System.out.println(ht.containskey(109)); //check if the hash table contains a key
        ht.dump(); //print the contents of the hash table
        System.out.println(ht.get(81)); //get the value for a key
        ht.remove(03); //remove a key-value pair from the hash table
        System.out.println(ht.get(03)); //get the value for a key that has been removed (should return -1)
    }}
