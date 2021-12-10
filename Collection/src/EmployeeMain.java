import java.util.LinkedList;

public class EmployeeMain {
    public static void sorting(LinkedList<Employee> e){
        for(int i=0;i<e.size();i++){
            for(int j=i+1;j<e.size();j++){
                if(e.get(i).getEmplSal()>e.get(j).getEmplSal()){
                    Employee temp=e.get(j);
                    e.remove(j);
                    e.addFirst(temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        LinkedList<Employee> e=new LinkedList<>();
        Employee e1=new Employee(3,"Komal",4000);
        Employee e2=new Employee(1,"Sonali",44444);
        Employee e3=new Employee(5,"jkdjkd",890);
        e.add(e1);
        e.add(e2);
        e.add(e3);
        sorting(e);
        for(int i=0;i<e.size();i++){
            System.out.println(e.get(i).getEmplSal());
        }
    }
}
