package P325Container.Test;

import java.util.*;

public class collection_List_ArrL_LL_Steck {
    public static void main(String[] args) {
        Collection<Integer> collection = Arrays.asList(1, 2);
        Collection<Integer> collection1 = new ArrayList<>(Arrays.asList(4, 5));
        Integer[] arr = {11, 22};
//        collection.addAll(Arrays.asList(arr)); почему-то не работает
        System.out.println(collection);


        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        list.add(5);
        list.addAll(collection);
        list.addAll(Arrays.asList(5, 8));
        list.addAll(Arrays.asList(arr));
        list.add(3, 33);
        list.set(4, 44);
        System.out.println(list.indexOf(44));
        System.out.println(list.lastIndexOf(2));
//        list.clear();
        System.out.println(list);

        System.out.println();

        ArrayList<Integer> arrayList = new ArrayList<>(list);
        System.out.println(arrayList);
        arrayList.add(56);
        arrayList.set(4, 55);
        arrayList.add(5, 57);
//        arrayList.clear();
        arrayList.clone();//??
        arrayList.subList(2, 4);
        System.out.println(arrayList);

        LinkedList<Integer> ll = new LinkedList<>(list);
        System.out.println(ll.getFirst().equals(ll.element()));//возвращает exeption если пусто
        System.out.println(ll.peek().equals(ll.element()) + "|| getFirst = element = peek");//возвращает null если пусто
        System.out.println(ll.offer(99) + "|| offer = add = addlast");//возвращает null если пусто

        Stack<Integer> stack = new Stack<>();
        System.out.println("stack");
        stack.push(5);//put push толкать
        System.out.println(stack.empty());
        System.out.println(stack.pop());//возвращает верхний эллемент и удаляет его
        stack.add(5);
        stack.add(99);
        System.out.println(stack.peek());//возвращает верхний эллемент НЕ удаляет его
        stack.size();
        System.out.println(stack.lastElement());
        System.out.println(stack.capacity());


    }
}
