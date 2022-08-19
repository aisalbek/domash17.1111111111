public class Horse extends Animal {
    public Horse(String nickname, String gender, int weight, int age) {
        super(nickname, gender, weight, age);
    }
    @Override
    public String toString() {
        return     "(------Horse----)"+'\n'+
                "Name = " + nickname + '\n' +
                "Gender = " + gender + '\n' +
                "Weight = " + weight + '\n' +
                "Age = " + age + '\n'+
                "-----------------------------";

    }
}


