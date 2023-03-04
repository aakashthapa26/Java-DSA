// // Non Parameterized Constructor

// public class TypesofConstructor {
//     public static void main(String args[]){

//     }
// }

// class Student {
//     Student(){  // Non Parameterized
//         System.out.println("Constructor is invoked...");
//     }
// }



// // Parameterized Constructor

// public class TypesofConstructor {
//     public static void main(String args[]){
//         Student s1 = new Student("Aakash");
//         System.out.println(s1.name);

//     }
// }

// class Student {
//     String name;
//     Student(String name){  // Parameterized
//         this.name = name;
//     }
// }



// Copy Constructor


public class TypesofConstructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Aakash";
        s1.roll = 123;
        s1.password = "abc";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);  // copy
        s2.password = "xyz";
        s1.marks[2] = 100;

        for(int i = 0; i<3 ; i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;  
    // }

    // deep copy constructor
    Student (Student s1){
        marks = new int [3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }

    }
    Student(){
        marks = new int[3];   

    }
}
