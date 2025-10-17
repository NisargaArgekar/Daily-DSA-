// Parent class
class Animal {
  constructor(name) {
    this.name = name; // 'this' refers to Animal instance
  }

  speak() {
    console.log(`${this.name} makes a sound`);
  }
}

// Child class
class Dog extends Animal {
  constructor(name, breed) {
    super(name); // calls parent constructor (Animal)
    this.breed = breed; // 'this' refers to Dog instance
  }

  speak() {
    super.speak(); // calls Animal's speak()
    console.log(`${this.name} barks`);
  }

  showDetails() {
    console.log(`Name: ${this.name}, Breed: ${this.breed}`);
  }
}

// Create object
const dog1 = new Dog("Buddy", "Golden Retriever");

dog1.showDetails(); // Name: Buddy, Breed: Golden Retriever
dog1.speak();
// Output:
// Buddy makes a sound
// Buddy barks
//super() - super constructor call parent class constructor
//super. - super keyword point to parent class
//this - keyword point to current object