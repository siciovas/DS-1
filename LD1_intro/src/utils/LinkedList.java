package utils;

import java.util.Iterator;

/*
Realizuokite visus interfeiso metodus susietojo sarašo pagrindu.
Nesinaudokite java klase LinkedList<E>, visa logika meginkite parasyti patys.
Jeigu reikia, galima kurti papildomus metodus ir kintamuosius.
*/
public class LinkedList<T> implements List<T>
{

    private class Node
{
        public T Data;
        public Node Link;
        public Node (T Value, Node Address)
        {
            this.Data = Value;
            this.Link = Address;
        }
    }

    private Node Head;

    public LinkedList()
    {
        this.Head = null;
    }

    @Override
    public void add(T item) {
       Node node = new Node(item, null);
       if(Head == null)
       {
           Head = node;
           Head.Link = null;
       }
       else
       {
           Node current = Head;
           while(current.Link != null)
           {
               current = current.Link;
           }
           current.Link =  node;
       }
    }

    @Override
    public T get(int index)
    {
        Node current = Head;
        int count = 0;

        while(current != null)
        {
            if(count == index)
            {
                return current.Data;
            }
            count++;
            current = current.Link;
        }
        return null;
    }

    @Override
    public boolean remove(T item)
    {
        Node temp = Head, prev = null;

        if (temp != null && temp.Data.equals(item))
        {
            Head = temp.Link;
            return true;
        }

        while (temp != null && !temp.Data.equals(item))
        {
            prev = temp;
            temp = temp.Link;
        }

        if (temp == null) return false;

        prev.Link = temp.Link;
        return true;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            Node current = Head;

            @Override
            public boolean hasNext()
            {
                return current != null;
            }

            @Override
            public T next()
            {
                if(hasNext())
                {
                    T data = current.Data;
                    current = current.Link;
                    return data;
                }
                return null;
            }
        };
    }
}
