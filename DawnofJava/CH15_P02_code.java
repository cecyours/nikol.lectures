
 class sarray {
    public static void main(String[] args) {
        Student_data students[] = new Student_data[12];

        students[0] = new Student_data("Sneha", "English", 29.0);
        students[1] = new Student_data("Milo", "Science", 22.5);
        students[2] = new Student_data("Padma", "Maths", 28.0);
        students[3] = new Student_data("Parvati", "Science", 26.7);
        students[4] = new Student_data("Liya", "English", 25.8);
        students[5] = new Student_data("Alana", "SST", 27.9);
        students[6] = new Student_data("Aliya", "Science", 26.0);
        students[7] = new Student_data("Disha", "Science", 28.2);
        students[8] = new Student_data("Prisha", "SST", 27.5);
        students[9] = new Student_data("Apsara", "SST", 15.9);
        students[10] = new Student_data("Helena", "English", 14.8);
        students[11] = new Student_data("Sneha", "Maths", 24.0);

        System.out.println("\n-------------------------------------- Filtered by Subject --> English --------------------------------------\n");
        for(Student_data s: students){
            if(s.getsSub().contains("English")){
                System.out.println(s);
            }
        }

        System.out.println("\n--------------------------------------- Filtered by Subject --> Maths ---------------------------------------\n");
        for (Student_data s : students) {
            if(s.getsSub().contains("Maths")){
                System.out.println(s);
            }
        }

        System.out.println("\n-------------------------------------- Filtered by Subject --> Science --------------------------------------\n");
        for (Student_data s : students) {
            if(s.getsSub().contains("Science")){
                System.out.println(s);
            }
        }

        System.out.println("\n---------------------------------------- Filtered by Subject --> SST ----------------------------------------\n");
        for (Student_data s : students) {
            if(s.getsSub().contains("SST")){
                System.out.println(s);
            }
        }

        System.out.println("\n-------------------------------------------------------------------------------------------------------------\n");

        System.out.println("\n----------------------------------------- Sorted According to Marks -----------------------------------------\n");
      
        for(int i=0;i<students.length;i++)
        {
            for(int j=i+1;j<students.length;j++)
            {
                if(students[i].getsMarks()<students[j].getsMarks())
                {
                    Student_data temp = students[i];
                    students[i] = students[j];
                    students[j] = temp; 
                }
            }
        }

        // display : 
        for(Student_data s: students)
        {
            System.out.println(s);
        }
    }
    
}   

class Student_data {
    static int currentId = 0;

    private int sId;
    private String sName;
    private String sSub;
    private double sMarks;

    public Student_data(String sName, String sSub, double sMarks) {
        this.sId = currentId++;
        this.sName = sName;
        this.sSub = sSub;
        this.sMarks = sMarks;
    }

    public int getsId() {
        return sId;
    }

    public void setpId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSub() {
        return sSub;
    }

    public void setsSub(String sSub) {
        this.sSub = sSub;
    }

    public double getsMarks() {
        return sMarks;
    }

    public void setsMarks(double sMarks) {
        this.sMarks = sMarks;
    }

    @Override
    public String toString() {
        return "Product{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sSub=" + sSub +
                ", sMarks='" + sMarks + '\'' +
                '}';
    }
}
