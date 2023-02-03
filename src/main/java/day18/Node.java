package day18;

public class Node {
    private int value;
    private Node leftCh;
    private Node RigthCh;
    public void printNode(){
        System.out.println(value+" ");
    }
    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        this.value=value;
    }

    public Node getLeftCh() {
        return this.leftCh;
    }

    public Node getRightCh() {
        return this.RigthCh;
    }

    public void setLeftCh(Node leftCh) {
        this.leftCh = leftCh;
    }
    public void setRightCh(Node RigthCh){
        this.RigthCh=RigthCh;
    }
    public String toString() {return value+" ";}
}
