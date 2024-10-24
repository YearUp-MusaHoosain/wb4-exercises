package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void punchIn_EmployeeCanPunchIn_ReturnPunchInTime(){
        // arrange
        Employee employee = new Employee(1, "Musa", "Tech", 10, 15);

        // act
        employee.punchIn();

        // assert
        assert

    }

}