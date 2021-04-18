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

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
//Test LinkedList
        linkedList.add(40);
        linkedList.add(10);
        linkedList.add(20);
        System.out.println((linkedList));
//Test Queue
        MyQueue<String> vine = new MyQueue<>();
        vine.add("Merlo");
        vine.add("Alazan Valley");
        vine.add("Mademoiselle comedie rose");
         System.out.println(vine);

 //Test Stack
    MyStack <Integer> stack = new  MyStack <>(10);

        stack.push(101);
        stack.push(123);
        stack.push(341);
        stack.push(111);
        System.out.println(stack);
//Test HashMap
        MyHashMap <Integer, String> fruits = new MyHashMap<>();
        fruits.put(123, "Banana");
        fruits.put(234, "Orange");
        fruits.put(23, "Grape");
        System.out.println("Val at 123 "+fruits.get(123));
        System.out.println("Val at 234 "+fruits.get(234));
        System.out.println("Val at 23 "+fruits.get(23));
        System.out.println("Val at 2 "+fruits.get(2));

}
}


