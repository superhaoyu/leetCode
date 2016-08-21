public class Node{
  Node prev, next;
  int key, value;
  public Node(int key; int value){
    this.key = key;
    this.value = value;
  }
}

public class LRUCache{
  Node head, tail;
  int capacity, count;
  HashMap<Integer, Node> map;

  public LRUCache(int capacity){
    this.capacity = capacity;
    head = new Node(0,0);
    tail = new Node(0,0);
    head.next = tail;
    head.prev = null;
    tail.prev = head;
    tail.next = null;
    map = new HashMap<Integer, Node>();

  }

  public void deleteNode(Node n){
    n.prev.next = n.next;
    n.next.prev = n.prev;
  }

  public void addToFirst(Node n){
    n.next = head.next;
    n.next.prev = n;
    n.prev = head;
    head.next = n;
  }

  public int get(key){
    if (map.get(key) != null){
      Node node = map.get(key);
      int result = node.value;
      deleteNode(node);
      addToFirst(node);
    }
  }


}
