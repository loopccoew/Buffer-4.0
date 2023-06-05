package com.buffer;

public class Heap {



Parking heap[];

int lastIndexEntered;



Heap(int size){

heap = new Parking[size+1];

lastIndexEntered = 0;

heap[0] = new Parking("00");

heap[0].heapKey =Integer.MIN_VALUE;

}



boolean isFull() {



if(lastIndexEntered == heap.length-1) return true;

return false;



}



boolean isEmpty() {



if(lastIndexEntered == 0) return true;

return false;



}



void heapifyBottomToTop(int index) {



	if(heap[index].heapKey < heap[index/2].heapKey) {

		Parking temp = heap[index];

		heap[index] = heap[index/2];

		heap[index/2] = temp;

		heapifyBottomToTop(index/2);

		}



}



void heapifyTopToBottom(int index) {

	

	int left = index * 2, right = index * 2 + 1;

	

	if(left > lastIndexEntered) {

		

		return;

		

	}

	

	if(heap[left].heapKey < heap[right].heapKey && heap[left].heapKey < heap[index].heapKey) {

		

		Parking temp = heap[left];

		heap[left]=heap[index];

		heap[index]=temp;

		heapifyTopToBottom(left);

		

	}

	else{

		

		Parking temp=heap[right];

		heap[right]=heap[index];

		heap[index]=temp;

		heapifyTopToBottom(right);

		

	}

	

}





void insert(Parking val) {



if(!isFull()) {

heap[++lastIndexEntered]=val;

heapifyBottomToTop(lastIndexEntered);

}

System.out.println("Insert done");
System.out.println(heap[1].heapKey);
System.out.println(heap[1].parkingNo);


}



void delete() {



if(!isEmpty()) {

	

heap[1]=heap[lastIndexEntered];

lastIndexEntered--;

heapifyTopToBottom(1);



}



}
}


