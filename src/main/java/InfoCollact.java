//https://habr.com/ru/post/237043/

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class InfoCollact {
    public static void main(String[] args) {
        InterfaceVars info = new InterfaceVars();
        info.speed();
        String paths = "https://habr.com/ru/post/237043/";
        System.out.println("Link info " + paths);
        int[] arr = {4, 5, 6};
//        List<Integer>li = Arrays.asList(arr);//why do not working
    }
}

class InterfaceVars {

    void collectionI() {
        //save value
        //Callection have Iterator
        //List have Iterator and ListIterator
        Collection<String> al_c = new ArrayList<>();
        Collection<String> ll_c = new LinkedList<>();
        Collection<String> hs_c = new HashSet<>();
        Collection<String> ts_c = new TreeSet<>();
        Collection<String> pq_c = new PriorityQueue<>();
        Collection<String> lhs_c = new LinkedHashSet<>();
        Collection<String> c = Arrays.asList("collection", "Одиночные эллементы", "добавлено несколько новых методов для работы с лямбдами (такие как stream(), parallelStream(), removeIf(Predicate<? super E> filter) и др.).");

        // whot is the difference between methods
        int[] arr = {4, 5, 6};
        Collection<String> al_c2 = new ArrayList<>();
        List<Integer> list_al = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> al_al = new ArrayList<>();
        List<Object> al_alA_Arr = Arrays.asList(arr);//why do not working
    }

    void list() {
        List<String> listAL = new ArrayList<>();
        List<String> listLL = new LinkedList<>();

        listAL.add("как и Vector является реализацией динамического массива объектов");
        listAL.add("Позволяет хранить любые данные, включая null в качестве элемента");
        listAL.add("основана на обычном массиве");
        listAL.add("следует применять, если в процессе работы с коллекцией предплагается " +
                "частое обращение к элементам по индексу");
        listAL.add(" O(1)");
        listAL.add("рекомендуется избегать, если требуется частое удаление/добавление" +
                " элементов в середину коллекции");

        listLL.add("Позволяет хранить любые данные, включая null");
        listLL.add("двунаправленный связный список");
        listLL.add("Благодаря этому, добавление и удаление из середины," +
                " доступ по индексу, значению происходит за линейное время O(n)");
        listLL.add("а из начала и конца за константное O(1)");
        listLL.add("Так же, ввиду реализации, данную коллекцию можно " +
                "использовать как стек или очередь");
        listLL.add(" На Хабре также есть статья ");
    }

    void set() {
        Set<String> setHS = new HashSet<>();
        Set<String> setTS = new TreeSet<>();
        Set<String> setLHS = new LinkedHashSet<>();
        SortedSet<String> sortedSetTS = new TreeSet<>();//??
        NavigableSet<String> navigableSet = new TreeSet<>();//??


        setHS.add("базирующаяся на HashMap");
        setHS.add("Внутри использует объект HashMap для хранения данных");
        setHS.add("В качестве ключа используется добавляемый элемент, " +
                "а в качестве значения — объект-пустышка (new Object())");
        setHS.add("Из-за особенностей реализации порядок элементов не гарантируется при добавлении.");

        setLHS.add("отличается от HashSet только тем, что в основе лежит LinkedHashMap вместо HashMap");
        setLHS.add("Благодаря этому отличию порядок элементов при обходе " +
                "коллекции является идентичным порядку добавления элементов");

        setTS.add(" содержит в себе объект NavigableMap");
        setTS.add("Comparator");
        setTS.add(" \"natural ordering\".");

    }

    void queue_dequeue() {
        Queue<String> queueLL = new LinkedList<>();
        Queue<String> queuePQ = new PriorityQueue<>();
        Queue<String> queueAD = new ArrayDeque<>();
        Deque<String> dequeLL = new LinkedList<>();
        Deque<String> dequeAD = new ArrayDeque<>();
        Deque<String> dequeLBD = new LinkedBlockingDeque<>();

        queueLL.add("FIFO (first-in-first-out)");
        queueLL.add("Помимо методов, определённых в интерфейсе Collection");
        queueLL.add("определяет дополнительные методы для извлечения и добавления элементов в очередь");
        queueLL.add("в пакете java.util.concurrent и подробно рассматриваются в данном обзоре.");

        queuePQ.add("является единственной прямой реализацией интерфейса Queue");
        queuePQ.add("LinkedList, который так же реализует этот интерфейс, но был реализован намного раньше. ");
        queuePQ.add("возможность управления порядком элементов.");
        queuePQ.add("сортируются с использованием «natural ordering»,");
        queuePQ.add("Comparator");
        queuePQ.add(" не поддерживает null");

        queueAD.add("extends LIFO ");
        queueAD.add("представляет собой реализацию с использованием массивов, " +
                "подобно ArrayList, но не позволяет обращаться к элементам по " +
                "индексу и хранение null");
        queueAD.add("Как заявлено в документации, коллекция работает быстрее чем Stack," +
                " если используется как LIFO коллекция");
        queueAD.add("а также быстрее чем LinkedList, если используется как FIFO.");

        dequeAD.push("вместо Vector sinc — реализация динамического массива объектов");
        dequeAD.push("вместо Stack — данная коллекция является расширением коллекции Vector");
        dequeAD.push("рекомендуется использовать вместо Vector и Stack");
    }

    void map() {
        // save kay, value
        //взаимодействует с Collection с помощью: EntrySet(), values(), keySet()
        Map<Integer, String> hm_m = new HashMap<>();
        Map<Integer, String> tm_m = new TreeMap<>();
        Map<Integer, String> lhm_m = new LinkedHashMap<>();
        Map<Integer, String> whm_m = new WeakHashMap<>();
        Map<Integer, String> m = null; // can not be used Arrays.asList(

        // whot is the difference between methods
        Map<Integer, String> hm_m2 = new HashMap<>();
        HashMap<Integer, String> hm_hm = new HashMap<>();

        hm_m.put(0, "позволяет использовать null как в качестве ключа, так и значения");
        hm_m.put(1, "данная коллекция не является упорядоченной: порядок хранения элементов зависит от хэш-функции");
        hm_m.put(2, "O(1)-O(n)");

        tm_m.put(0, "на красно-чёрных деревьях");
        tm_m.put(1, "является упорядоченной");
        tm_m.put(2, "По-умолчанию, коллекция сортируется по ключам с использованием принципа natural ordering");
        tm_m.put(3, "Comparator");
        tm_m.put(4, "O(log(n))-O(n)");

        lhm_m.put(0, "это упорядоченная реализация хэш-таблицы");
        lhm_m.put(1, "порядок итерирования равен порядку добавления элементов");
        lhm_m.put(2, "недостаток — увеличение памяти, которое занимет коллекция. Более подробная информация изложена в этой статье.");
        lhm_m.put(3, "O(1)-O(n)");

        whm_m.put(0, "реализация хэш-таблицы, которая организована с использованием weak references");
        whm_m.put(1, "Garbage Collector автоматически удалит элемент из коллекции при следующей сборке мусора, если на ключ этого элеметна нет жёстких ссылок. ");

    }

    void speed() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("https://habrastorage.org/r/w1560/files/364/d7e/419/364d7e41907e453b8e60128cdac459dc.png");
        System.out.println(arrayList.get(0));
    }

}