import java.util.ArrayList;

public class Backpack {
    private Integer numberOfPens;
    private Integer numberOfFolders;
    private Integer numberOfPencils;
    private ArrayList<String> items;
    private String name;

    public Backpack(String name, Integer numberOfPens, Integer numberOfFolders, Integer numberOfPencils) {
        this.name = name;
        this.numberOfPens = numberOfPens;
        this.numberOfFolders = numberOfFolders;
        this.numberOfPencils = numberOfPencils;
        this.items = new ArrayList<>();
    }
    //add item to backpack
    public void addItem(String item){
        if(item == "pen"){
            this.numberOfPens ++;
        } else if (item == "pencil"){
            this.numberOfPencils ++;
        } else if (item == "folder"){
            this.numberOfFolders ++;
        } else {
            this.items.add(item);
        }
    }
    public void removeItem(String item){
        if(item == "pen"){
            this.numberOfPens -= 1;
        } else if (item == "pencil"){
            this.numberOfPencils -= 1;
        } else if (item == "folder"){
            this.numberOfFolders -= 1;
        } else {
            items.remove(item);
        }
    }

    //pens getter and setter
    public Integer getNumberOfPens() {
        return numberOfPens;
    }

    //folders getter and setter
    public Integer getNumberOfFolders(){
        return numberOfFolders;
    }

    //pencils getter and stter
    public Integer getNumberOfPencils() {
        return numberOfPencils;
    }


    public void printInfo(){
        System.out.println("----------------------------------");
        System.out.println(this.name +  " has " + this.getNumberOfFolders() + " folders, " + this.getNumberOfPencils() + " pencils, and " + this.getNumberOfPens() + " pens");
        if(this.items.isEmpty()){
            return;
        } else {
            System.out.println("Here are some other things " + this.name + " has: " + this.items);
        }
        System.out.println("----------------------------------");

    }
}
