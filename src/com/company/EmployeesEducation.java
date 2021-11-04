package com.company;

public class EmployeesEducation {
    private int year;
    private int vasCount;
    private int vsCount;
    private int zakCount;
    private int soCount;
    private int usoCount;

    public EmployeesEducation(int year) {
        this.year = year;
        this.vasCount = 0;
        this.soCount = 0;
        this.vsCount = 0;
        this.zakCount = 0;
        this.usoCount = 0;
    }
    public float getEnployeeRation (String education){
        if (education.equals("VOS"))return  (float) this.vasCount / getCount()*100 ;
        else if (education.equals("VS"))return  (float) this.vsCount / getCount() *100;
        else if (education.equals("ZAK"))return  (float) this.zakCount / getCount() *100;
        else if (education.equals("SO"))return  (float) this.soCount / getCount() *100;
        else if (education.equals("USO"))return  (float) this.usoCount / getCount() *100;
        else return 0;
    }
    public int getCount(){
        return this.vasCount + vsCount + this.zakCount + this.soCount + this.usoCount;
    }
    public int getYear() {
        return year;
    }

    public int getVasCount() {
        return vasCount;
    }

    public int getVsCount() {
        return vsCount;
    }

    public int getZakCount() {
        return zakCount;
    }

    public int getSoCount() {
        return soCount;
    }

    public int getUsoCount() {
        return usoCount;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setVasCount(int vasCount) {
        this.vasCount = vasCount;
    }

    public void setVsCount(int vsCount) {
        this.vsCount = vsCount;
    }

    public void setZakCount(int zalCount) {
        this.zakCount = zalCount;
    }

    public void setSoCount(int soCount) {
        this.soCount = soCount;
    }

    public void setUsoCount(int usoCount) {
        this.usoCount = usoCount;
    }
}
