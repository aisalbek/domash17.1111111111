public abstract class Animal {
    String nickname,gender;
    int weight,age;
    public Animal(String nickname,String gender,int weight,int age) {
    this.age=age;
    this.weight=weight;
    this.gender=gender;
    this.nickname=nickname;
 }
    public int getWeight() {return weight;}
    public int getAge() {return age;}
    public String getGender() {return gender;}
    public String getNickname() {return nickname;}

    public void setAge(int age) {this.age = age;}
    public void setGender(String gender) {this.gender = gender;}
    public void setNickname(String nickname) {this.nickname = nickname;}
    public void setWeight(int weight) {this.weight=weight;}
}
