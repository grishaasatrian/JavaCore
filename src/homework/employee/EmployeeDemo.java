package homework.employee;

import homework.employee.model.Company;
import homework.employee.model.Employee;
import homework.employee.storage.CompanyStorage;
import homework.employee.storage.EmployeeStorage;
import homework.employee.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        Company company = new Company("company001", "company example", "Gyumri", "1234567");
        company.setEmployeeCount(3);
        companyStorage.add(company);
        employeeStorage.add(new Employee("Poxos", "Poxosyan", "a001", 100, company, "Jr.manager", new Date(), DateUtil.stringToDate("04/02/1998")));
        employeeStorage.add(new Employee("Petros", "Poxosyan", "a002", 200, company, "manager", new Date(), DateUtil.stringToDate("04/02/1994")));
        employeeStorage.add(new Employee("Martiros", "Poxosyan", "a003", 300, company, "Sr.manager", new Date(), DateUtil.stringToDate("02/02/1998")));
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case ADD_COMPANY:
                    addCompany();
                    break;
                case PRINT_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    getEmployeeById();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_ID:
                    companyStorage.print();
                    System.out.println("Please input company id");
                    String companyId = scanner.nextLine();
                    Company companyById = companyStorage.getCompanyById(companyId);
                    if (companyById != null) {
                        employeeStorage.searchEmployeeByCompany(companyById);
                    } else {
                        System.out.println("Company does not exists!");
                    }
                    break;
                case SEARCH_EMPLOYEE_BY_SALARY_RANGE:
                    searchEmployeeBySalaryRange();
                    break;
                case CHANGE_EMPLOYEE_POSITION:
                    changePositionByEmployeeId();
                    break;
                case PRINT_ONLY_ACTIVE_EMPLOYEES:
                    employeeStorage.printByStatus(true);
                    break;
                case INACTIVATE_EMPLOYEE_BY_ID:
                    inactivateEmployee();
                    break;
                case ACTIVATE_EMPLOYEE_BY_ID:
                    activateEmployee();
                    break;
                case PRINT_ALL_COMPANIES:
                    companyStorage.print();
                    break;
                default:
                    System.out.println("Wrong command. Please try again!");
            }
        }
    }

    private static void addCompany() {
        System.out.println("Please input id, name, address, phoneNumber");
        String companyDataStr = scanner.nextLine();
        String[] companyData = companyDataStr.split(",");
        String companyId = companyData[0];
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById == null) {
            Company company = new Company(companyId, companyData[1], companyData[2], companyData[3]);
            companyStorage.add(company);
            System.out.println("Company was added!");
        } else {
            System.out.println("Company with " + companyId + " already exists!");
        }
    }

    private static void activateEmployee() {
        employeeStorage.printByStatus(false);
        System.out.println("Please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null || employee.isActive()) {
            System.out.println("Wrong employee ID, or employee is active. please try again!");
        } else {
            employee.setActive(true);
            System.out.println("Status changed!");
        }
    }

    private static void inactivateEmployee() {
        employeeStorage.printByStatus(true);
        System.out.println("Please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null || !employee.isActive()) {
            System.out.println("Wrong employee ID, or employee is inactive. please try again!");
        } else {
            employee.setActive(false);
            System.out.println("Status changed!");
        }
    }

    private static void changePositionByEmployeeId() {
        employeeStorage.printByStatus(true);
        System.out.println("Please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("Wrong employee ID, please try again!");
        } else {
            System.out.println("Please input new position name");
            String position = scanner.nextLine();
            employee.setPosition(position);
            System.out.println("Position changed!");
        }
    }

    private static void searchEmployeeBySalaryRange() {
        System.out.println("Please input minPrice,maxPrice");
        String salaryRangeStr = scanner.nextLine();
        String[] salaryRange = salaryRangeStr.split(",");
        try {
            double minPrice = Double.parseDouble(salaryRange[0]);
            double maxPrice = Double.parseDouble(salaryRange[1]);
            if (maxPrice < minPrice) {
                System.out.println("minPrice should be less then maxPrice");
                return;
            }
            employeeStorage.searchBySalaryRange(minPrice, maxPrice);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect number values, please try again");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please input min and max salary.");
        }
    }

    private static void getEmployeeById() {
        System.out.println("Please input employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("employee with " + employeeId + " id does not exists");
        } else {
            System.out.println(employee);
        }
    }

    private static void addEmployee() throws ParseException {
        if (companyStorage.getSize() == 0) {
            System.out.println("Please add company first!");
            return;
        }
        companyStorage.print();
        System.out.println("Please choose company id");
        String companyId = scanner.nextLine();
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById != null) {
            System.out.println("Please input name, surname, employeeId, salary, position, dateOfBirthday(15/02/2023)");
            String employeeDataStr = scanner.nextLine();
            String[] employeeData = employeeDataStr.split(",");
            String employeeId = employeeData[2];
            Employee employeeById = employeeStorage.getEmployeeById(employeeId);
            if (employeeById == null) {
                Employee employee = new Employee(employeeData[0], employeeData[1],
                        employeeId, Double.parseDouble(employeeData[3]), companyById,
                        employeeData[4], new Date(), DateUtil.stringToDate(employeeData[5]));
                employeeStorage.add(employee);
                companyById.setEmployeeCount(companyById.getEmployeeCount() + 1);
                System.out.println("Employee was added!");
            } else {
                System.out.println("Employee with" + employeeId + "id already exists");
            }
        } else {
            System.out.println("Wrong company id! please try again!");
        }
    }
}