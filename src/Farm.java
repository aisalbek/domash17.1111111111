public class Farm {
    String addres, ownerName;
    String[]sheep;
    String[]cows;
    String[]horses;
    public Farm(String addres, String ownerName) {
        this.addres = addres;
        this.ownerName = ownerName;
 }
    public String getAddres() {return addres;}
    public String getOwnerName() {return ownerName;}
    public void setAddres(String addres) {this.addres = addres;}
    public void setOwnerName(String ownerName) {this.ownerName = ownerName;}
    @Override
    public String toString() {
        return
        "Adres = " + addres + '\n' +
        "Farm name = " + ownerName + '\n'+
        "---------------------------------";

    }
 }

