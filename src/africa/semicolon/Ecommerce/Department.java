package africa.semicolon.Ecommerce;

public class Department {
    private int departmentId;
    private String name;
    private String description;

    public void setDepartmentId(int departmentId){
        this.departmentId = departmentId;
    }
    public int getDepartmentId(){
        return departmentId;
    }

    public void setDepartmentname(String name){
        this.name = name;
    }
    public String getDepartmentname(){
        return name;
    }

    public void setDepartmentdescription(String description){
        this.description = description;
    }
    public String getDepartmentdescription(){
        return description;
    }
}
