public class Sheep extends Animal{
    public Sheep(String nickname, String gender, int weight, int age) {
        super(nickname, gender, weight, age);
    }

    @Override
    public String toString() {
        return   "(------Sheep----)"+'\n'+
                "Name = " + nickname + '\n' +
                "Gender = " + gender + '\n' +
                "Weight = " + weight + '\n' +
                "Age = " + age + '\n'+
                "-----------------------------";
    }
}
