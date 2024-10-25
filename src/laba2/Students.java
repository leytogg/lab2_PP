package laba2;

/**
 * Клас, що представляє студента з різними характеристиками, такими як ідентифікатор,
 * прізвище, ім'я, по батькові, дата народження, адреса, телефон, факультет, курс і група.
 *
 * @author Дацюк Роман
 */
public class Students
{
    private int id; // Ідентифікатор студента
    private String lastName; // Прізвище
    private String firstName; // Ім'я
    private String patronymic; // По батькові
    private int birthDate; // Дата народження
    private String address; // Адреса
    private String phone; // Телефон
    private String faculty; // Факультет
    private int course; // Курс
    private String group; // Група

    /**
     * Конструктор для створення об'єкта студента з вказаними характеристиками.
     *
     * @param id         Ідентифікатор студента.
     * @param lastName   Прізвище студента.
     * @param firstName  Ім'я студента.
     * @param patronymic По батькові студента.
     * @param birthDate  Дата народження студента.
     * @param address    Адреса студента.
     * @param phone      Телефон студента.
     * @param faculty    Факультет студента.
     * @param course     Курс студента.
     * @param group      Група студента.
     */
    public Students(int id, String lastName, String firstName, String patronymic,
                    int birthDate, String address, String phone, String faculty,
                    int course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    /**
     * Встановлює ідентифікатор студента.
     *
     * @param id Ідентифікатор студента.
     */
    public void setId(int id) {this.id = id;}

    /**
     * Встановлює прізвище студента.
     *
     * @param lastName Прізвище студента.
     */
    public void setLastName(String lastName) {this.lastName = lastName;}

    /**
     * Встановлює ім'я студента.
     *
     * @param firstName Ім'я студента.
     */
    public void setFirstName(String firstName) {this.firstName = firstName;}

    /**
     * Встановлює по батькові студента.
     *
     * @param patronymic По батькові студента.
     */
    public void setPatronymic(String patronymic) {this.patronymic = patronymic;}

    /**
     * Встановлює дату народження студента.
     *
     * @param birthDate Дата народження студента.
     */
    public void setBirthDate(int birthDate) {this.birthDate = birthDate;}

    /**
     * Встановлює адресу студента.
     *
     * @param address Адреса студента.
     */
    public void setAddress(String address) {this.address = address;}

    /**
     * Встановлює телефон студента.
     *
     * @param phone Телефон студента.
     */
    public void setPhone(String phone) {this.phone = phone;}

    /**
     * Встановлює факультет студента.
     *
     * @param faculty Факультет студента.
     */
    public void setFaculty(String faculty) {this.faculty = faculty;}

    /**
     * Встановлює курс студента.
     *
     * @param course Курс студента.
     */
    public void setCourse(int course) {this.course = course;}

    /**
     * Встановлює групу студента.
     *
     * @param group Група студента.
     */
    public void setGroup(String group) {this.group = group;}

    /**
     * Отримує ідентифікатор студента.
     *
     * @return Ідентифікатор студента.
     */
    public int getId() {return id;}

    /**
     * Отримує прізвище студента.
     *
     * @return Прізвище студента.
     */
    public String getLastName() {return lastName;}

    /**
     * Отримує ім'я студента.
     *
     * @return Ім'я студента.
     */
    public String getFirstName() {return firstName;}

    /**
     * Отримує по батькові студента.
     *
     * @return По батькові студента.
     */
    public String getPatronymic() {return patronymic;}

    /**
     * Отримує дату народження студента.
     *
     * @return Дата народження студента.
     */
    public int getBirthDate() {return birthDate;}

    /**
     * Отримує адресу студента.
     *
     * @return Адреса студента.
     */
    public String getAddress() {return address;}

    /**
     * Отримує телефон студента.
     *
     * @return Телефон студента.
     */
    public String getPhone() {return phone;}

    /**
     * Отримує факультет студента.
     *
     * @return Факультет студента.
     */
    public String getFaculty() {return faculty;}

    /**
     * Отримує курс студента.
     *
     * @return Курс студента.
     */
    public int getCourse() {return course;}

    /**
     * Отримує групу студента.
     *
     * @return Група студента.
     */
    public String getGroup() {return group;}

    @Override
    public String toString()
    {
        return  "Ідентифікатор: " + id +
                "\nПрізвище: " + lastName +
                "\nІм'я: " + firstName +
                "\nПо батькові: " + patronymic +
                "\nДата народження: " + birthDate +
                "\nАдреса: " + address +
                "\nТелефон: " + phone +
                "\nФакультет: " + faculty +
                "\nКурс: " + course +
                "\nГрупа: " + group +
                "\n---------------------------------------";
    }

    /**
     * Виводить інформацію про студентів за заданим факультетом.
     *
     * @param arr    Масив студентів.
     * @param faculty Факультет для пошуку.
     */
    public static void infoFaculty(Students[] arr, String faculty)
    {
        for(int i = 0; i < arr.length; i++)
        {
            Students s = arr[i];
            if (s.getFaculty().equals(faculty))
            {
                System.out.println(s);
            }
        }
    }

    /**
     * Виводить інформацію про студентів, які народились після заданого року.
     *
     * @param arr  Масив студентів.
     * @param date Рік для порівняння.
     */
    public static void infoYear(Students[] arr, int date)
    {
        for (int i = 0; i < arr.length; i++)
        {
            Students s = arr[i];
            if(s.getBirthDate() > date)
            {
                System.out.println(s);
            }
        }
    }

    /**
     * Виводить інформацію про студентів за заданою групою.
     *
     * @param arr  Масив студентів.
     * @param group Група для пошуку.
     */
    public static void infoGroup(Students[] arr, String group)
    {
        for (int i = 0; i < arr.length; i++)
        {
            Students s = arr[i];
            if(s.getGroup().equals(group))
            {
                System.out.println(s);
            }
        }
    }
}
