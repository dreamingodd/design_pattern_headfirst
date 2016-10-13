package compositeIterator;

import iteratorComposite.collection.People;
import iteratorComposite.entity.PeopleComponent;
import iteratorComposite.test.Test;

import java.util.Iterator;
import java.util.Stack;

/**
 * 这里充分说明了Stack存在的意义。
 * 
 * @author ywd
 * 
 */
@SuppressWarnings("rawtypes")
public class CompositeIterator implements Iterator {
    Stack stack = new Stack();

    @SuppressWarnings("unchecked")
    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        }
        Iterator it = (Iterator) stack.peek();
        if (it.hasNext()) {
            return true;
        } else {
            stack.pop();
            return hasNext();
        }
    }

    @SuppressWarnings("unchecked")
    public Object next() {
        if (hasNext()) {
            Iterator it = (Iterator) stack.peek();
            PeopleComponent pc = (PeopleComponent) it.next();
            if (pc instanceof Iterator) {
                stack.push(pc);
            }
            return pc;
        } else
            return null;
    }

    @Override
    public void remove() {
    }

    public static void main(String[] args) {
        People people = Test.mockupPeople();
        CompositeIterator ci = new CompositeIterator(people);
        while (ci.hasNext()) {
            PeopleComponent pc = (PeopleComponent) ci.next();
            // Doctors will print 2 times, because crowd will print its elements orderly.
            pc.print();
        }
    }
}
