class BrowserHistory {

    class Node {
        Node next;
        Node prev;
        String val;

        public Node() {
            this.next = null;
            this.prev = null;
            this.val = "";
        }

        public Node(String s) {
            this.next = null;
            this.prev = null;
            this.val = s;
        }
    }

    Node head = new Node();
    Node tail;

    public BrowserHistory(String homepage) {
        head.val = homepage;
        tail = head;
    }

    public void visit(String url) {
        Node curr = new Node(url);
        tail.next = curr;
        curr.prev = tail;
        tail = curr;
    }

    public String back(int steps) {
        Node temp = tail;
        while (steps > 0 && temp.prev != null) {
            temp = temp.prev;
            steps--;
        }
        tail = temp;
        return temp.val;
    }

    public String forward(int steps) {
        Node temp = tail;
        while (temp.next != null && steps > 0) {
            temp = temp.next;
            steps--;
        }
        tail = temp;
        return temp.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */