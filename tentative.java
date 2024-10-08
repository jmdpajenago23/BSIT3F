public class tentative implements grade {
    

    private void setMark (double grade){
        if (grade >= 75) {
            System.out.println("Remarks: Passed");
        } else {
            System.out.println("Remarks: Failed");
        }
    }

    @Override
    public void compute(){
        double grade = ((90*.40) + (92*.30) + (95*.30));
            System.out.println("Midterm:" + grade);
           setMark (grade); 
    
    

    }
}