import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Hat<T> {
	
	private final List<T> list = new ArrayList<>();
	private int top;
	private boolean isEmpty = true;

	public boolean isEmpty() {
		return isEmpty;

	}

	public int size() {
		return list.size();

	}

	public void add(T name) {
		list.add(name);
	}

	public List<T> getList() {
		return list;
	}

	public boolean remove(Object o) {
		int last = list.size() - 1;
		T Element = list.remove(last);
		return true;
	}

	public T draw() {

		T element = list.get((int) (Math.random() * size()));
		remove(element);
		return element;

	}

	@Override
	public String toString() {
		return "hat [list=" + list + "]";
	}
	}

