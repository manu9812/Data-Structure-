package node;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class List {

    /**
     * a head node is created that is equal to null
     */
    Node head = null;//empty list

    /**
     * the following function validates the status of the list depending on
     * whether it is empty or full, a Boolean data type returns
     *
     * @return
     */
    public boolean isEmpty() { //si el nodo esta vacio 
        return head == null ? true : false;
    }

    /**
     * a method is created that positions a data at the beginning of the list,
     * always aiming everything so as not to lose any element of the list
     *
     * @param newNode
     */
    public void InsertAtBegin(Node newNode) {//primer nodo
        newNode.next = head;
        head = newNode;//apuntamos para no perder la lista
    }

    /**
     * a method is created that positions a data at the end of the list, always
     * aiming everything so as not to lose any element of the list a method is
     * created that positions in any index of the list a new datum, always
     * aiming everything so as not to lose any element of the list
     *
     * @param newNode
     */
    public void insertAtEnd(Node newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    /**
     * a method is created that positions in any index of the list a new datum,
     * always aiming everything so as not to lose any element of the list an
     * index is requested to search which would be a limit for a for cycle that
     * stops until it reaches the index to search and adds the new element to
     * the list
     *
     * @param newNode
     * @param index
     */
    public void InsertAtIndex(Node newNode, int index) {
        Node temp;
        Node pre = head;
        if (index == 0) {
            InsertAtBegin(newNode);//insertamos el nodo
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            pre.next = pre;
        }
        temp = pre.next;
        newNode.next = temp;
        pre.next = newNode;
    }

    /**
     * the method removes the first node that is equal to the list head we use
     * the garbage collector to really remove the contained data as they waste
     * memory
     */
    public void DeleteAtBegin() {
        Node temp = head;
        head = head.next;
        temp = null;
        System.gc();
    }

    /**
     * the method removes the last node that is equal to the list queue the
     * whole list is traversed until it reaches the penultimate element of the
     * lizta and the following is deleted
     *
     * we use the garbage collector to really remove the contained data as they
     * waste memory
     */
    public void DeleteAtEnd() {
        Node temp;
        Node pre = head;
        while (pre.next.next != null) {
            pre = pre.next;
        }

        temp = pre.next;
        pre.next = null;
        System.gc();
    }

    /**
     * the method to eliminate a node that depends on its index in the lizta by
     * means of a cycle that runs it until it reaches the desired index we use
     * the garbage collector to really remove the contained data as they waste
     * memory
     *
     * @param index
     */
    public void deleteAtIndex(int index) {
        Node temp = head;
        if (index == 0) {
            DeleteAtBegin();
            System.gc();
            for (int i = 0; i < index - 1; i++)
            {
                temp = temp.next;
            }
            Node toDelete = temp.next;
            temp.next = toDelete.next;
            toDelete = null;
            System.gc();
        }
    }

    /**
     * a push is made to each node in the list, making it a Strack in addition
     * to creating a temporary list which at the end of everything will be the
     * inverted list.
     *
     * @throws IOException
     */
    public void reverse() throws IOException {
        Stack tempList = new Stack();
        Node temp = head;
        while (temp != null) {
            tempList.Push((Node) temp.clone());
            temp = temp.next;
        }
        Node temp2 = tempList.head;
        head = tempList.head;
    }

    /**
     * in this a while conditional is used to move through the list every
     * temporary node goes to the to sting method, it is printed and then it
     * changes to the next position and so it prints the whole list
     *
     * @throws IOException
     */
    public void print() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            Node temp = head;
            while (temp != null) {
                bw.write(temp.toString());
                temp = temp.next;
                bw.flush();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * the index of the node to be obtained is used as the input parameter, the
     * list is traversed to the desired index and the requested node returns
     *
     * @param index
     * @return
     */
    public Node getNode(int index) {
        if (listSize() < index) {
            return null;
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }
    }

    /**
     * the list is traversed and for every node that is passed, a counter is
     * incremented, which at the end of the list returns the size of this
     *
     * @return
     */
    public int listSize() {
        int counter = 0;
        Node temp = head;
        while (temp != null) {
            counter += 1;
            temp = temp.next;
        }
        return counter;
    }

    /**
     * The Sorting method Quicksort was developed by Hoare in the year 1960. It
     * is the fastest sort algorithm. It is based on the divide and conquer
     * technique, which consists in subdividing the array into smaller arrays,
     * and ordering these. To make this division, take a value of the array as a
     * pivot, and move all the minor elements that this pivot to its left, and
     * the largest to its right. Then the same method is applied to each of the
     * two parts in which the array is divided. After choosing the pivot, two
     * searches are carried out: One from left to right, looking for an element
     * greater than the pivot Another from right to left, looking for an element
     * smaller than the pivot. When the two previous elements have been found,
     * they are exchanged, and the search is continued until the two searches
     * are found.
     *
     * this informatios is taken from:
     * http://puntocomnoesunlenguaje.blogspot.com.co/2012/12/java-quicksort.html
     */
    public void quickSort() {
        if (!isEmpty()) {
            List leftList = new List();
            List rightList = new List();
            Node pivot = head;
            Node temp = head.next;

            while (temp != null) {
                if (temp.age < pivot.age) {
                    leftList.insertAtEnd(temp.clone());
                } else {
                    rightList.insertAtEnd(temp.clone());
                }
                temp = temp.next;
            }
            leftList.quickSort();
            rightList.quickSort();
            pivot.next = rightList.head;
            leftList.insertAtEnd(pivot);
            head = leftList.head;
        }
    }

    /**
     * Is a search algorithm that finds the position of a value in an ordered
     * array , compares the value with the element in the middle of the array,
     * if they are not equal, the half in which the value can not be is
     * eliminated and the Search continues in the remaining half until the value
     * is found.
     *
     * this informatios is taken from:
     * https://es.wikipedia.org/wiki/B%C3%BAsqueda_binaria
     *
     * @param enter
     * @return
     */
    public int binarySearch(int enter) {
        int upperBound = listSize();
        int lowerBound = 0;
        while (lowerBound < upperBound) {
            int middle = (upperBound + lowerBound) / 2;
            if (enter == getNode(middle).age) {

                return (listSize() / 2);
            } else if (getNode(middle).age > enter) {
                upperBound = middle - 1;
            } else {
                lowerBound = middle + 1;
            }
        }
        return -1;
    }

    /**
     * to update any index you will have to ask for the index that you want to
     * update and then using the different programmed methods previously entered
     * depending on the option since it could be at the beginning at the end or
     * in index
     *
     * @param index
     */
    public void update(int index) {
        Node temp = head;
        Node pre;
        if (index == 0) {
            InsertAtBegin(new Node("nuevo", 00, 00000));
        } else if (index == listSize()) {
            InsertAtBegin(new Node("nuevo", 00, 00000));
            return;
        } else if (index > listSize()) {
            InsertAtBegin(new Node("nuevo", 00, 00000));

        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        /**
         * a list of students is created and each method with the student list
         * is called and thus the operation of each of the following functions
         * is validated.
         */
        List students = new List();
        students.InsertAtBegin(new Node("prueba1", 11, 11111));
        students.InsertAtBegin(new Node("prueba2", 12, 22222));
        students.InsertAtBegin(new Node("prueba3", 13, 33333));
        students.InsertAtBegin(new Node("prueba4", 14, 44444));
        students.InsertAtBegin(new Node("prueba5", 15, 55555));
        students.insertAtEnd(new Node("prueba6", 16, 66666));
        students.InsertAtBegin(new Node("prueba7", 17, 77777));
        students.InsertAtIndex(new Node("prueba8", 18, 88888), 1);
        students.print();
        System.out.println("\n------------------Delete At Begin-----------------");
        students.DeleteAtBegin();
        students.print();
        System.out.println("\n------------------Delete At end-----------------");
        students.DeleteAtEnd();
        students.print();
        System.out.println("\n------------------Delete At index-----------------");
        System.out.println("se puede pedir el indice por pantalla el numero pero en este caso sera un 0");
//        int index=Integer.parseInt(br.readLine());
        int index = 0;
        students.deleteAtIndex(index);
        students.print();
        System.out.println("\n------------------inverse of the list-----------------");
        students.reverse();
        students.print();
        System.out.println("\n------------------quick sort-----------------");
        students.quickSort();
        System.out.println();
        students.print();
        System.out.println("\n------------------Binary search-----------------");
        System.out.println("enter the index");
        int parameter = Integer.parseInt(br.readLine());
        System.out.println(students.binarySearch(parameter));
        System.out.println("\n------------------Update the list-----------------");
        System.out.println("se puede pedir por pantalla el numero pero en este caso sera un 0");
        System.out.println("\nACTUALIZANDO LA LISTA\n");
//         index=Integer.parseInt(br.readLine());
        index = 8;
        students.update(index);
        students.print();
        
    }
}
