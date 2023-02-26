package TranChauLAB3;

public class Student {
    public String stID;
    public String stName;
    public String stClass;
    public Student()
    {}
    public Student(String stID ,String stName ,String stClass)
    {
     stID =this.stID;
     stName =this.stName;
     stClass =this.stClass;
    }
    public Student(Student st)
    {
     st.stName=this.stName;
     st.stClass=this.stClass;
     st.stID=this.stID;
    }

    public String getStID() {
        return stID;
    }

    public void setStID(String stID) {
        this.stID = stID;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStClass() {
        return stClass;
    }

    public void setStClass(String stClass) {
        this.stClass = stClass;
    }

    @Override
    public String toString() {
        return "Student{" + "stID=" + stID + ", stName=" + stName + ", stClass=" + stClass + '}';
    }
    
}
