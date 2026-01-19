package Collections.linkedListsSection;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

//        LinkedList<String> placeTsToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        printItineraryThree(placesToVisit);
        testIterator(placesToVisit);
//        retrieveElement(placesToVisit);
//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);


    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");
        // Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        // Stack Methods
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); //removes the first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); //removes the first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); //removes the last element
        System.out.println(s3 + " was removed");

        //Queue/Dequeue poll methods
        String p1 = list.poll(); //removes the first element
        System.out.println(p1 + " was removed");
        String p2 = list.pollFirst(); //removes the first element
        System.out.println(p2 + " was removed");
        String p3 = list.pollLast(); //removes the last element
        System.out.println(p3 + " was removed");

        //Stack methods
        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop(); //removes the first element
        System.out.println(p4 + " was removed");
    }

    private static void retrieveElement(LinkedList<String> list){
        System.out.println("Retrieved element: " + list.get(4));//retrieves the element on the specific index

        System.out.println(("First element: " + list.getFirst()));//retrieves the first element
        System.out.println("Last element: " + list.getLast()); //retrieves the last element

        System.out.println("Darwin is at position: " + list.indexOf("Darwin")); //returns the index of the first occurrence of searched element
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne")); //returns the index of the last occurrence of searched element

        //Queue retrieval methods
        System.out.println("Element from element()" + list.element()); //retrieves the first element

        //Stack retrieval methods
        System.out.println("Element from peek()" +  list.peek());//retrieves the first element
        System.out.println("Element from peekFirst() " + list.peekFirst());//retrieves the first element
        System.out.println("Element from peekLast() " + list.peekLast());//retrieves the last element
    }

    private static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From " + list.get(i-1) +  " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void printItineraryTwo(LinkedList<String> list){

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list){
            System.out.println("--> From " + previousTown + " to " + town);
            previousTown = town;

        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void printItineraryThree(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From " + previousTown +  " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list){
        var iterator = list.listIterator();
        while (iterator.hasNext()){
//            System.out.println(iterator.next());
            if (iterator.next().equalsIgnoreCase("brisbane")){
                iterator.add("Lake Wivenhoe");
            }
        }

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
