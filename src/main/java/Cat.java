public class Cat {
    private int age;
    private String name;
    private int id;
    private static int idcounter = 0;

    public Cat() {id = idcounter+1; idcounter++;}

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "\nID:"+id+"\nAge: "+age+"\nName: "+name+"\n";
    }
}
