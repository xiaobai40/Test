package xiaobai;

public class Man
{
    private int id;
    private String name;

    public Man()
    {
    }
    public Man(int id,String name)
    {
        this.id = id;
        this.name = name;
//        System.out.printf("id=%d, name=%s",id,name);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "[ " +
                "id=" + id +
                ", name='" + name + '\'' +
                ']';
    }
}

