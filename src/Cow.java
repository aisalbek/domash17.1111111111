public class Cow extends Animal{
    public Cow(String nickname, String gender, int weight, int age) {
        super(nickname, gender, weight, age);
        int sotchik;
    }
    @Override
    public String toString() {

        return    "(------Cows----)"+'\n'+
                "Name = " + nickname + '\n' +
                "Gender = " + gender + '\n' +
                "Weight = " + weight + '\n' +
                "Age = " + age + '\n'+
                "-----------------------------";

    }
}
