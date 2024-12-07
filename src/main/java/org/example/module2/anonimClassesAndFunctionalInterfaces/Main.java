package org.example.module2.anonimClassesAndFunctionalInterfaces;

public class Main {
    public static void main(String[] args) {
        useInterfacePrintable();
        useInterfaceConcationble();
    }

    public static void useInterfaceConcationble() {
        Concationble concationbleWithLetterO = new Concationble<String, String>() {
            @Override
            public String concat(String o, String o2) {
                return o + 'о' + o2;
            }
        };
        System.out.println(" ------- составные слова через букву о ---------- ");
        System.out.println(concationbleWithLetterO.concat("лес", "парк"));
        System.out.println(concationbleWithLetterO.concat("пар", "воз"));
        System.out.println(" ------------------------------ ");
        Concationble concationblePeopleName = new Concationble<String, String>() {
            @Override
            public String concat(String o, String o2) {
                return o + ' ' + o2;
            }
        };

        System.out.println(" ------- вывод фамилии и имени человека ---------- ");
        System.out.println(concationblePeopleName.concat("Ирина", "Петровна"));
        System.out.println(concationblePeopleName.concat("Василиса", "Альбертовна"));
        System.out.println(" ------------------------------ ");
        Concationble concationbleEnimal = new Concationble<String, String>() {
            @Override
            public String concat(String name, String family) {
                return "Животное: " + name +", семейство - " + family;
            }
        };

        System.out.println(" ------- вывод информации о животных и его семействе ---------- ");
        System.out.println(concationbleEnimal.concat("лисица", "псовые"));
        System.out.println(concationbleEnimal.concat("барсук", "куньи"));
        System.out.println(concationbleEnimal.concat("выдра", "куньи"));
        System.out.println(concationbleEnimal.concat("леопард", "кошачьих"));
    }




    public static void useInterfacePrintable() {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Получилось создать первый анонимный класс!");
                System.out.println();
            }
        };
        printable.print();
        Printable printableTwo = new Printable() {
            @Override
            public void print() {
                System.out.println(" ------------------------------ ");
                System.out.println(" --- Второй анонимный класс --- ");
                System.out.println();
                System.out.println("Успешно запущен. Вывод в консоль состоялся");
                System.out.println(" ------------------------------ ");
                System.out.println();
            }
        };
        printableTwo.print();
    }
}

@FunctionalInterface
interface Printable {
    void print();
}


@FunctionalInterface
interface Concationble<T, V> {
    String concat(T t, V v);
}

