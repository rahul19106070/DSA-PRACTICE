class LRUCache {

    Node head=new Node(0,0),tail=new Node(0,0);
    HashMap<Integer,Node> map=new HashMap<Integer,Node>();
    int cap;
    public LRUCache(int capacity) {
      cap=capacity;
      head.next=tail;
      tail.prev=head;
    }
    
    public int get(int key) {
         if(map.containsKey(key)){
             Node y=map.get(key);
             remove(y);
             insert(y);
             return y.value;
         }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
            }
        if(map.size()==cap){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
    public void remove(Node node){
        map.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public void insert(Node node){
        map.put(node.key,node);
        Node headnext=head.next;
        head.next=node;
        node.prev=head;
        headnext.prev=node;
        node.next=headnext;
    }
    class Node{
        int key,value;
        Node prev,next;
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */