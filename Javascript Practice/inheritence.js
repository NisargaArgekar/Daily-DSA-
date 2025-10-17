class Employee {
  constructor(empId, empName, empSalary) {
    this.empId = empId;
    this.empName = empName;
    this.empSalary = empSalary;
  }
  //Inherited
  work() {
    console.log(`${this.empName} is working.`);
  }
  project() {
    console.log(`${this.empName} is working on a project.`);
  }
}
class Developer extends Employee {
    //Overriden method
  project() {
    console.log(`${this.empName} is coding as Developer.`);
  }
  //Specilized
  infoDeveloper() {
    console.log(`The Developer name is ${this.empName}, 
        id is ${this.empId} and salary is ${emp1.empSalary}!`);
  }
}
class Tester extends Employee {
    //overridden
  project() {
    console.log(`${this.empName} is testing the application.`);
  }
  //specialized
  infoTester() {
    console.log(`The Tester name is ${this.empName}, 
        id is ${this.empId} and salary is ${emp1.empSalary}!`);
  }
}

const emp1 = new Developer(101, "Ram", 70000);
emp1.work();      
emp1.project();   
emp1.infoDeveloper();     
const emp2 = new Tester(102, "Sita", 45000);
emp2.work();     
emp2.project();   
emp2.infoTester();