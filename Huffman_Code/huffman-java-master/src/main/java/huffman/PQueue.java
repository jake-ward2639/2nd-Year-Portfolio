package huffman;

import huffman.tree.Node;
import java.util.ArrayList;
import java.util.List;
/**
 * A priority queue of @Node@ objects. Each node has an int as its label representing its frequency.
 * The queue should order objects in ascending order of frequency, i.e. the lowest first.
 */
public class PQueue {

    private List<Node> queue;

    public PQueue() {
        queue = new ArrayList<>();
    }

    /**
     * Add a node to the queue. The new node should be inserted at the point where the frequency of next node is
     * greater than or equal to that of the next one.
     * @param n The node to enqueue.
     */
    public void enqueue(Node n) {
        if(queue.isEmpty()){
            queue.add(n);
        }
        else{
            int initial_size_of_loop = queue.size();
            for(int i = 0; i < initial_size_of_loop; i++){
                Node currentNode = queue.get(i);
                if (n.getFreq() <= currentNode.getFreq()) {
                    queue.add(i, n);
                    break;
                }
                if (i+1 == initial_size_of_loop){
                    queue.add(i+1, n);
                }
                //the size of the loop needed to be declared outside the loop so as not to create an INFINITE loop
            }
        }
        System.out.println(queue);
    }

    /**
     * Remove a node from the queue.
     * @return  The first node in the queue.
     */
    public Node dequeue() {
        if(queue.isEmpty()){
            return null;
        }
        Node removedNode = queue.get(0);
        queue.remove(0);
        return removedNode;
    }

    /**
     * Return the size of the queue.
     * @return  Size of the queue.
     */
    public int size() {
        return queue.size();
    }
}
