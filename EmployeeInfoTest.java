// package Crude1;

import java.util.*;

 class EmployeeInfoTest {
    private static String empBank;

    public static void main(String[] args) {
        List<Employee> c = new ArrayList<Employee>();
        try (Scanner s = new Scanner(System.in)) {
            try (Scanner s1 = new Scanner(System.in)) {
                int ch;
                do {
                    System.out.println("1. Insert");
                    System.out.println("2.Display");
                    System.out.println("3.Search");
                    System.out.println("4.Delete");
                    System.out.println("5.Update");
                    System.out.println("Enter your Choice : ");

                    ch = s.nextInt();
                    switch (ch) {
                        case 1:
                            System.out.print("Enter Employee Id :");
                            int empId = s.nextInt();
                            System.out.print("Enter Employee Name :");
                            String empName = s1.nextLine();
                            System.out.print("Enter Employee Designation :");
                            String empDesignation = s1.nextLine();
                            System.out.print("Enter Employee Branch Name :");
                            String empBranchName = s1.nextLine();
                            System.out.print("Enter Employee Bank Name :");
                            String empBankName = s1.nextLine();

                            c.add(new Employee(empId, empName, empDesignation, empBranchName, empBankName));
                            break;
                        case 2:
                            System.out.println("-----------------");
                            Iterator<Employee> i = c.iterator();
                            while (i.hasNext()) {
                                Employee e = i.next();
                                System.out.println(e);
                            }
                            System.out.println("-----------------");
                            break;
                        case 3:
                            boolean found = false;
                            System.out.print("Enter EmpId to Search :");
                            int eId = s.nextInt();
                            System.out.println("-----------------");
                            i = c.iterator();
                            while (i.hasNext()) {
                                Employee e = i.next();
                                if (e.getEmpId() == eId)
                                    System.out.println(e);
                                found = true;
                            }
                            if (!found) {
                                System.out.println("Employee Not Found");

                            }
                            System.out.println("-----------------");
                            break;
                        case 4:
                            found = false;
                            System.out.println("Enter EmpId to Delete :");
                            eId = s.nextInt();
                            System.out.println("-----------------");
                            i = c.iterator();
                            while (i.hasNext()) {
                                Employee e = i.next();
                                if (e.getEmpId() == eId) {
                                    i.remove();
//                    System.out.println(e);
                                    found = true;
                                }
                            }

                            if (!found) {
                                System.out.println("Employee Not Found");

                            } else {
                                System.out.println("Record is deleted SuccessFully....!");

                            }
                            System.out.println("-----------------");

                            break;

                        case 5:
                            found = false;
                            System.out.println("Enter EmpId to Update :");
                            eId = s.nextInt();

                            ListIterator<Employee> li = c.listIterator();
                            while (li.hasNext()) {
                                Employee e = li.next();
                                if (e.getEmpId() == eId) {
                                    System.out.print("Enter New Name :");
                                    empName = s1.nextLine();
                                    System.out.print("Enter New Designation :");
                                    empDesignation = s1.nextLine();
                                    System.out.print("Enter the Bank Name ");
                                    empBank = s1.nextLine();
                                    System.out.println(e);
                                    li.set(new Employee( eId,empName, empDesignation, empBank, empName));
                                    found = true;
                                }
                            }

                            if (!found) {
                                System.out.println("Employee Not Found");

                            } else {
                                System.out.println("Record is Updated SuccessFully....!");

                            }
                            System.out.println("-----------------");

                            break;
                    }
                    
                }while (ch != 0);
            }
        }

    }
            }




