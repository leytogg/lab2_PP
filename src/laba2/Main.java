package laba2;

import java.util.Scanner;
/**
 * Головний клас програми, що виконує операції з об'єктами класу Students.
 */
public class Main
{
    public static void main(String[] args)
    {
        /**
         * Головний метод програми, що виконує ініціалізацію студентів та викликає методи для
         * виведення інформації про студентів.
         *
         * @param args Аргументи командного рядка.
         */
        Scanner scanner = new Scanner(System.in);
        Students[] dao = new Students[3];

        dao[0] = new Students(1, "Іванов", "Іван", "Іванович", 2000, "Київ, вул. Шевченка, 1", "0123456789", "Факультет комп'ютерних наук", 1, "A");
        dao[1] = new Students(2, "Петренко", "Петро", "Петрович", 2004, "Львів, вул. Франка, 2", "0987654321", "Факультет інженерії", 2, "A");
        dao[2] = new Students(3, "Сидоренко", "Сидір", "Сидорович", 2010, "Одеса, вул. Грушевського, 3", "0567891234", "Факультет комп'ютерних наук", 3, "C");

//        for (int i = 0; i < dao.length; i++)
//        {
//            System.out.println("Введіть дані для студента " + (i + 1) + ":");
//
//            System.out.print("ID(int): ");
//            int id = scanner.nextInt();
//            scanner.nextLine();  // Споживаємо новий рядок після введення int
//
//            System.out.print("Прізвище: ");
//            String lastName = scanner.nextLine();
//
//            System.out.print("Ім'я: ");
//            String firstName = scanner.nextLine();
//
//            System.out.print("По батькові: ");
//            String patronymic = scanner.nextLine();
//
//            System.out.print("Дата народження: ");
//            String birthDate = scanner.nextLine();
//
//            System.out.print("Адреса: ");
//            String address = scanner.nextLine();
//
//            System.out.print("Телефон: ");
//            String phone = scanner.nextLine();
//
//            System.out.print("Факультет: ");
//            String faculty = scanner.nextLine();
//
//            System.out.print("Курс(int): ");
//            int course = scanner.nextInt();
//            scanner.nextLine();  // int
//
//            System.out.print("Група: ");
//            String group = scanner.nextLine();
//
//            // Створюємо студента і додаємо до масиву
//            dao[i] = new Students(id, lastName, firstName, patronymic, birthDate, address, phone, faculty, course, group);
//        }
        for (int i = 0; i < dao.length; i++)
        {
            System.out.println(dao[i]);
        }

        // список студентів заданого факультету;
        System.out.println("Пошук за факультетом:\n");
        Students.infoFaculty(dao, "Факультет комп'ютерних наук");

        // список студентів, які народились після заданого року
        System.out.println("Пошук за датою:\n");
        Students.infoYear(dao, 2005);

        // список навчальної групи.
        System.out.println("Пошук за групою:\n");
        Students.infoGroup(dao, "A");
    }
}