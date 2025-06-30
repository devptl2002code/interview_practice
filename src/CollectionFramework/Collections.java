package CollectionFramework;
import java.util.*;

public class Collections {
    public static void main(String[] args) {

        // ==== List Interface ====
        System.out.println("----- List Interface -----");

        // ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Apple");
        arrayList.add(1, "Mango");
        arrayList.remove("Banana");
        arrayList.set(0, "Guava");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("One");
        linkedList.addFirst("Zero");
        linkedList.addLast("Two");
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList: " + linkedList);

        // Vector
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.remove(1);
        System.out.println("Vector: " + vector);

        // Stack
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.pop();
        System.out.println("Stack: " + stack);

        // ==== Set Interface ====
        System.out.println("----- Set Interface -----");

        // HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Dog");
        hashSet.add("Cat");
        hashSet.add("Dog");
        hashSet.remove("Cat");
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Red");
        linkedHashSet.add("Green");
        linkedHashSet.add("Blue");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(30);
        System.out.println("TreeSet: " + treeSet);

        // ==== Queue Interface ====
        System.out.println("----- Queue Interface -----");

        // PriorityQueue
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);
        System.out.println("PriorityQueue Poll: " + priorityQueue);
        System.out.println("PriorityQueue Poll: " + priorityQueue.poll());

        // ArrayDeque (also implements Deque)
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Back");
        deque.removeFirst();
        deque.removeLast();
        System.out.println("ArrayDeque: " + deque);

        // ==== Map Interface ====
        System.out.println("----- Map Interface -----");

        // HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.remove(2);
        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Math", 90);
        linkedHashMap.put("Science", 80);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // TreeMap
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("b", "Ball");
        treeMap.put("a", "Apple");
        treeMap.put("c", "Cat");
        System.out.println("TreeMap: " + treeMap);

        // Hashtable
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("A", "Alpha");
        hashtable.put("B", "Beta");
        hashtable.remove("A");
        System.out.println("Hashtable: " + hashtable);
    }

}
