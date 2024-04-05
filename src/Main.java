public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Задание №1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        //Task 2
        System.out.println("Задание №2");
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameUpperCase);

        //Task 3
        System.out.println("Задание №3");
        fullName = "Иванов Семён Семёнович";
        String replaсeFullName = fullName.replace("ё", "e");
        System.out.println("Данные Ф. И. О. сотрудника — " + replaсeFullName);

    }
}