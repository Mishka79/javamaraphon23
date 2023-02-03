package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {


    public static void main(String[] args) {
        Node root = new Node();
        List<Node> nodes = new ArrayList<>();
        root.setValue(20);
        insertNode(14, root);
        insertNode(11, root);
        insertNode(5, root);
        insertNode(8, root);
        insertNode(16, root);
        insertNode(15, root);
        insertNode(18, root);
        insertNode(23, root);
        insertNode(22, root);
        insertNode(27, root);
        insertNode(24, root);
        insertNode(150, root);

        dfs(root, nodes);

        for (int i = 0; i < nodes.size(); i++) {

            for (int j = i + 1; j < nodes.size(); j++) {
                if (nodes.get(j).getValue() < nodes.get(i).getValue()) {
                    nodes.add(i, nodes.get(j));
                    nodes.remove(j + 1);
                }
            }

        }

        for (int n = 0; n < nodes.size(); n++) {
            System.out.print(nodes.get(n).toString());
        }

    }

    public static void insertNode(int value, Node root) {
        Node newNode = new Node();
        newNode.setValue(value);
        Node currentNode = root;
        Node parentNode;
        while (true) {
            parentNode = currentNode;
            if (value < currentNode.getValue()) {
                currentNode = currentNode.getLeftCh();
                if (currentNode == null) {
                    parentNode.setLeftCh(newNode);

                    return;
                }
            } else {
                currentNode = currentNode.getRightCh();
                if (currentNode == null) {
                    parentNode.setRightCh(newNode);

                    return;
                }
            }
        }
    }

    public static void dfs(Node root, List<Node> nodes) {

        Node currentNode = root;
        if (currentNode.getLeftCh() != null & currentNode.getRightCh() != null) {
            nodes.add(currentNode);
            dfs(currentNode.getLeftCh(), nodes);
            dfs(currentNode.getRightCh(), nodes);
        }
        if (currentNode.getRightCh() != null & currentNode.getLeftCh() == null) {
            nodes.add(currentNode);
            dfs(currentNode.getRightCh(), nodes);
        }
        if (currentNode.getLeftCh() != null & currentNode.getRightCh() == null) {
            nodes.add(currentNode);
            dfs(currentNode.getLeftCh(), nodes);
        }
        if (currentNode.getRightCh() == null & currentNode.getLeftCh() == null) {
            nodes.add(currentNode);

        }
    }
}
