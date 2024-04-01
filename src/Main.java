public class Main {

        private static Employee[] employees = new Employee[10];

        public static void main(String[] args) {
            employees[0] = new Employee("Ivanov", 1, 34000);
            employees[1] = new Employee("sydorov", 2, 40000);
            employees[2] = new Employee("Aleshin", 3, 43000);
            employees[3] = new Employee("Agapov", 4, 48000);
            employees[4] = new Employee("Gricer", 5, 43000);
            employees[5] = new Employee("Trofimov", 1, 54000);
            employees[6] = new Employee("Shuls", 2, 43000);
            employees[7] = new Employee("Sergeev", 3, 63000);
            employees[8] = new Employee("Morosov", 4, 19000);
            employees[9] = new Employee("Voronin", 5, 24000);
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i]);
            }



            int totalSalary = salarySum();
            System.out.println("Total salary sum: " + totalSalary);


            int average = averageSumOfSalary();
            System.out.println("Средняя зп " + average + " рублей");

            Employee max = maxSum();
            System.out.println("Максимальная зарплата у сотрудника " + max);

            Employee min = minSum();
            System.out.println("Минимальная зарплата у " + min);

            printEmployeeNames();
        }

        public static int salarySum() {
            int sum = 0;
            for (int i = 0; i < employees.length; i = 1 + i) {
                sum += employees[i].getSalary();
            }
            return sum;
        }

        public static int averageSumOfSalary() {
            int sum = salarySum();
            int averageSum = sum / employees.length;
            return averageSum;

        }

        public static Employee maxSum() {
            Employee maxSum = employees[0];
            for (int i = 1; i < employees.length; i++)
                if (maxSum.getSalary() < employees[i].getSalary()) {
                    maxSum = employees[i];
                }
            return maxSum;
        }

        public static Employee minSum() {
            Employee minSum = employees[0];
            for (int i = 1; i < employees.length; i++) {
                if (minSum.getSalary() > employees[i].getSalary())
                    minSum = employees[i];
            }
            return minSum;
        }

        public static void printEmployeeNames() {
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i].getFullName());
            }
        }
    }
