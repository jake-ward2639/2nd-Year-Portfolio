package huffman;

import huffman.tree.Branch;
import huffman.tree.Leaf;
import huffman.tree.Node;

import java.util.*;
/**
 * The class implementing the Huffman coding algorithm.
 */
public class Huffman {

    /**
     * Build the frequency table containing the unique characters from the String `input' and the number of times
     * that character occurs.
     *
     * @param   input   The string.
     * @return          The frequency table.
     */
    public static Map<Character, Integer> freqTable (String input) {
        if (input == null || input.length() == 0) {
            return null;
        }
        Map<Character, Integer> ft = new HashMap<>();
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if (ft.containsKey(c)){
                int temp_key = ft.get(c);
                ft.remove(c);
                ft.put(c,temp_key+1);
            } else {
                ft.put(c,1);
            }
        }
        return ft;
    }

    /**
     * Given a frequency table, construct a Huffman tree.
     *
     * First, create an empty priority queue.
     *
     * Then make every entry in the frequency table into a leaf node and add it to the queue.
     *
     * Then, take the first two nodes from the queue and combine them in a branch node that is
     * labelled by the combined frequency of the nodes and put it back in the queue. The right hand
     * child of the new branch node should be the node with the larger frequency of the two.
     *
     * Do this repeatedly until there is a single node in the queue, which is the Huffman tree.
     *
     * @param freqTable The frequency table.
     * @return          A Huffman tree.
     */
    public static Node treeFromFreqTable(Map<Character, Integer> freqTable) {
        if(freqTable == null){
            return null;
        }
        PQueue HuffmanQueue = new PQueue();
        for (Map.Entry<Character, Integer> entry : freqTable.entrySet()) {
            Leaf leaf = new Leaf(entry.getKey(), entry.getValue());
            HuffmanQueue.enqueue(leaf);
        }
        while (HuffmanQueue.size() != 1) {
            Node Leaf1 = HuffmanQueue.dequeue();
            Node Leaf2 = HuffmanQueue.dequeue();
            Branch branch;
            if (Leaf1.getFreq() == Leaf2.getFreq() || Leaf1.getFreq() > Leaf2.getFreq()) {
                branch = new Branch(Leaf1.getFreq() + Leaf2.getFreq(), Leaf2, Leaf1);
            } else {
                branch = new Branch(Leaf1.getFreq() + Leaf2.getFreq(), Leaf1, Leaf2);
            }
            HuffmanQueue.enqueue(branch);
        }
        Node HuffmanTree = HuffmanQueue.dequeue();
        return HuffmanTree;
    }

    /**
     * Construct the map of characters and codes from a tree. Just call the traverse
     * method of the tree passing in an empty list, then return the populated code map.
     *
     * @param tree  The Huffman tree.
     * @return      The populated map, where each key is a character, c, that maps to a list of booleans
     *              representing the path through the tree from the root to the leaf node labelled c.
     */
    public static Map<Character, List<Boolean>> buildCode(Node tree) {
        ArrayList<Boolean> new_list = new ArrayList();
        return tree.traverse(new_list);
    }

    /**
     * Create the huffman coding for an input string by calling the various methods written above. I.e.
     *
     * + create the frequency table,
     * + use that to create the Huffman tree,
     * + extract the code map of characters and their codes from the tree.
     *
     * Then to encode the input data, loop through the input looking each character in the map and add
     * the code for that character to a list representing the data.
     *
     * @param input The data to encode.
     * @return      The Huffman coding.
     */
    public static HuffmanCoding encode(String input) {
        Map<Character, Integer> ft = freqTable(input);
        Node HuffmanTree = treeFromFreqTable(ft);
        Map<Character, List<Boolean>> fin_map = buildCode(HuffmanTree);
        List<Boolean> data_list = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            List temp_bool_list = fin_map.get(c);
            for(int x=0;x<temp_bool_list.size();x++){
                data_list.add((Boolean) temp_bool_list.get(x));//convert to bool before adding
            }
        }
        System.out.println(data_list);
        return new HuffmanCoding(fin_map, data_list);
    }

    /**
     * Reconstruct a Huffman tree from the map of characters and their codes. Only the structure of this tree
     * is required and frequency labels of all nodes can be set to zero.
     *
     * Your tree will start as a single Branch node with null children.
     *
     * Then for each character key in the code, c, take the list of booleans, bs, corresponding to c. Make
     * a local variable referring to the root of the tree. For every boolean, b, in bs, if b is false you want to "go
     * left" in the tree, otherwise "go right".
     *
     * Presume b is false, so you want to go left. So long as you are not at the end of the code so you should set the
     * current node to be the left-hand child of the node you are currently on. If that child does not
     * yet exist (i.e. it is null) you need to add a new branch node there first. Then carry on with the next entry in
     * bs. Reverse the logic of this if b is true.
     *
     * When you have reached the end of this code (i.e. b is the final element in bs), add a leaf node
     * labelled by c as the left-hand child of the current node (right-hand if b is true). Then take the next char from
     * the code and repeat the process, starting again at the root of the tree.
     *
     * @param code  The code.
     * @return      The reconstructed tree.
     */
    public static Node treeFromCode(Map<Character, List<Boolean>> code) {
        Branch root = new Branch(0,null,null);
        ArrayList<Character> chars = new ArrayList();
        for (Map.Entry<Character, List<Boolean>> entry : code.entrySet()) {
            chars.add(entry.getKey());
        }
        for(int c=0;c<chars.size();c++){
            Branch current_node = root;
            List bs = code.get(c);
            for(int b=0;b<bs.size();b++){
                if(!((Boolean) bs.get(b))){ //simplified if b in bs is == false
                    if(b == bs.size()){
                        current_node.setLeft(new Leaf((char) c, 0));
                    }
                    else if(current_node.getLeft() == null){
                        current_node.setLeft(new Branch(0, null, null));
                    }
                    current_node = (Branch) current_node.getLeft();
                }
                else if ((Boolean) bs.get(b) == true){
                    if(b == bs.size()){
                        current_node.setRight(new Leaf((char) c, 0));
                    }
                    else if(current_node.getRight() == null){
                        current_node.setRight(new Branch(0, null, null));
                    }
                    current_node = (Branch) current_node.getRight();
                }
            }
            root = current_node;
        }
        return root;
    }


    /**
     * Decode some data using a map of characters and their codes. To do this you need to reconstruct the tree from the
     * code using the method you wrote to do this. Then take one boolean at a time from the data and use it to traverse
     * the tree by going left for false, right for true. Every time you reach a leaf you have decoded a single
     * character (the label of the leaf). Add it to the result and return to the root of the tree. Keep going in this
     * way until you reach the end of the data.
     *
     * @param code  The code.
     * @param data  The encoded data.
     * @return      The decoded string.
     */
    public static String decode(Map<Character, List<Boolean>> code, List<Boolean> data) {
        throw new UnsupportedOperationException("Method not implemented");
    }
}
