package org.myarraylist;

public class MyArrayList<T> {
	private Object[] data = new Object[0];
	private int length = 0;

	public void add(T element) {
		if (length == data.length) {
			Object[] newData = new Object[length * 2 + 1];
			/*for (int i = 0; i < length; i++) {
				newData[i] = data[i];
			}*/
			System.arraycopy(data, 0, newData, 0, length);
			data = newData;
		}
		data[length] = element;
		length++;
	}

	public T get(int index) {
		if (index < 0 || index >= length) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return (T) data[index];
	}

	public int length() {
		return length;
	}

	public void clear() {
		data = new Object[0];
		length = 0;
	}
}
