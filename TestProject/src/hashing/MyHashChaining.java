package hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHashChaining {

	int BUCKET;
	ArrayList<LinkedList<Integer>> hashTable;
	
	//Constructor
	public MyHashChaining(int b) {
		BUCKET = b;
		hashTable = new ArrayList<LinkedList<Integer>>(b);
		for(int i = 0; i < b ; i++) {
			hashTable.add(new LinkedList<Integer>());
		}
	}
	
	//method to insert to hash table
	void insert(int key) {
		int i = key % BUCKET;
		hashTable.get(i).add(key);
	}
	
	//method to remove from hash table
	void delete(int key) {
		int i = key % BUCKET;
		hashTable.get(i).remove((Integer)key);
	}
	
	//
	boolean search(int key) {
		int i = key % BUCKET;
		return hashTable.get(i).contains(key);
	}

}
