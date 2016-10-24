package arisnegro.com.es.util.list.reverselist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public List<Integer> manualReverse(List<Integer> source) {
		List<Integer> reverse;
		
		if (source != null) {
			
			reverse = new ArrayList<>();
			
			for (int i = source.size()-1; i>=0; i--) {
				
				reverse.add(source.get(i));
			}
		} else {
			reverse = null;
		}
		return reverse;
	}

	public List<Integer> forwardIteratorReverse(List<Integer> source) {
		List<Integer> reverse;
		
		if (source != null) {
			Iterator<Integer> iterator;
			
            reverse  = new ArrayList<>();
            iterator = source.iterator();
            
			while (iterator.hasNext()) {
				Integer item;
				
				item = iterator.next();
				reverse.add(0, item);
			}
		} else {
			reverse = null;
		}
		return reverse;
	}

	public List<Integer> backwardIteratorReverse(List<Integer> source) {
		List<Integer> reverse;
		
		if (source != null) {
			LinkedList<Integer> linkedList;
			Iterator<Integer>   iterator;
			
			linkedList = new LinkedList<>(source);
            reverse    = new ArrayList<>();
            iterator   = linkedList.descendingIterator();
            
			while (iterator.hasNext()) {
				Integer item;
				
				item = iterator.next();
				reverse.add(item);
			}
		} else {
			reverse = null;
		}
		return reverse;
	}

	public List<Integer> streamReverse(List<Integer> source) {
		List<Integer> reverse;
		
		if (source != null) {
			
			reverse = new ArrayList<>();			
			source.stream()
			    .collect(Collectors.toCollection(LinkedList::new))
			    .descendingIterator()
			    .forEachRemaining(reverse::add);			
		} else {
			reverse = null;
		}
		return reverse;
	}

	public List<Integer> collectionsReverse(List<Integer> source) {
		List<Integer> reverse;
		
		if (source != null) {
			
			reverse = new ArrayList<>(source);
			Collections.reverse(reverse);		
		} else {
			reverse = null;
		}
		return reverse;
	}
}
