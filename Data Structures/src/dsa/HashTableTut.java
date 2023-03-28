package dsa;

import java.util.Scanner;

class Hashtable{
	private int size;
	private int capacity;
	private double loadfactor = 0.75;
	private int[] keys;
	private String[] values;
	
	public Hashtable() {
		this(100);
	}
	
	public Hashtable(int Cap) {
		this.capacity=Cap;
		keys= new int[Cap];
		values = new String[Cap];
		size=0;
	}
	
	public int Hash(int key) {
		return Integer.hashCode(Math.abs(key)) % capacity;
	}
	
	public int size() {
		return size;
	}
	
	public void resize() {
		int newcap = capacity*2;
		int[] newkeys = new int[newcap];
		String[] newvalues = new String[newcap];
		
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
		capacity=newcap;
		keys=newkeys;
		values=newvalues;
		
		
	}

	public boolean containskey(int key) {
		key = Hash(key);
		for(int i=0;i<size;i++) {
			if(keys[i]==key){
				return true;
			}
		}
		return false;
	}

	public void put(int key,String value) {
		if(size>=loadfactor*capacity) {
			resize();
		}
		
		int index= Hash(key);
		
		while(keys[index]!=0 && keys[index]!=key) {
			index=index+1% capacity;
		}
		if(keys[index]==0) {
			size++;
		}
		keys[index]=key;
		values[index]=value;
	}

	public void dump() {
	    System.out.println("HashTable dump:");
	    for (int i = 0; i < capacity; i++) {
	        if (keys[i] != 0) {
	            System.out.println("Index " + i + ": Key=" + keys[i] + ", Value=" + values[i]);
	        }
	    }
	}

	
	public String get(int key) {
		int index= Hash(key);
		while(keys[index]!=0) {
			if(keys[index]==key) {
				return values[index];
			}
			index=index+1 % capacity;
		}
		return "-1";
	}
	
	public void remove(int key) {
		int index = Hash(key);
		while(keys[index]!=0) {
			if(keys[index]==key) {
				keys[index]=0;
				values[index] = "";
	            size--;
	            return;
			}
			index=index+1 % capacity;
		}
		
	}
}

public class HashTableTut {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable(20);
		ht.put(19, "Hashim");
		ht.put(109, "Aashish");
		ht.put(9, "Collision bad boi ayush");
		ht.put(3, "Daniyl");
		ht.put(81, "Faraz");
		System.out.println(ht.containskey(109));
		ht.dump();
		
		System.out.println(ht.get(81));
		ht.remove(03);
		System.out.println(ht.get(03));
		
	}
}