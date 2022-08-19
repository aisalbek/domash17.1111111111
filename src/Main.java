public class Main {
    public static void main(String[] args) {
        Sheep sheep1=new Sheep("kara","erkek",20,22);
        Sheep sheep2=new Sheep("ala","erkek",20,22);
        Sheep sheep3=new Sheep("sary","erkek",20,22);
        Sheep[]sheep={sheep1,sheep2,sheep3};
        Horse horse1=new Horse("kuluk","kyz",100,21);
        Horse horse2=new Horse("Jorgo","kyz",100,21);
        Horse[]horses={horse1,horse2};
        Cow cow1 =new Cow("ala","er",300,12);
        Cow cow2 =new Cow("sary","er",300,13);
        Cow cow3 =new Cow("kashka","er",300,15);
        Cow cow4 =new Cow("kara","er",300,4);
        Cow[]cows={cow1,cow2,cow3,cow4};
        int sotchik;
        Farm farm=new Farm("Ala-Too","Topoz");
        System.out.println("-----------Farm #One-------------");
        System.out.println(farm);
        for (Sheep i:sheep) {
            System.out.println(i);}
        for (Cow a:cows) {
            System.out.println(a);}
        for (Horse j:horses) {
            System.out.println(j);}
        System.out.println("----------Farm #Two");
        Farm farm1=new Farm("Ala buka","kok-jar");
        System.out.println(farm1);
        System.out.println(cow1);
        System.out.println(sheep1);
        System.out.println(horse1);
        }
    }
