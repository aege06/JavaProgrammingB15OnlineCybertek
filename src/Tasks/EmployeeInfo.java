package Tasks;

public class EmployeeInfo {
    /*name
    SSN
    Age
    Salary
     */

   private String Name;
   private long SSN;
   private byte Age;
   private double Salary;

      //name
   public void setName(String Name){
       this.Name=Name;

   }
   public String getName(){
       return Name;
   }
   //SSN

    public long getSSN() {
        return SSN;
    }
    public void setSSN(long SSN){
       this.SSN=SSN;
    }
    //Age

    public byte getAge() {
        return Age;
    }
    public void setAge(byte Age){
       this.Age=Age;

    }
    //salary
    public double getSalary(){
       return Salary;
    }
    public void setSalary(double Salary){
       this.Salary=Salary;
    }
    //setInfo
    public void setInfo(String name,long SSN,byte Age,double Salary){
       setName(Name);
       setSSN(SSN);
       setAge(Age);
       setSalary(Salary);

    }
}
