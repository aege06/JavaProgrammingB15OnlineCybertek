package Tasks;

class Data{

    public String name;
    private String age;
    String ID;
    public void Hello(){
        System.out.println("Hello");
    }
    private void Hola(){
        System.out.println("Hola");
    }
    void Aloha(){
        System.out.println("Aloha");
    }

}

public class MultiClassPractices {
    public static void main(String[] args) {
        Data obj=new Data();
        System.out.println(obj.name);
        System.out.println(obj.ID);
        obj.Hello();
        obj.Aloha();
    }

}
