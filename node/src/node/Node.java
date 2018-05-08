package node;

public class Node {

    //estructura de datos
    /**
     * the objects of the class node are created which will be used for all the
     * functions of the list
     */
    public String name;
    public int age;//Ingformacion estudiante
    public int id;

    public Node next;//Sera el apuntador, con mismo tipo de dato de la clase

    public Node() {
    }

    /**
     * a node is created which will have three parameters for each element in
     * the list
     *
     * @param name
     * @param age
     * @param id
     */
    public Node(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    /**
     * is used to pass a node to string or print in this case
     *
     * @return
     */
    public String toString() {
        return "\nName: " + this.name + "\tEdad: " + this.age + "\tID: " + this.id + "\n";
    }

    /**
     * a clone element is created to clone a node from the list
     *
     * @return
     */
    public Node clone() {
        Node clone = new Node(this.name, this.age, this.id);
        return clone;
    }

}

