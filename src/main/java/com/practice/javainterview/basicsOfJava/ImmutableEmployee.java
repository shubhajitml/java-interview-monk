package com.practice.javainterview.basicsOfJava;

public final class ImmutableEmployee {
   private final int empId;
   private final String empName;
   private final String department;
   private final int salaryInLPA;
   private final MutableAddress address;

   public ImmutableEmployee(int empId, String empName, String department,
                            int salaryInLPA, MutableAddress address){
      this.empId = empId;
      this.empName = empName;
      this.department = department;
      this.salaryInLPA = salaryInLPA;
      // perform deepcopy of mutable field AddressMutable
      this.address = new MutableAddress(address.getCity(), address.getPincode());
   }

   public int getEmpId(){ return empId; }

   public String getEmpName() {
      return empName;
   }

   public String getDepartment() {
      return department;
   }

   public int getSalaryInLPA() {
      return salaryInLPA;
   }

   public MutableAddress getAddress(){
      return new MutableAddress(address.getCity(), address.getPincode());
   }

   @Override
   public String toString() {
      return "ImmutableEmployee{" +
              "empId=" + empId +
              ", empName='" + empName + '\'' +
              ", department='" + department + '\'' +
              ", salaryInLPA=" + salaryInLPA +
              ", address=" + address +
              '}';
   }
}


