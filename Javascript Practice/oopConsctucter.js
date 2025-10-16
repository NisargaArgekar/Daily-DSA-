class student {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
    study() {
        console.log("Studying");
    }

    eat() {
        console.log("eating");
    }
}

const s1 = new student("anu", 20);
    console.log(s1.name);
    console.log(s1.age);
    s1.study();
    s1.eat();

const s2 = new student("ram", 30);
    console.log(s2.name);
    console.log(s2.age);
    s2.study();
    s2.eat();
