package Tugas.Tugas1;

public class EncapDemo {//Andreagazy Iza Amerianto
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int newAge) {
        if (newAge>30) {
            age = 30;
        }else if (age<18) {
            age= 18;
        }else{

            age = newAge;
        }
    }
}
