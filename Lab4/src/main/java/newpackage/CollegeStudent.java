/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
class CollegeStudent extends Student{
    private double gradScore;
    static Scanner sc = new Scanner(System.in);

    public CollegeStudent(){
    }

    public CollegeStudent(double graduationExamScore) {
        super();
        this.gradScore = graduationExamScore;
    }

    @Override
    public void Input(){
        super.Input();
        System.out.print("Enter graduation exam score: ");
        gradScore = sc.nextDouble();
    }


    @Override
    public boolean isEligibleForGraduation() {
        return creditsEarned >= 100 && avgScore >= 5 && gradScore >= 5;
    }

    public void setGradScore(double gradScore) {
        this.gradScore = gradScore;
    }
}
