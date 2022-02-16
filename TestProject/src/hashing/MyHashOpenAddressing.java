package hashing;

public class MyHashOpenAddressing {
	int BUCKET;
	int hashTable[];
	int size ;
	
	public MyHashOpenAddressing(int BUCKET) {
		BUCKET = BUCKET;
		
		for(int i = 0; i < BUCKET ; i++) {
			hashTable[i] = -1;
		}
		size = 0;
	}
	
	public int hash(int key) {
		return key % BUCKET;
	}
	
	//Search function for open addressing
	boolean search(int key) {
		int hashKey = hash(key);
		int index = hashKey;
		if(hashTable[index] != -1) {
			if(hashTable[index] == key)
				return true;
			index = (index + 1) / BUCKET;
			if(index == hashKey)
				return false;
		}
		return false;
	}
	
	boolean insert(int key) {
		if(size == BUCKET)
			return false;
		
		int index = hash(key);
		
		while(hashTable[index] != -1 && hashTable[index] != -2 && hashTable[index] != key)
			index = (index+1) % BUCKET;
		if(hashTable[index] == key)
			return false;
		else {
			hashTable[index] = key;
			size++;
			return true;
		}
		
	}
	
	boolean delete(int key) {
		int hashKey = hash(key);
		int index = hashKey;
		if(hashTable[index] != -1) {
			if(hashTable[index] == key) {
				hashTable[index] = -2;
				return true;
			}
			index = (index + 1) / BUCKET;
			if(index == hashKey)
				return false;
		}
		return false;
		
	}

}
