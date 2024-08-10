import java.util.*;

/*
class MyComparator implements Comparator<Integer>{

    public int compare(Integer a, Integer b) {
        return a%2 - b%2;
    }
}

public class Sorting {

    public static void main(String[] args) {
    Integer[] arre = {721, 201, 295, 90, 401, 391, 444};
        System.out.println(Arrays.toString(arre));
        Arrays.sort(arre, new MyComparator());
        System.out.println(Arrays.toString(arre));

    }

}
*/
class Person
//        implements Comparable<Person>
{
    String name;
    int age;
    Person(String name, int age){
        this.name=name;
        this.age = age;
    }


//    public int compareTo(Person o) {
//        return this.name.charAt(0) - o.name.charAt(0);
//    }
}
public class Sorting{
    public static void main(String[] args) {


        List<Person> list = new ArrayList<>();
        list.add(new Person("AntónioGonzalez", 280));
        list.add(new Person("DeniseIlunga", 277));
        list.add(new Person("FranciscaMolina", 116));
        list.add(new Person("CeciliaDai", 29));
        list.add(new Person("AbdullahiKhatoon", 180));
        list.add(new Person("XiaoyanBarry", 21));


        Comparator<Person> comp = new Comparator<Person>() {

            public int compare(Person o1, Person o2) {
                if(o1.age>o2.age){

                    return 1;
                }else{
                    return -1;
                }
            }
        };
        for (Person p : list){
            System.out.print("name : "+p.name+"\t"+"age :" + p.age + "\n");
        }
        System.out.println("\n");
        Collections.sort(list,comp);
        for (Person p : list){
            System.out.print("name : "+p.name+"\t"+"age :" + p.age + "\n");
        }


    }
}