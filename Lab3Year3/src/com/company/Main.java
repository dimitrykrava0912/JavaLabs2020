package com.company;
//var4 pattern composite
//Визначити специфікації класів для подання файлової системи у вигляді
//дерева об'єктів (файл - листовий об'єкт, каталог - вузловий). Кожний
//об'єкт має атрибут розміру (для файлу задається в конструкторі, для
//каталогів обчислюється). Реалізувати бізнес-метод отримання розміру для
//класу каталогу.
public class Main {

    public static void main(String[] args) {

        File file1=new File("File1",16);
        File file2=new File("File2",24);
        File file3=new File("File3",40);
        Folder folder1=new Folder("Folder1");
        Folder folder2=new Folder("Folder2");
        Folder folder3=new Folder("Folder3");
        folder3.add(file3);
        folder2.add(file2);
        folder2.add(folder3);
        folder1.add(folder2);
        folder1.add(file1);
        System.out.println("size of folder is -> "+folder1.getSize());

    }
}
