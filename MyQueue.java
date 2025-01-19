// Complete the implementation of your MyArrayList class in this file
import java.util.NoSuchElementException;

public class MyQueue implements IQueue {
	// add any necessary variables here
    private Object[] data = new Object[99];
    private int size = 0;

	@Override
	public void enqueue(Object item) {
        if(this.size>=data.length){
            Object[] newData = new Object[this.size+1];
            for(int i = 0; i < this.size; i++){
                newData[i] = this.data[i];
            }
            this.data = newData;
        }

        this.data[this.size] = item;
        this.size++;
	}

	@Override
	public Object dequeue() {
        if(this.size <= 0){ throw new NoSuchElementException(); }

        Object item = this.data[0];

        for(int i = 0; i < this.size-1; i++){
            this.data[i] = this.data[i+1];
        }
        this.size--;
        return item;
    }

	@Override
	public Object peek() {
        if(this.size <= 0){ throw new NoSuchElementException(); }

        return this.data[0];
	}

	@Override
	public int indexOf(Object item) {
        int index = -1;

        for(int i = 0; i < this.size; i++){
            if(this.data[i] == item){
                return i;
            }
        }

        return index;
	}

	@Override
	public int size() {
        return this.size;
	}

	@Override
	public boolean isEmpty() {

        return this.size<=0;
	}

	// add any necessary methods or classes below

}
