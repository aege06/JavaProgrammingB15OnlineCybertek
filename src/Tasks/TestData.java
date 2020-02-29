package Tasks;

public class TestData {
        /*
        Name
        ID
         */
        private String Name="Aysegul";//the data is not visible to any other class
        private int ID=200;
    //getters: read the private data only
        public String getName(){
            return Name;
        }
        public int getID () {
            return ID;
        }
        //setters:modify the data
    public void setName(String Name){
            this.Name=Name;
    }
    public void setID(int ID){
            this.ID=ID;


    }

 }
