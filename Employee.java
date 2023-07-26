

// import java.security.PrivateKey;

 class Employee {
    private int empId;
    private String empName;
    private String empDesignation;
    private String empBranchName;
    private String empBankName;

    Employee(int empId,String empName,String empDesignation,String empBranchName,String empBankName){
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empBranchName = empBranchName;
        this.empBankName = empBankName;
    }
    public int getEmpId (){
        return empId;
    }
    public void setEmpId(final int empId)   
    {  
        this.empId = empId;  
    }  
    public String getEmpName (){
        return empName;
    }
    public void setEmpName(final String empName)   
    {  
        this.empName = empName;  
    }  
    public String getEmpDesignation (){
        return empDesignation;
    }
    public void setDesignation(final String empDesignation)   
    {  
        this.empDesignation = empDesignation;  
    }  
    public String getEmpBranchName (){
        return empBranchName;
    }
    public void setEmpBranchName(final String empBranchName)   
    {  
        this.empBranchName = empBranchName;  
    }  
    public String getEmpBankName (){
        return empBankName;

    }
    public void setEmpBankName(final String empBankName)   
    {  
        this.empBankName = empBankName;  
    }  
    public String toString (){
        return empId + " " + empName + " " + empDesignation + " " + empBranchName + " " +empBankName;
    }

}
