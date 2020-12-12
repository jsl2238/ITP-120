package com.spoop.classes;

import com.spoop.enums.Errors;

public class Employee
{
    private String employeeName;
    private String empNum;
    private String hireDate;

    // Default Constructor
    public Employee()
    {
        this.employeeName = "";
        this.empNum = "";
        this.hireDate = "";
    }

    // Constructor
    public Employee(String name, String empNum, String hireDate)
    {
        this.employeeName = name;
        this.empNum = empNum;
        this.hireDate = hireDate;
    }

    // Copy Constructor
    public Employee(Employee worker)
    {
        this.employeeName = worker.employeeName;
        this.empNum = worker.empNum;
        this.hireDate = worker.hireDate;
    }

    public String getEmployeeName()
    {
        return employeeName;
    }

    public String getHireDate()
    {
        return hireDate;
    }

    public String getEmpNum()
    {
        return empNum;
    }

    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }

    public void setEmpNum(String empNum)
    {
        this.empNum = empNum;
    }

    public void setHireDate(String hireDate)
    {
        this.hireDate = hireDate;
    }

    public Errors checkEmpNum()
    {
        // Checks for each variable
        boolean check1 = false;
        boolean check2 = false;

        // Placeholder for any error to be reported
        Errors error = Errors.PASSED;

        if (empNum.length() == 5)
        {
            // Split the String into tokens
            String[] tokens = empNum.split("-");

            // Separate the tokens into two arrays
            char[] array1 = tokens[0].toCharArray();
            char[] array2 = tokens[1].toCharArray();

            for (char a : array1)
            {
                if (Character.isLetter(a))
                {
                    error = Errors.NUMBER_VIOLATION;
                    break;
                }
            }

            for (char a : array2)
            {
                if (Character.isLetter(a))
                {
                    if (Character.getNumericValue(a) >= 10 && Character.getNumericValue(a) <= 22)
                    {
                        check2 = true;
                    } else { error = Errors.INVALID_CHARACTER; check2 = false; break; }
                }

                if (Character.isDigit(a) || Character.isLowerCase(a))
                {
                    check2 = false;
                    error = Errors.UPPERCASE_CHARACTER_VIOLATION;
                    break;
                }
            }
        } else { error = Errors.INVALID_ENTRY; }

        return error;
    }
}