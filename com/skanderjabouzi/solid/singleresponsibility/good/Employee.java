package com.skanderjabouzi.solid.singleresponsibility.good

public class Employee {
    public class Employee{
        private String employeeId;
        private String name;
        private string address;
        private Date dateOfJoining;

        public void setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAddress(string address) {
            this.address = address;
        }

        public void setDateOfJoining(Date dateOfJoining) {
            this.dateOfJoining = dateOfJoining;
        }

        public String getEmployeeId() {
            return employeeId;
        }

        public String getName() {
            return name;
        }

        public string getAddress() {
            return address;
        }

        public Date getDateOfJoining() {
            return dateOfJoining;
        }
    }
}