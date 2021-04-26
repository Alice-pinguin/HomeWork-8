package Collection;

public class Main {
    public static void main(String[] args) {
//Test ArrayList
        MyArrayList<String> favoriteCity = new MyArrayList<>();
        favoriteCity.add("Deli");
        favoriteCity.add("New York");
        favoriteCity.add("Ottawa");
        favoriteCity.add("Paris");
        System.out.println(favoriteCity);


//Test LinkedList
        MyLinkedList <Integer> linkedList = new <Integer> MyLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        System.out.println(linkedList);
        linkedList.clear();
        System.out.println(linkedList);
//Test Queue
        MyQueue<String> vine = new MyQueue<>();
        vine.add("Merlo");
        vine.add("Mademoiselle comedie rose");
        vine.add("Shardone");
        vine.add("Pino Nuar");
        System.out.println(vine);
        System.out.println(vine.size());

        vine.remove(2);
        System.out.println(vine);
        vine.poll();
        System.out.println(vine);

 // Test Stack
    MyStack<String> names = new MyStack<>(10);
    names.push("Andrey");
    names.push("Oleg");
    names.push("Lina");
    names.push("Arina");
    System.out.println(names);
    names.remove(1);
    System.out.println(names);

  //  System.out.println(names);
    names.clear();
    System.out.println(names);

//Test HashMap
        MyHashMap <Integer, String> fruits = new MyHashMap<>();
        fruits.put(123, "Banana");
        fruits.put(23, "Grape");
        System.out.println("Val at 123 "+fruits.get(123));
        System.out.println("Val at 23 "+fruits.get(23));
        System.out.println("Val at 2 "+fruits.get(2));

}
}




