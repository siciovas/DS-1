import java.util.Iterator;

public class LinkList <T extends Comparable<T>> implements Iterable<T>
{


    private class Node
    {
        public T data;
        public Node link;
        public int index;

        public Node(T value, Node address, int index)
        {
            this.data = value;
            this.link = address;
            this.index = index;
        }
    }

    private Node head;
    private Node tail;
    private int count=0;

    public LinkList(){}

    public void add(T item)
    {
        if(head != null)
        {
            tail.link = new Node(item, null, count);
            tail = tail.link;
        }
        else
            {
            head = new Node(item, null, count);
            tail = head;
        }
        count++;
    }

    public int getCount()
    {
        return this.count;
    }

    public T get(int index)
    {
        Node current = head;
        int Count = 0;

        while(current != null)
        {
            if(Count == index)
            {
                return current.data;
            }
            Count++;
            current = current.link;
        }
        return null;
    }

    public void sort()
    {
        if (head != null)
        {
            for (Node d1 = head; d1.link != null; d1 = d1.link)
            {
                Node max = d1;
                for (Node d2 = d1; d2 != null; d2 = d2.link)
                {
                    if (d2.data.compareTo(max.data) > 0)
                        max = d2;
                }
                T mod = d1.data;
                d1.data = max.data;
                max.data = mod;
            }
        }
    }



    public Iterator<T> iterator() {
        return new Iterator<T>() {

            Node current = head;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if(hasNext()){
                    T data = current.data;
                    current = current.link;
                    return data;
                }
                return null;
            }
        };
    }
}
