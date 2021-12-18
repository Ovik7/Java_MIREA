package com.company;

public class LabClassDriver implements LabClassUI
{
    public static void main(String[] args)
    {
        LabClassUI[] students = new Student[5];
        students[0] = new Student("Аникин Артём Сергеевич", 4);
        students[1] = new Student("Быхало Мария Игоревна", 2);
        students[2] = new Student("Грузилова Валерия Дмитриевна", 5);
        students[3] = new Student("Жидков Ярослав Алексеевич", 1);
        students[4] = new Student("Лёвин Александр Александрович", 1);
        QuickSort.quickSort((Student[]) students, 0, students.length - 1);
        Student.findName((Student[])students, "Грузилова Валерия Дмитриевна");
        Student.findName((Student[])students, "Лёвин Александр Александрович");
        Student.findName((Student[])students, "qwe qwe qwe");
    }
}